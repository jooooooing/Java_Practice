package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P03 {
	
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate) + 0.5); // ���� �ݾ� ���� �� ���� �ݿø�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("###,###,###,###"); // �޸� ��� ��� �޼ҵ� ����
		Calendar calt = Calendar.getInstance(); // �޷� ���糯¥ �ޱ����� �޼ҵ� ����

		int k31_Price = 330000; // �����ݾ�
		double k31_taxRate = 0.1; // ����
		int k31_netPrice = netprice(k31_Price, k31_taxRate); // ���� �ݾ� ���ϱ� �޼ҵ� Ȱ��
		int k31_tax = (k31_Price - k31_netPrice); // ���� = �����ݾ� - �����ݾ�

		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // ���糯¥ �ð� ���

		// ��º�

		System.out.println("�ſ����");
		System.out.println("�ܸ��� : 2N68665898" + "            ��ǥ��ȣ : 041218");
		System.out.println("������ : �Ѿ��ġ�");
		System.out.println("��  �� : ��� ������ �д��� Ȳ�����351���� 10 ,\n1��");
		System.out.println("��ǥ�� : ��â��");
		System.out.println("����� : 752-53-00558" + "              TEL : 7055695");
		System.out.println("------------------------------------------------");
		System.out.printf("��  �� %38s ��\n", df.format((int) k31_netPrice));
		System.out.printf("�ΰ��� %38s ��\n", df.format((int) k31_tax));
		System.out.printf("��  �� %38s ��\n", df.format(k31_Price));

		System.out.println("------------------------------------------------");
		System.out.println("�츮ī��");
		System.out.println("ī���ȣ : 5387-20**-****-4613(S)         �Ͻú�");
		System.out.printf("�ŷ��Ͻ� : %s\n", sdt.format(calt.getTime()));
		System.out.println("���ι�ȣ : 70404427");
		System.out.println("�ŷ���ȣ : 357734873739");
		System.out.println("���� : ��ī���" + "     ���� : 720068568");
		System.out.println("�˸� : EDC����ǥ");
		System.out.println("���� : TEL)1544-7000");
		System.out.println("------------------------------------------------");
		System.out.println("               * �����մϴ� *                   ");
		System.out.println("                              ǥ��V2.08_20200212");
	}

}
