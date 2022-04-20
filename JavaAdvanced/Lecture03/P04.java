package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P04 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
		DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // �޸���� �޼ҵ�
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		
		//���� ����
		String k31_itemName1= "ǻ��� �����ܿ븶��ũ(�ְ��)"; // ǰ��� 1 ���� ���� �� �ʱ�ȭ
		String k31_itemCode1= "1031615"; // ǰ���ڵ� 1 ���� ���� �� �ʱ�ȭ
		int k31_price1 = 1500000; // ǰ��ܰ� 1 ���� ���� �� �ʱ�ȭ
		int k31_amount1 = 10; // ǰ����� 1 ���� ���� �� �ʱ�ȭ
		int k31_result1 = k31_price1*k31_amount1; // ǰ���������� 1 ���� ���� �� �ʱ�ȭ
		String k31_itemName2= "�����̵�ĸ���(������)(100ȣ)"; // ǰ��� 2 ���� ���� �� �ʱ�ȭ
		String k31_itemCode2= "1008152"; // ǰ���ڵ� 2 ���� ���� �� �ʱ�ȭ
		int k31_price2 = 100000; // ǰ��ܰ� 2 ���� ���� �� �ʱ�ȭ
		int k31_amount2 = 1; // ǰ����� 2 ���� ���� �� �ʱ�ȭ
		int k31_result2 = k31_price2*k31_amount2; // ǰ����������2 ���� ���� �� �ʱ�ȭ
		String k31_itemName3= "�������� ���׸�����ũ(�˷�̴�Ÿ��)"; // ǰ��� 3 ���� ���� �� �ʱ�ȭ
		String k31_itemCode3= "1020800"; // ǰ���ڵ� 3 ���� ���� �� �ʱ�ȭ
		int k31_price3 = 1000;  // ǰ��ܰ� 3 ���� ���� �� �ʱ�ȭ
		int k31_amount3 = 1; // ǰ����� 3 ���� ���� �� �ʱ�ȭ
		int k31_result3 = k31_price3*k31_amount3;  // ǰ���������� 3 ���� ���� �� �ʱ�ȭ
		int k31_sum = k31_result1 + k31_result2 + k31_result3; //�հ�ݾ�	
		double k31_taxRate = 0.1; //������
		int k31_netPrice = netprice(k31_sum, k31_taxRate); //���� �ݾ� ���
		int k31_tax = (k31_sum - k31_netPrice);	//�ΰ��� ���		
		
		//��º�		
		System.out.println("		\"���ΰ��Դ��̼�\"");
		System.out.println("(��)�Ƽ����̼�_�д缭����");
		System.out.println("��ȭ:031-702-6016");
		System.out.println("����:���� ������ ���μ�ȯ�� 2748 (���)");
		System.out.println("��ǥ:������, ��ȣ�� 213-81-52063");
		System.out.println("����:��⵵ ������ �д籸 �д��53���� 11 (����\n��)");
		
		System.out.println("================================================");
		System.out.println("         �Һ����߽ɰ濵(CCM) �������");
		System.out.println("         ISO 9001 ǰ���濵�ý��� �������");
		System.out.println("================================================");
		System.out.println("        ��ȯ/ȯ�� 14�� (03��12��) �̳�,");
		System.out.println("(����)������, ����ī�� ���� �� ���Ը��忡�� ����");
		System.out.println("      ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�");
		System.out.println("       üũī�� ��� �� �ִ� 7�� �ҿ�");
		System.out.println("================================================");
		System.out.printf("[POS 1058231] %34s\n", sdt.format(calt.getTime()));
		System.out.println("================================================");
		
		System.out.printf("%s %10s %2s %11s\n[%s]\n", subStrByte(k31_itemName1,22), df.format(k31_price1), df.format(k31_amount1), df.format(k31_result1), k31_itemCode1);
		System.out.printf("%s %10s %2s %11s\n[%s]\n", subStrByte(k31_itemName2,22), df.format(k31_price2), df.format(k31_amount2), df.format(k31_result2), k31_itemCode2);
		System.out.printf("%s %10s %2s %11s\n[%s]\n", subStrByte(k31_itemName3,22), df.format(k31_price3), df.format(k31_amount3), df.format(k31_result3), k31_itemCode3);
		
		System.out.printf("			�����հ� %15s\n", df.format(k31_netPrice));
		System.out.printf("			  �ΰ��� %15s\n", df.format(k31_tax));		
		
		System.out.println("------------------------------------------------");
		System.out.printf("�Ǹ��հ� %39s\n", df.format(k31_sum));
		System.out.println("================================================");
		System.out.printf("�ſ�ī�� %39s\n", df.format(k31_sum));
		System.out.println("------------------------------------------------");
		System.out.println("�츮ī��			538720**********");
		System.out.printf("���ι�ȣ 77982843(0)	     ���αݾ� %10s\n", df.format(k31_sum));
		System.out.println("------------------------------------------------");
		System.out.printf("%30s �д缭����\n", sdt.format(calt.getTime()));
		System.out.println("��ǰ �� ��Ÿ ���� : 1522-4400");
		System.out.println("����� �� �����̼� ���� ���� : 1599-2211");
		System.out.println("	    �������� ���� �������� ������ ������������");
		System.out.println("	    �������� ���� �������� ������ ������������");
		System.out.println("		2112820610158231");
	
	
		System.out.println("------------------------------------------------");
		System.out.println("�� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n "
						+ " ȸ������ �� �پ��� ������ ����������! ��");
	}
	
	//�޼ҵ� �κ�
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate)+0.5);
	}
	
	public static String subStrByte(String k31_source, int k31_cutLength) {
        k31_source = k31_source.trim();// �Ķ���� String source�� ���� �յ� ������ �����. (��� ������ �������� ����)
        if (k31_source.getBytes().length < k31_cutLength) { // String source ����Ʈ�� ���̰� 20���� �۴ٸ� 
           for (int k31_i = k31_cutLength - k31_source.getBytes().length; k31_i > 0; k31_i--) { //i�� 20 - ������ ���� byte�̰�, 1�� �ɶ����� -1�� �����ϸ� �ݺ��Ѵ�.
              k31_source += " "; // String source�� ������ ����
           }
           return k31_source; // (20 - ������ ���� byte) ��ŭ ���� return 
        } else { //String source ����Ʈ�� ���̰� 20���� ũ�ٸ�
           StringBuffer k31_sb = new StringBuffer(k31_cutLength);  //StringBuffer Ŭ���� ��ü ����
           int k31_cnt = 0; // cnt ���� ���� �� �ʱ�ȭ
           for (char k31_ch : k31_source.toCharArray()) { // char ch �迭�� soruce.thCharArray�� ���� ����
              k31_cnt += String.valueOf(k31_ch).getBytes().length; // cnt�� 
              if (k31_cnt > k31_cutLength) // cnt�� 20���� ũ��
                 break; // ����
              k31_sb.append(k31_ch); //String sb�� ch�迭 �߰�
           }
           
           if(k31_sb.toString().getBytes().length == 21) { // byte�� 15���
              k31_sb.append(" "); // String sb�� ���� �߰�
           }
           
           return k31_sb.toString(); 
        }	       
  }
	
//	public static String substringByBytes(String str, int beginBytes, int endBytes) {
//	    if (str == null || str.length() == 0) {
//	        return ("");
//	    }
//	 
//
//	     if (beginBytes < 0) {
//	        beginBytes = 0;
//	    }
//
//	    if (endBytes < 1) {
//	        return ("");	  
//	    }
//
//	    int len = str.length();
//
//	    int beginIndex = -1;
//	    int endIndex = 0;
//
//	    int curBytes = 0;
//	    String ch = null;
//	    for (int i = 0; i < len; i++) {
//	        ch = str.substring(i, i + 1);
//	        curBytes += ch.getBytes().length;
//	 
//
//	        if (beginIndex == -1 && curBytes >= beginBytes) {
//	            beginIndex = i;
//	        }
//
//	        if (curBytes > endBytes) {
//	            break;
//	        } else {
//	            endIndex = i + 1;
//	        }
//	    }
//	 
//
//	    return str.substring(beginIndex, endIndex);
//	}
	

}
