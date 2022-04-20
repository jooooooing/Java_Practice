package Lecture04;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Self02 {
	
	static Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //������� ���� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_iPerson = 200; // �� ���� �ִ� ��ŭ ����� ����
		
		InputData inData = new InputData(k31_iPerson+1); //�������� ���ڸ�ŭ �迭�� �����.
		
		for(int i = 0; i < k31_iPerson+1; i ++) {
			String k31_name = String.format("ȫ��%02d", i); // �̸� �����
			int k31_kor = (int)(Math.random()*100); // �������� ran �����
			int k31_eng = (int)(Math.random()*100); // �������� ran �����
			int k31_math = (int)(Math.random()*100); // �������� ran �����
			inData.SetData(i, k31_name, k31_kor, k31_eng, k31_math);
			
		}		
		
		System.out.println("		��������ǥ");
		System.out.printf("			������� : %s\n", sdt.format(calt.getTime()));
		
		System.out.println("============================================================");
		System.out.println("��ȣ\t   �̸�\t       ����\t����\t����\t����\t���");
		System.out.println("============================================================");
		
		int sumKor = 0, sumEng = 0, sumMath = 0, sumSum = 0, sumAve = 0;
		int aveKor = 0, aveEng = 0, aveMath = 0, aveSum = 0, aveAve = 0;
		
		for (int i =1; i < k31_iPerson+1; i++) {
			System.out.printf("%03d\t%7s\t%3d\t%3d\t%3d\t%3d\t%3.0f\n",
					i, inData.k31_name[i],inData.k31_kor[i], inData.k31_eng[i], inData.k31_math[i], inData.k31_sum[i], inData.k31_ave[i]);
			
			sumKor += inData.k31_kor[i];
			sumEng += inData.k31_eng[i];
			sumMath += inData.k31_math[i];
			sumSum += inData.k31_sum[i];
			sumAve += inData.k31_ave[i];			
		}
		
		aveKor = sumKor / (inData.k31_kor.length);
		aveEng = sumEng / (inData.k31_eng.length);
		aveMath = sumMath / (inData.k31_math.length);
		aveSum = sumSum / (inData.k31_sum.length);
		aveAve = sumAve / (inData.k31_ave.length);
		
		System.out.println("============================================================");
		System.out.printf("�հ�\t    		%4d\t%4d\t%4d\t%4d\t%4d\n", sumKor, sumEng, sumMath, sumSum, sumAve);
		System.out.printf("���\t    		%4d\t%4d\t%4d\t%4d\t%4d\n", aveKor, aveEng, aveMath, aveSum, aveAve);

	}

}
