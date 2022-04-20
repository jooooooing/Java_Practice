package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar �޼ҵ� ����
		DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // �޸���� �޼ҵ�
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // ���� �ð� ���� ����
		SimpleDateFormat sdt2 = new SimpleDateFormat("YYYYMMdd"); // ������ �ϴܺ� ���� ���� 
		SimpleDateFormat sdt3 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); //�����ð� ���� ����
		
		//��������
		String[] k31_itemName = {"(��)����޴ٸ��Ұ��", "����ũ ���޼��뺺��", "���ѱ� ����� �ſ��", "�����´�������113g", "�븲 �������300g", // 0 ~ 4, 5��		
				"��Ÿ�� ���İ�Ƽ 500g", "���ѱ� ����̽���80g", "����ũ ��������������", "��� �����ͽ� 150g", "��ǥ��â�ù߾��������", "���Ƹ��� �� 1L", "�ȵ������ 130g*4��", "���� ü�� �����̽�", // 5 ~ 12, 8��
				"CJ ���ǰ��ѻ�����ġ��", "���鶱���̶�500g", "����ũ �轼���� ��ī��", "���ڶ� �Ƹ����� 500ml", "�������� 420ml*12��", "���ִ� ���ѱ�� 210g", "�����׸��Ķ�ũ770g", "�Ե�ũ��Ű������312g", // 13 ~ 20, 8��
				"Ǯ���� ��� ġ�", "������ �ķ������� 840g", "������������", "�ù� �����Թڽ�����ũ", "������ ȭ��Ʈ ���� 3L", "���丮 ����� 700ml", "����ũ �轼���� �Ͽ��̾�", "�� ����� �ٳ���(��)", // 21 ~ 28, 8��
				"GAP ������ 4-6��", "���� ���ִ¿���GT ������", "Ǫ���� �̼��������", "��������E"}; // 29 ~ 32, 4��
		int [] k31_price = {5860, 108000, 3100, 2380, 2180, 1980, 1650, 4280, 2980, 1680, 1000980, 5280, 3360, 2180, 2980, 7980, 11480000, 14480, 9980, //�ݾ� �迭 �Է�
							7280, 7980, 12980, 10480, 17580, 12980, 6980, 33980, 6980, 4980, 10800, 4480, 5200, 2980};
		int [] k31_amount = {1, 2, 1, 1, 5, 20, 20, 50, 40, 10, 10, 10, 20, 20, 10, 10, 1, 1, 99, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // ���� �迭 �Է�
		boolean [] k31_taxFree = {false, false, false, false, false, //����깰 �鼼 ���� �迭 �Է�
							false, false,false, true, false, false, false, false, false,
							false, false, false, false, false, false, false, false,
							false, false, false, false, false, false, true,
							true, true, false, false};
		
		int k31_endBytes = 16; //ǰ�� �ѱ��� �ڸ��� ���� byte ��
		int k31_cnt = 1;  // �ٹٲ��� ���� count 
		
		int k31_sumAmount = 0; //ǰ�� ����
		int k31_taxFreePrice = 0; //�鼼ǰ�� �հ�ݾ�
		int k31_totalPrice = 0; //
		double k31_taxRate = 0.1; // �ΰ�����
		String k31_posNumFront = "0011"; // ������ �� ����
		int k31_posNumBack = 9861; // ������ �� ����
		int k31_receiptCount = 31; // ������ ����
		double k31_pointRate = 0.001; // ����Ʈ ������
		
		
		for (int i = 0; i < k31_itemName.length; i++) { // ǰ������� �鼼ǰ�� �հ�ݾ� ����� ���� �ݺ���
			k31_sumAmount = k31_sumAmount + k31_amount[i]; //ǰ�� ������ ���� �迭 ���� �հ�			
			k31_totalPrice = k31_totalPrice + (k31_amount[i] * k31_price[i]); // ��üǰ�� �ݾ� �հ� = ��ü ���� �迭 �� * ��ü ���� �迭 ��
			
			if (k31_taxFree[i] == true) { // taxFree boolean�� true��� (�鼼��ǰ�̶��)
				k31_taxFreePrice = k31_taxFreePrice + (k31_amount[i] * k31_price[i]); // �鼼��ǰ �ݾ��հ� = �鼼ǰ�� ���� * ���� ���� �հ� 
			}				 						
		}
		
		int k31_finalPrice = k31_totalPrice - k31_taxFreePrice; // ���� �ݾ� = ��ü �հ� - �鼼��ǰ �ݾ� 
		int k31_netPrice = netprice(k31_finalPrice, k31_taxRate); //���� ��ǰ �ݾ� = �޼ҵ� netprice, return
		String[] k31_numArr = {" �� ǰ�� ����", " (*)�鼼 ��ǰ", " �� ��  �� ǰ", " ��   ��   ��", " ��        ��", " �������ݾ�"};
		
		//��º�
		System.out.println("�������� 	    �̸�Ʈ ������ (031)838-1234");
		System.out.println("�������� mart   206-86-50913 ����");
		System.out.println("�������� 	    ���� ������ ������� 552\n");
		System.out.println("������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.println("�����ǰ�� ����, 30�� �̳�(�ż� 7��)");
		System.out.println("���Ϻ� �귣����� ����(���� ����������)");
		System.out.println("��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.println();		
		System.out.printf("[����]%s      POS:%4s-%4d\n",sdt.format(calt.getTime()), k31_posNumFront, k31_posNumBack);
		
		System.out.println("-----------------------------------------");
		System.out.printf("  �� ǰ ��	   �� ��  ����      �� ��\n");
		System.out.println("-----------------------------------------");
		
		
		for (int i = 0; i < k31_itemName.length; i ++) { //for �ݺ� �迭 ���� ��ŭ, 1�� �����ϸ鼭
			if (k31_taxFree[i] == true) { //�鼼�迭 ���� true��
				System.out.printf("%s %s%10s  %2s %10s\n", "*", subStrByte(k31_itemName[i], 14), df.format(k31_price[i]), k31_amount[i], df.format(k31_price[i]*k31_amount[i])); //����� ����� �� *�� �����	
			} else {			//�鼼 �迭���� false�̸�
			System.out.printf("%s %s%10s  %2s %10s\n", " ", subStrByte(k31_itemName[i], 14), df.format(k31_price[i]), k31_amount[i], df.format(k31_price[i]*k31_amount[i])); // ����� ����� (* ����)
			}
			if (k31_cnt % 5 ==0) { // �׸��� 5�� �ɶ�����
				System.out.println("-----------------------------------------"); // ���м��� �����
			}
			k31_cnt++; // �׸� ī������ ���� ������ ++ 
		}
		
		int k31_savePoint = point((k31_totalPrice), k31_pointRate); //����Ʈ ����
		int k31_availPoint = 5473; //���� ����Ʈ ���� ���� �� �ʱ�ȭ
		int k31_totalPoint = k31_availPoint + k31_savePoint; // ���� ����Ʈ = ��ȸ�߻�����Ʈ + ��������Ʈ
		
		//��º�
		System.out.println();
		System.out.printf("	       �� ǰ�� ���� %13s\n", df.format(k31_itemName.length));
		System.out.printf("	    (*)�� ��  �� ǰ %13s\n", df.format(k31_taxFreePrice));
		System.out.printf("	       �� ��  �� ǰ %13s\n", df.format(k31_netPrice));
		System.out.printf("	       ��   ��   �� %13s\n", df.format(k31_finalPrice - k31_netPrice));
		System.out.printf("	       ��        �� %13s\n", df.format(k31_totalPrice));
		System.out.printf("�� �� �� �� �� �� %23s\n", df.format(k31_totalPrice));

		System.out.println("-----------------------------------------");
		System.out.println("0012 KEB �ϳ�	    541707**0484/35860658");
		System.out.printf("ī�����(IC)	      �Ͻú� / %10s\n", df.format(k31_totalPrice));
		System.out.println("-----------------------------------------");
		System.out.println("	  [�ż�������Ʈ ����]");
		System.out.println("��*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("��ȸ�߻�����Ʈ 	     9350**9995    %6s\n", df.format(k31_savePoint));
		System.out.printf("����(����)����Ʈ        %6s(   %6s)\n", df.format(k31_totalPoint), df.format(k31_availPoint));
		System.out.println("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.println("-----------------------------------------");
		System.out.println("   ���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.println("������ȣ : 			 34��****");
		Calendar k31_parking = Calendar.getInstance();; // �����ð� ������ ���� 2�ð� ����		
		k31_parking.add(Calendar.HOUR, -2); // �����ð� ������ ���� 2�ð� ����		
		System.out.printf("�����ð� :  %29s\n", sdt3.format(k31_parking.getTime()));
		System.out.println("-----------------------------------------");
		System.out.println("ĳ��:084599 ��OO  		     1150");
		System.out.println("   ���������������� �������� �������� �������� ������ ������������");
		System.out.println("   ���������������� �������� �������� �������� ������ ������������");
		System.out.printf("%14s/%s%d/%08d/%d\n", sdt2.format(calt.getTime()), k31_posNumFront, k31_posNumBack, k31_totalPrice,k31_receiptCount);		

	}
	//�޼ҵ�
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate)); // ���� �ݾ� ���ϱ�
	}
	
	public static int point (int price, double rate) {
		return (int) (price * rate); // ����Ʈ ���� �ݾ� ���ϱ�, ���� ���
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
	               
	               if(k31_sb.toString().getBytes().length == 13) { // byte�� 15���
	                  k31_sb.append(" "); // String sb�� ���� �߰�
	               }
	               
	               return k31_sb.toString(); 
	            }	       
	      }
}
