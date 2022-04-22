package Lecture05_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P05_3 {
	
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //������� ���� ����

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
		System.out.printf("���� : %s\n", sdt.format(calt.getTime()));		

		File f1 = new File("C:\\Users\\local pc\\Desktop\\�ǽ�������\\day_data.StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f1));
		
		File f2 = new File("C:\\Users\\local pc\\Desktop\\�ǽ�������\\A005930.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));		
		
		String k31_readCsv;	// File�� �о ������ Stirng ����
		int k31_cnt = 0;
		
		while ((k31_readCsv = br.readLine()) != null) { //br.readLine�� �о ������ readtxt�� ������� �ʴٸ�
			String[] k31_csvField = k31_readCsv.split(",");		//StringBuffer k31_s ��ü����	
			if(k31_csvField[2].equals("A005930") == true) { //csvFiled[2]���� A005930 �� �����ϸ�
				bw.write(k31_readCsv.toString()); //readCsv���� String���� ���Ͼ���
				bw.newLine(); //���ο� ��
				k31_cnt ++; //ī��Ʈ �߰�
			}			
		}
		
		br.close();
		System.out.println("Program End\n" + "total record count : " + k31_cnt);
		
		
		Calendar calt2 = Calendar.getInstance(); //Calendar �޼ҵ� ����
		System.out.printf("���� : %s\n", sdt.format(calt2.getTime()));
		bw.close();		

	}

}
