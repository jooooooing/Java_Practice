package Lecture02;

import java.text.DecimalFormat;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k31_item = "���"; // Stirng���� ���� �� �ʱ�ȭ
		int k31_unit_price = 5000; // int ���� ���� �� �ʱ�ȭ
		int k31_num = 500; // int ���� ���� �� �ʱ�ȭ
		int k31_total = k31_unit_price*k31_num; // int ���� ���� �� �ʱ�ȭ
		
		DecimalFormat df = new DecimalFormat ( "###,###,###,###,###"); //DecimalFormat �Լ�
		//��� ���
		System.out.printf("=====================================================================\n");
		System.out.printf("%20.20s %8.8s %8.8s %8.8s \n", "ǰ��", "�ܰ�", "����", "�հ�");
		System.out.printf("=====================================================================\n");
		
		//�� ���
		System.out.printf("%20.20s %10.10s %10.10s %10.10s\n", k31_item, df.format(k31_unit_price), df.format(k31_num), df.format(k31_total));
		System.out.printf("=====================================================================\n");

	}

}
