package Lecture03;

import java.util.Calendar;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_iWeekDay = 5; //1�� ������ ���� �Ͽ�ȭ������� = 0,1,2,3,4,5,6
		int [] k31_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //�� �� �������� �迭 ����
		int k31_startDay =0; // �������� ���� ���� �� �ʱ�ȭ
		int k31_endDay =0; // �������� ���� ���� �� �ʱ�ȭ		
		
		for (int k31_iMon = 0; k31_iMon < 12; k31_iMon++) { // ���� i �� ��, i�� 0���� 11���� 1�� �����ϸ鼭 �ݺ�
			
			System.out.printf("\n\n\t\t %d��\n", k31_iMon+1); // �� ��� i�� 0���� �����ϹǷ� +1���ؾ� ���� �� ��� ��
			System.out.println("=============================");
			System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","��","��","ȭ","��","��","��","��"); 
			
			for (int i = 1; i <= k31_iWeekDay; i ++) { //�����ϱ��� ������ ������� �ݺ���. i �� 1���� iWeekDay����, 1�� �����ϸ� �ݺ�
				 System.out.printf("%4s"," "); // ���� ���
			}			
			
			for (int i = 1; i <= k31_iEnd[k31_iMon]; i ++) { //i�� 1���� ��������[�迭] ���ڱ���, 1�� �����ϸ� �ݺ�
				System.out.printf("%4d", i);	// i�� ��� 1 ~ ��������
				k31_iWeekDay ++; // 1�� ����
				if (k31_iWeekDay % 7 == 0) { // iWeekDay�� 1�� �����ϴٰ� 7�� ����� �Ǹ� �� �� ���� 
					System.out.println();					
				}				
			} // iWeekDay 36���� ���� < -iWeekDay�� 5�� ���� �߱� ������
			k31_iWeekDay %= 7; 
			// iWeekDay %7 => 1 -> ������
			//  ������ weekDay�� 7�� ���� ���������� ������ ���� weekDay�� �ǰ� �ʱ�ȭ
        	//weekDay�� 7�� �ʰ��� �� ����.
		} 	

	}

}