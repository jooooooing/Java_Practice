package Lecture01;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_MyWon = 1000000; // �� �� 100���� ȯ�� (������)
		double k31_MoenyEx = 1238.21; // �޷� ȯ�� (�Ǽ���)
		double k31_commission = 0.003; // ȯ�� ������ 0.3% (�Ǽ���)
		
		int k31_usd = (int) (k31_MyWon/k31_MoenyEx); //ȯ������ �޷� = ���� / ȯ�� (������)
		int k31_remain = (int) (k31_MyWon - k31_usd*k31_MoenyEx); // �ܵ� = ���� - ȯ������ �޷�*ȯ�� (������)
		
		//��º�
		System.out.println("*************************************************");
		System.out.println("*	��������� ���	               *");
		System.out.printf("�� ��ȭȯ���ݾ� : %d�� => ��ȭ : %d�޷�, �ܵ� : %d��\n", k31_MyWon, k31_usd, k31_remain);
		System.out.println("*************************************************");
		
		double k31_ComPerOne = k31_MoenyEx * k31_commission; // 1�޷��� ������ ��� = ȯ�� * ������
		double k31_totalCom = k31_usd * k31_ComPerOne; // �� ������ = ȯ������ �޷� * 1�޷��� ������ 
				
		//��º�
		System.out.println("*************************************************");
		System.out.println("*	   ������ ���	           		*");
		System.out.printf("�� ������ : %f�� => ��ȭ : %d�޷�, �޷��� ������: %f��\n", k31_totalCom, k31_usd, k31_ComPerOne);
		System.out.println("*************************************************");
				
		int k31_i_totalCom; //���� ������¡����(������)
		
		//������ �ø�ó��
		if (k31_totalCom != (double)((int)k31_totalCom)) {  //�������� ������ 1�� �̻��϶�
			k31_i_totalCom = (int)k31_totalCom + 1;  // ���� �����ῡ +1
		} else {									// ���� ���� ��
			k31_i_totalCom = (int)k31_totalCom; // ���� ������ �ݿ�
		}
		
		//��º�
		System.out.println("*************************************************");
		System.out.println("*	   ������ ����ȯ��          	*");
		System.out.printf("�� ������ : %d => ��ȭ : %d�޷�, �޷��� ������: %f��\n", k31_i_totalCom, k31_usd, k31_ComPerOne);
		System.out.println("*************************************************");
		
		k31_remain = (int) (k31_MyWon - k31_usd*k31_MoenyEx - k31_i_totalCom); //�ܵ�
		System.out.printf("�� ��ȭȯ���ݾ� : %d => ��ȭ : %d�޷�, ������¡��: %d��, �ܵ�: %d��\n", k31_MyWon, k31_usd, k31_i_totalCom, k31_remain);
		System.out.println("*************************************************");
		
		k31_usd = (int)(k31_MyWon/(k31_MoenyEx + k31_ComPerOne)); //ȯ���޷�
		k31_i_totalCom = (int) (k31_usd * k31_ComPerOne); // �� ������
		
		//������ �ø�ó��
		if (k31_totalCom != (double) ((int) k31_totalCom)) { // �������� ������ 1�� �̻��϶�
			k31_i_totalCom = (int) k31_totalCom + 1; // ���� �����ῡ +1
		} else { // ���� ���� ��
			k31_i_totalCom = (int) k31_totalCom; // ���� ������ �ݿ�
		}
		
		System.out.println("*************************************************");
		System.out.println("*	   ��Ȯ�� ������ ����ȯ��          	*");
		System.out.printf("�� ������ : %d => ��ȭ : %d�޷�, �޷��� ������: %f��\n", k31_i_totalCom, k31_usd, k31_ComPerOne);
		System.out.println("*************************************************");
		
		k31_remain = (int) (k31_MyWon - k31_usd*k31_MoenyEx - k31_i_totalCom); //�ܵ�
		System.out.printf("�� ��ȭȯ���ݾ� : %d => ��ȭ : %d�޷�, ������¡��: %d��, �ܵ�: %d��\n", k31_MyWon, k31_usd, k31_i_totalCom, k31_remain);
		System.out.println("*************************************************");
		
		DecimalFormat df = new DecimalFormat ( "###,###,###,###");
		
		System.out.println("*************************************************");
		System.out.println("		�޸����, ��¥����			*");
		
		System.out.printf("�� ������: %s�� => ��ȭ %s�޷�, �޷��� ������: %f��\n",
		df.format(k31_i_totalCom), df.format(k31_usd), k31_ComPerOne);
		
		k31_remain = (int) (k31_MyWon - k31_usd*k31_MoenyEx - k31_i_totalCom);
		System.out.printf("�� ��ȭȯ���ݾ� : %s => ��ȭ : %s�޷�, ������¡��: %s��, �ܵ�: %s��\n", df.format(k31_MyWon), df.format(k31_usd), 
				df.format(k31_i_totalCom), df.format(k31_remain));
		
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.printf("��������ð�: %s\n", sdt.format(calt.getTime()));
		System.out.println("*************************************************");

		
	}

}
