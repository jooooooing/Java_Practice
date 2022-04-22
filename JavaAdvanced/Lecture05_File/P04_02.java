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

public class P04_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\local pc\\Documents\\īī���� ���� ����\\12_04_07_E_���������������_��⵵_��.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));

		String k31_readtxt; // ���ϟ� �о �Է½�ų 1 line String ���� ����
		
		Path path = Paths.get("C:\\Users\\local pc\\Documents\\īī���� ���� ����\\12_04_07_E_���������������_��⵵_��.txt");		
		
		int k31_fileLineCnt = (int) Files.lines(path, Charset.defaultCharset()).count(); //�迭 ���̸� ���� �� ���� ���
		
		if ((k31_readtxt = br.readLine()) == null) { // ������ readLine������ line�� ����ִٸ�
			System.out.println("�� �����Դϴ�."); // �������Դϴ� ���
			return;
		}
		
		String[] k31_field_name = k31_readtxt.split("\t"); //String �迭 = readtxt�� ������ �и��Ͽ� ����
		
		double[] distArr = new double[k31_fileLineCnt-1]; //�Ÿ��� �迭 ����

		double k31_lat = 37.3860521; // ������ġ ����
		double k31_lng = 127.1214038; // ������ġ �浵
		
		double distMax = 0; //�ִ밪 ����� ���� ���� ���� �� �ʱ�ȭ
		double distMin = 10; //�ּҰ� ����� ���� ���� ���� �� �ʱ�ȭ
		String MaxAddress = ""; //�ִ밪 �ּ��� ���� ���� ���� �� �ʱ�ȭ
		String MinAddress = ""; //�ּҰ� �ּ��� ���� ���� ���� �� �ʱ�ȭ


		while ((k31_readtxt = br.readLine()) != null) { // �о�帰 readtxt�� ������� �ʴٸ� 

			String[] k31_field = k31_readtxt.split("\t"); //String �迭 readtxt ������ �и��Ͽ� ����
			double k31_dist = Math.sqrt( Math.pow(Double.parseDouble(k31_field[13]) - k31_lat, 2) // �Ÿ� ��� ��Ÿ��� ����
					+ Math.pow(Double.parseDouble(k31_field[14]) - k31_lng, 2));
			
			if (k31_dist > distMax) { //�ִ밪�� ���� ����
				distMax = k31_dist; 
				MaxAddress= k31_field[9];
			} else if (k31_dist < distMin) { //�ּҰ��� ���� ����
				distMin = k31_dist;
				MinAddress= k31_field[9];
			}
		}
		
		System.out.println("�ִ�Ÿ�(�ּ�) : " + MaxAddress);		
		System.out.printf("�ִ�Ÿ�(��) : %4.4fkm\n", distMax*100);		
		System.out.println("�ּҰŸ�(�ּ�) : " + MinAddress);
		System.out.printf("�ּҰŸ�(��) : %4.4fkm\n", distMin * 100);

		br.close();
	}
}
