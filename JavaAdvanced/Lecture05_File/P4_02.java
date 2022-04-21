package Lecture05_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P4_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\local pc\\Desktop\\���������������.CSV");
		BufferedReader br = new BufferedReader(new FileReader(f));

		String k31_readtxt; // ���ϟ� �о �Է½�ų 1 line String ���� ����
		
		Path path = Paths.get("C:\\Users\\local pc\\Desktop\\���������������.CSV");		
		
		int k31_fileLineCnt = (int) Files.lines(path, Charset.defaultCharset()).count();
		
		if ((k31_readtxt = br.readLine()) == null) {
			System.out.println("�� �����Դϴ�.");
			return;
		}
		
		String[] k31_field_name = k31_readtxt.split(",");
		
		double[] distArr = new double[k31_fileLineCnt-1];

		double k31_lat = 37.3860521; // ����
		double k31_lng = 127.1214038; // �浵
		
		double distMax = 0;
		double distMin = 10;
		String MaxAddress = "";
		String MinAddress = "";
		String a = "";
		String b = "";
		double c = 0;

		while ((k31_readtxt = br.readLine()) != null) {

			String[] k31_field = k31_readtxt.split(",");
			double k31_dist = Math.sqrt( Math.pow(Double.parseDouble(k31_field[13]) - k31_lat, 2)
					+ Math.pow(Double.parseDouble(k31_field[14]) - k31_lng, 2));
			
			if (k31_dist > distMax) {
				distMax = k31_dist;
				MaxAddress= k31_field[9];
				a = k31_field[13];
				b = k31_field[14];
				c = k31_dist;
			} else if (k31_dist < distMin) {
				distMin = k31_dist;
				MinAddress= k31_field[9];
			}
		}
		
		System.out.println("�ִ�Ÿ�(�ּ�) : " + MaxAddress);
		
		System.out.printf("�ִ�Ÿ�(��) : %4.4fkm\n", distMax*100);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
		
		System.out.println("�ּҰŸ�(�ּ�) : " + MinAddress);
		System.out.printf("�ּҰŸ�(��) : %4.4fkm\n", distMin * 100);

		br.close();

	}

}
