package Lecture04;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InputData01 {
	
	public static Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
	public static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //������� ���� ����
		
	int sumKor = 0, sumEng = 0, sumMath = 0, sumSum = 0, sumAve = 0;
	int aveKor = 0, aveEng = 0, aveMath = 0, aveSum = 0, aveAve = 0;
	
	int k31_iPerson = 30;
	int page = 1;
	int studentNum = 1;
	
	int[] k31_i;
	String[] k31_name;
	int[] k31_kor;
	int[] k31_eng;
	int[] k31_math;
	int[] k31_sum;
	double[] k31_ave;
	
	public void InputData(int a) {
		
		k31_i = new int[a];
		k31_name = new String[a];
		k31_kor = new int[a];
		k31_eng = new int[a];
		k31_math = new int[a];
		k31_sum = new int[a];
		k31_ave = new double[a];
	}
	
	public int ran(int a) {		
			
		for(int i = studentNum; i < k31_iPerson+1; i ++) { //for �ݺ��� i�� 1���� �Է°� + 1���� ����������
			String k31_name = String.format("ȫ��%02d", i); // �̸� �����
			int k31_kor = (int)(Math.random()*100); // �������� ran �����
			int k31_eng = (int)(Math.random()*100); // �������� ran �����
			int k31_math = (int)(Math.random()*100); // �������� ran �����
			SetData(a, k31_name, k31_kor, k31_eng, k31_math);
			
//			k31_i[a] = a;
//			k31_name[a] = b;
//			k31_kor[a] = c;
//			k31_eng[a] = d;
//			k31_math[a] = e;
//			k31_sum[a] = c + d + e;
//			k31_ave[a] = (c + d + e) / 3;

		}
		studentNum = (30*page)+1;
		return studentNum;
		
	}
	
	public void SetData(int a, String b, int c, int d, int e) {
		k31_i[a] = a;
		k31_name[a] = b;
		k31_kor[a] = c;
		k31_eng[a] = d;
		k31_math[a] = e;
		k31_sum[a] = c + d + e;
		k31_ave[a] = (c + d + e) / 3;

	}

	
	public void printHeader(int a) {
		System.out.println("                   ��������ǥ");
		System.out.printf("PAGE %d		    ������� : %s\n", a, sdt.format(calt.getTime()));
		
		System.out.println("================================================");
		System.out.println("��ȣ      �̸�     ����    ����    ����    ����    ���");
		System.out.println("================================================");
	}
	
	public int printBody(int a) {
			
		for (int i =1; i < k31_iPerson+1; i++) {
			System.out.printf("%03d %7s   %4d   %4d   %4d   %4d   %3.0f\n",			
					i, k31_name[i],k31_kor[i], k31_eng[i], k31_math[i], k31_sum[i], k31_ave[i]);
			
			sumKor += k31_kor[i];
			sumEng += k31_eng[i];
			sumMath += k31_math[i];
			sumSum += k31_sum[i];
			sumAve += k31_ave[i];			
		}
		
		aveKor = sumKor / (k31_kor.length);
		aveEng = sumEng / (k31_eng.length);
		aveMath = sumMath / (k31_math.length);
		aveSum = sumSum / (k31_sum.length);
		aveAve = sumAve / (k31_ave.length);
		
		System.out.println("================================================");
		System.out.printf("�հ�            %4d   %4d   %4d   %4d   %4d\n", sumKor, sumEng, sumMath, sumSum, sumAve);
		System.out.printf("���            %4d   %4d   %4d   %4d   %4d\n", aveKor, aveEng, aveMath, aveSum, aveAve);
		page = page + 1;
		return page;

	}		
	}


