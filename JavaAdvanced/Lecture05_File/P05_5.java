package Lecture05_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P05_5 {
	
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //������� ���� ����
	static DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // �޸���� �޼ҵ�

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����		
		System.out.printf("���� : %s\n", sdt.format(calt.getTime())); //���� �ð� ���	
		
		File f1 = new File("C:\\Users\\local pc\\Desktop\\�ǽ�������\\day_data.StockDailyPrice.csv"); //read�� ���ϰ�� ����
		BufferedReader br = new BufferedReader(new FileReader(f1)); //bufferReader ��ü ���� 
		
		File f2 = new File("C:\\Users\\local pc\\Desktop\\�ǽ�������\\samsung2015.csv"); //write�� ���ϰ�� ����
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));	//bufferWriter ��ü ����
		
		String k31_readCsv;	// File�� �о ������ Stirng ���� 
		int k31_cnt = 0; // �а� �� ������ count�� ���� ���� �� �ʱ�ȭ
		int k31_Max = 0, k31_Min = 9999999; // max, min ���� ���� �� �ʱ�ȭ (max�� ���� �۰� min �� �ִ��� ũ��)
		int k31_Maxday = 0;
		int k31_Minday = 0;
		
		while ((k31_readCsv = br.readLine()) != null) { // readcsv br.readLine�Ͽ� readCsv�� ���������� ���� �ִٸ� �Ʒ��� ��� �ݺ�
			String[] k31_csvField = k31_readCsv.split(",");	// String �迭 csvFiled�� readCsv������ ,�� �и��Ͽ� �迭 �Է�
			if(k31_csvField[1].contains("2015") == true && k31_csvField[2].equals("A005930")) { //�迭 index 1�� ���ڿ� "2015"�� �ְ� and index 2��"A005930"�� �ִٸ�
				bw.write(k31_readCsv.toString()); //bw�ض� readCsv�� string ���·�
				bw.newLine(); //bw ���ο� ���� ����
				k31_cnt ++; // ������ count 1����
				
				if (Integer.parseInt(k31_csvField[3]) > k31_Max) { // Max���� csvField[3]������ ������
					k31_Max = Integer.parseInt(k31_csvField[3]); //  Max�� csvField[3]�� �Է�
					k31_Maxday = Integer.parseInt(k31_csvField[1]);
				} else if (Integer.parseInt(k31_csvField[3]) < k31_Min) { //Min���� csvField[3]������ ũ��
					k31_Min = Integer.parseInt(k31_csvField[3]); // Min�� csvField[3]�� �Է�
					k31_Minday = Integer.parseInt(k31_csvField[1]);
				}
			}			
		}
		
		br.close(); //read�� ���� �ݱ�
		System.out.println("Program End\n" + "total record count : " + k31_cnt); // ���α׷� ���� �˸�, ������ ���� �˸�
		System.out.println("MaxDay :" + k31_Maxday);
		System.out.println("Max :" + df.format(k31_Max)); //max �� ���
		System.out.println("Max :" + df.format(k31_Max/50)); //max �� ���
		
		System.out.println("MinDay :" + k31_Minday);
		System.out.println("Min :" + df.format(k31_Min)); //min �� ���
		System.out.println("Min :" + df.format(k31_Min/50)); //min �� ���
		Calendar calt2 = Calendar.getInstance(); //Calendar �޼ҵ� ����
		System.out.printf("���� : %s\n", sdt.format(calt2.getTime())); //���� �ð� ���
		bw.close();		//Write�� ���� �ݱ�

	}

}
