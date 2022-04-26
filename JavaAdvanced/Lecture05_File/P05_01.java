package Lecture05_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P05_01 {
	
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //������� ���� ����

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
		System.out.printf("���� : %s\n", sdt.format(calt.getTime()));
		File f = new File("C:\\Users\\local pc\\Desktop\\�ǽ�������\\day_data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String k31_readtxt;
		int k31_LineCnt = 0;
		int k31_n = -1;
		StringBuffer k31_s = new StringBuffer();
		while (true) {
			char[] ch = new char[1000];
			k31_n = br.read(ch);
			
			if (k31_n == -1) break;
			
			for (char c : ch) {
				if (c == '\n') {
					System.out.printf("[%s]***\n", k31_s.toString());
					k31_s.delete(0, k31_s.length());
				} else {
					k31_s.append(c);
				}
			}
			k31_LineCnt ++;
		}
		System.out.printf("[%s]***\n", k31_s.toString());
		br.close();
		
		Calendar calt2 = Calendar.getInstance(); //Calendar �޼ҵ� ����
		System.out.printf("���� : %s\n", sdt.format(calt2.getTime()));
	}

}