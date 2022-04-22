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

public class P05_4 {
	
	static Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //������� ���� ����

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
		System.out.printf("���� : %s\n", sdt.format(calt.getTime())); //���� �ð� ���	
		
		File f1 = new File("C:\\Users\\local pc\\Desktop\\�ǽ�������\\day_data.StockDailyPrice.csv"); //read�� ���ϰ�� ����
		BufferedReader br = new BufferedReader(new FileReader(f1)); //bufferReader ��ü ���� 
		
		File f2 = new File("C:\\Users\\local pc\\Desktop\\�ǽ�������\\20120314.csv"); //write�� ���ϰ�� ����
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));	//bufferWriter ��ü ����
		
		String k31_readCsv;	// File�� �о ������ Stirng ���� 
		int k31_cnt = 0; // �а� �� ������ count�� ���� ���� �� �ʱ�ȭ
		
		while ((k31_readCsv = br.readLine()) != null) { // readcsv br.readLine�Ͽ� readCsv�� ���������� ���� �ִٸ� �Ʒ��� ��� �ݺ�
			String[] k31_csvField = k31_readCsv.split(",");	// String �迭 csvFiled�� readCsv������ ,�� �и��Ͽ� �迭 �Է�
			if(k31_csvField[1].equals("20120314") == true) { //�迭 index 1�� ���ڿ� "20120314"�� �ִٴ°��� True���
				bw.write(k31_readCsv.toString()); //bw�ض� readCsv�� string ���·�
				bw.newLine(); //bw ���ο� ���� ����
				k31_cnt ++; // ������ count 1����
			}			
		}
		
		br.close(); //read�� ���� �ݱ�
		System.out.println("Program End\n" + "total record count : " + k31_cnt); // ���α׷� ���� �˸�, ������ ���� �˸�
		
		
		Calendar calt2 = Calendar.getInstance(); //Calendar �޼ҵ� ����
		System.out.printf("���� : %s\n", sdt.format(calt2.getTime())); //���� �ð� ���
		bw.close();		//Write�� ���� �ݱ�

	}

}
