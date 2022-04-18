package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
		DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // �޸���� �޼ҵ�
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		//��������
		String[] k31_itemName = {"(��)����޴ٸ��Ұ��", "����ũ ���޼��뺺��", "���ѱ� ����� �ſ��", "�����´�������113g", "�븲 �������300g", // 0 ~ 4, 5��
				"��Ÿ�� ���İ�Ƽ 500g", "���ѱ� ����̽���80g", "����ũ ��������������", "��� �����ͽ� 150g", "��ǥ��â�ù߾��������", "���Ƹ��� �� 1L", "�ȵ������ 130g*4��", "���� ü�� �����̽�", // 5 ~ 12, 8��
				"CJ ���ǰ��ѻ�����ġ��", "���鶱���̶�500g", "����ũ �轼���� ��ī��", "���ڶ� �Ƹ����� 500ml", "�������� 420ml*12��", "���ִ� ���ѱ�� 210g", "�����׸��Ķ�ũ770g", "�Ե�ũ��Ű������312g", // 13 ~ 20, 8��
				"Ǯ���� ��� ġ�", "������ �ķ������� 840g", "������������", "�ù� �����Թڽ�����ũ", "������ ȭ��Ʈ ���� 3L", "���丮 ����� 700ml", "����ũ �轼���� �Ͽ��̾�", "�� ����� �ٳ���(��)", // 21 ~ 28, 8��
				"GAP ������ 4-6��", "���� ���ִ¿���GT ������", "Ǫ���� �̼��������", "��������E"}; // 29 ~ 32, 4��
		int [] k31_price = {6530, 10800, 3100, 2380, 2180, 1980, 1650, 4280, 2980, 1680, 980, 5280, 3360, 2180, 2980, 7980, 11480, 14480, 9980, //�ݾ� �迭 �Է�
							7280, 7980, 12980, 10480, 17580, 12980, 6980, 33980, 6980, 4980, 10800, 4480, 5200, 2980};
		int [] k31_amount = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // ���� �迭 �Է�
		boolean [] k31_taxFree = {true, false, false, false, false, //����깰 �鼼 ���� �迭 �Է�
							false, false,false, true, false, false, false, false, false,
							false, false, false, false, false, false, false, false,
							false, false, false, false, false, false, true,
							true, true, false, false};
		
		int k31_endBytes = 16; //ǰ�� �ѱ��� �ڸ��� ���� byte ��
		int k31_cnt = 1;  // �ٹٲ��� ���� count 
		
		int k31_sumAmount = 0; //ǰ�� ����
		int k31_taxFreePrice = 0; //�鼼ǰ�� �հ�ݾ�
		int k31_totalPrice = 0;
		double k31_taxRate = 0.1;
		
		
		for (int i = 0; i < k31_amount.length; i++) { // ǰ������� �鼼ǰ�� �հ�ݾ� ����� ���� �ݺ���
			k31_sumAmount = k31_sumAmount + k31_amount[i]; //ǰ�� ������ ���� �迭 ���� �հ�			
			k31_totalPrice = k31_totalPrice + (k31_amount[i] * k31_price[i]); // ����ǰ�� �ݾ� �հ� = ��ü ���� �迭 * ��ü ���� �迭 - �鼼ǰ�� �ݾ��հ�
			
			if (k31_taxFree[i] == true) { // taxFree boolean�� true���
				k31_taxFreePrice = k31_taxFreePrice + (k31_amount[i] * k31_price[i]); // �鼼ǰ�� �ݾ��հ� = �鼼ǰ�� ���� * ���� ���� �հ� 
			}			
			 						
		}
		
		int k31_finalPrice = k31_totalPrice - k31_taxFreePrice;
		int k31_netPrice = netprice(k31_totalPrice, k31_taxRate);	
		
		//��º�
		System.out.println("�������� 	 �̸�Ʈ ������ (031)838-1234");
		System.out.println("������-mart 206-86-50913 ����");
		System.out.println("�������� 	 ���� ������ ������� 552");
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("���Ϻ� �귣�� ���� ����(���� ����������)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.println();		
		System.out.printf("[����]%s   POS:0011-9861\n",sdt.format(calt.getTime()));
		
		System.out.println("-----------------------------------------");
		System.out.printf(" �� ǰ ��	  �� ��	   ����     �� ��\n");
		System.out.println("-----------------------------------------");
		
		for (int i = 0; i < k31_itemName.length; i ++) {
			if (k31_taxFree[i] == true) {
				System.out.printf("*%s %7s %3s %7s\n", subStrByte(k31_itemName[i], 20), df.format(k31_price[i]), k31_amount[i], df.format(k31_price[i]*k31_amount[i]));	
			} else {			
			System.out.printf(" %s %7s %3s %7s\n", subStrByte(k31_itemName[i], 20), df.format(k31_price[i]), k31_amount[i], df.format(k31_price[i]*k31_amount[i]));
			}
			if (k31_cnt % 5 ==0) {
				System.out.println("-----------------------------------------");
			}
			k31_cnt++;
		}
		
		System.out.printf("	�� ǰ�� ���� %20s\n", df.format(k31_sumAmount));
		System.out.printf("	(*)�鼼 ��ǰ %20s\n", df.format(k31_taxFreePrice));
		System.out.printf("	�� ��  �� ǰ %20s\n", df.format(k31_netPrice));
		System.out.printf("	��   ��   �� %20s\n", df.format(k31_totalPrice - k31_netPrice));
		System.out.printf("	��        �� %20s\n", df.format(k31_taxFreePrice + k31_netPrice + k31_finalPrice - k31_netPrice));
		System.out.printf(" �������ݾ� %27s\n", df.format(k31_taxFreePrice + k31_netPrice + k31_finalPrice - k31_netPrice));
		
		System.out.println("-----------------------------------------");
		System.out.println("0012 KEB �ϳ�	    541707**0484/35860658");
		System.out.printf("ī�����(IC)		�Ͻú� /  %4s\n", df.format(k31_taxFreePrice + k31_totalPrice));
		System.out.println("-----------------------------------------");
		System.out.println("	  [�ż�������Ʈ ����]");
		System.out.println("��*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.println("��ȸ�߻�����Ʈ 		 9350**9995  164");
		System.out.println("����(����)����Ʈ 	  5,637(   5,473)");
		System.out.println("�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.println("-----------------------------------------");
		System.out.println("  ���ű��رݾ� ���������ð� �ڵ� �ο�");
		System.out.println("������ȣ : 			 34��****");
		System.out.printf("�����ð� : %30s\n", sdt.format(calt.getTime()));
		System.out.println("-----------------------------------------");
		System.out.println("ĳ��:084599 ��OO 		     1150");
		System.out.println("   ���������������� �������� �������� �������� ������ ������������");
		System.out.println("   ���������������� �������� �������� �������� ������ ������������");
		System.out.println("      20210303/00119861/00164980/31");
		

	}
	
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate)+0.5);
	}
	
	public static String subStrByte(String k31_source, int k31_cutLength) {
	         if (!k31_source.isEmpty()) {
	            k31_source = k31_source.trim();// 
	            if (k31_source.getBytes().length < k31_cutLength) {
	               for (int k31_7_i = k31_cutLength - k31_source.getBytes().length; k31_7_i > 0; k31_7_i--) {
	                  k31_source += " ";
	               }
	               return k31_source;
	            } else {
	               StringBuffer k31_sb = new StringBuffer(k31_cutLength);
	               int k37_cnt = 0;
	               for (char k37_ch : k31_source.toCharArray()) {
	                  k37_cnt += String.valueOf(k37_ch).getBytes().length;
	                  if (k37_cnt > k31_cutLength)
	                     break;
	                  k31_sb.append(k37_ch);
	               }
	               
	               if(k31_sb.toString().getBytes().length == 19) {
	                  k31_sb.append(" ");
	               }
	               
	               return k31_sb.toString();
	            }
	         } else {
	            return "";
	         }
	      }

}
