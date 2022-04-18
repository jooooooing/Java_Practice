package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P04 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
		DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // �޸���� �޼ҵ�
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		//���� ����
		String k31_itemName1= "ǻ��� �����ܿ븶��ũ(�ְ��)";
		String k31_itemCode1= "1031615";
		int k31_price1 = 3000;
		int k31_amount1 = 1;
		int k31_result1 = k31_price1*k31_amount1;
		String k31_itemName2= "�����̵�ĸ���(������)(100ȣ)";
		String k31_itemCode2= "1008152";
		int k31_price2 = 1000;
		int k31_amount2 = 1;
		int k31_result2 = k31_price2*k31_amount2;
		String k31_itemName3= "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String k31_itemCode3= "1020800";
		int k31_price3 = 1000;
		int k31_amount3 = 1;
		int k31_result3 = k31_price3*k31_amount3;
		int k31_sum = k31_result1 + k31_result2 + k31_result3;		
		double k31_taxRate = 0.1;
		int k31_netPrice = netprice(k31_sum, k31_taxRate);
		int k31_tax = (k31_sum - k31_netPrice);			
		int endBytes = 26;				
		
		//��º�
		
		System.out.println("		\"���ΰ��Դ��̼�\"");
		System.out.println("(��)�Ƽ����̼�_�д缭����");
		System.out.println("��ȭ : 031-702-6016");
		System.out.println("���� : ���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.println("��ǥ : ������, ��ȣ�� 213-81-52063");
		System.out.println("���� : ��⵵ ������ �д籸 �д��53���� 11(������)");
		
		System.out.println("==================================================");
		System.out.println("�Һ����߽ɰ濵(CCM) �������");
		System.out.println("ISO 9001 ǰ���濵�ý��� �������");
		System.out.println("==================================================");
		System.out.println("��ȯ/ȯ�� 14�� (03�� 12��) �̳�,");
		System.out.println("(����)������, ����ī�� ���� �� ���Ը��忡�� ����");
		System.out.println("����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.println("üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.println("==================================================");
		System.out.printf("[POS 1058231] %35s\n", sdt.format(calt.getTime()));
		System.out.println("==================================================");
		
		System.out.printf("%s  %5s %5s %8s\n[%s]\n", substringByBytes(k31_itemName1,0, endBytes), df.format(k31_price1), df.format(k31_amount1), df.format(k31_result1), k31_itemCode1);
		System.out.printf("%s  %5s %5s %8s\n[%s]\n", substringByBytes(k31_itemName2,0, endBytes), df.format(k31_price2), df.format(k31_amount2), df.format(k31_result2), k31_itemCode2);
		System.out.printf("%s  %5s %5s %8s\n[%s]\n", substringByBytes(k31_itemName3,0, endBytes), df.format(k31_price3), df.format(k31_amount3), df.format(k31_result3), k31_itemCode3);
		
		System.out.printf("			�����հ� %15s\n", df.format(k31_netPrice));
		System.out.printf("			  �ΰ��� %15s\n", df.format(k31_tax));
		
		
		System.out.println("--------------------------------------------------");
		System.out.printf("�Ǹ��հ� %39s\n", df.format(k31_sum));
		System.out.println("==================================================");
		System.out.printf("�ſ�ī�� %39s\n", df.format(k31_sum));
		System.out.println("--------------------------------------------------");
		System.out.println("�츮ī��			538720**********");
		System.out.printf("���ι�ȣ 77982843(0)		  ���αݾ� %s\n", df.format(k31_sum));
		System.out.println("--------------------------------------------------");
		System.out.printf("%30s �д缭����\n", sdt.format(calt.getTime()));
		System.out.println("��ǰ �� ��Ÿ ���� : 1522-4400");
		System.out.println("����� �� �����̼� ���� ���� : 1599-2211");
		System.out.println("	    �������� ���� �������� ������ ������������");
		System.out.println("	    �������� ���� �������� ������ ������������");
		System.out.println("		2112820610158231");
	
	
		System.out.println("--------------------------------------------------");
		System.out.println("�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n "
						+ "ȸ������ �� �پ��� ������ ����������!��");
		
		

	}
	
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate)+0.5);
	}
	
	public static String substringByBytes(String str, int beginBytes, int endBytes) {
	    if (str == null || str.length() == 0) {
	        return ("");
	    }
	 

	     if (beginBytes < 0) {
	        beginBytes = 0;
	    }

	    if (endBytes < 1) {
	        return ("");	  
	    }

	    int len = str.length();

	    int beginIndex = -1;
	    int endIndex = 0;

	    int curBytes = 0;
	    String ch = null;
	    for (int i = 0; i < len; i++) {
	        ch = str.substring(i, i + 1);
	        curBytes += ch.getBytes().length;
	 

	        if (beginIndex == -1 && curBytes >= beginBytes) {
	            beginIndex = i;
	        }

	        if (curBytes > endBytes) {
	            break;
	        } else {
	            endIndex = i + 1;
	        }
	    }
	 

	    return str.substring(beginIndex, endIndex);
	}
}
