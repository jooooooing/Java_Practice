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

public class P05_2 {
	
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //������� ���� ����

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
		System.out.printf("���� : %s\n", sdt.format(calt.getTime())); //���� �ð� ���
		File f = new File("C:\\Users\\local pc\\Desktop\\�ǽ�������\\day_data\\THTSKS010H00.dat"); //file��ü ���� �� ��� ����
		BufferedReader br = new BufferedReader(new FileReader(f)); //BufferReader ��ü ���� 
		
		File f1 = new File("C:\\Users\\local pc\\Desktop\\�ǽ�������\\day_data.StockDailyPrice.csv"); //file ��ü ���� �� ��� ����
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1)); //BufferWriter ��ü ����
		
		String k31_readtxt; // File�� �о ������ Stirng ����
		
		int k31_LineCnt = 0; // ��ü Line ī��Ʈ ���� ���� �� �ʱ�ȭ
		int k31_wcnt = 0; // ������ ��� ���� ���� �� �ʱ�ȭ

		while ((k31_readtxt = br.readLine()) != null) { //br.readLine�� �о ������ readtxt�� ������� �ʴٸ�
			StringBuffer k31_s = new StringBuffer(); //StringBuffer k31_s ��ü����
			String[] k31_field = k31_readtxt.split("%_%"); //String �迭�� %_%�� �����Ͽ� �迭 �Է�
			
			if (k31_field.length> 2&&k31_field[2].replace("^","").trim().substring(0,1).equals("A")) { //���̰� 2���� ũ�� �迭[2]���� ^�� ����� trim �ϰ� A�� �����ϸ�
			k31_s.append(k31_field[0].replace("^", "").trim()); //k31_s�� k31_filed[0]�� ���� replace�ϰ� �յ� ������ ���� �� �־���
			for (int j = 1; j < k31_field.length; j++) { //1���� filed �迭 ���� ��ŭ �ݺ�
				k31_s.append("," + k31_field[j].replace("^", "").trim()); // k31_s�� ,�� �߰��ϰ� �迭[j]���� ^�� �����ϰ� �յ� ���� ����
			}
			
			bw1.write(k31_s.toString()); //k31_s ���� String���� BufferedReader�� �Է�
			bw1.newLine(); //���ο���
			k31_wcnt ++; //���� ī��Ʈ +1
		}		
			k31_LineCnt ++; //��ü ī��Ʈ +1
		}
		
		br.close(); //���� ����
		bw1.close(); //���� ����
		
		System.out.printf("Program End [%d][%d]records\n", k31_LineCnt, k31_wcnt);
		br.close(); //���� ����
		
		Calendar calt2 = Calendar.getInstance(); //Calendar �޼ҵ� ����
		System.out.printf("���� : %s\n", sdt.format(calt2.getTime())); //���� �ð� ���

	}

}
