package Lecture01;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #4 ���ϴ� �ڸ��� �ݿø�, ���� ó��
		
		int k31_ii = 12345; //12345���� 10�� ���� ������ ó���ϱ�.
		int k31_j = (k31_ii/10) * 10; // 1234.5 => 1234 * 10 = 12340
		System.out.printf("#4-1 : %d\n", k31_j); //���
		
		k31_ii = 12345; //12345���� 10������ �ݿø� ó��
		k31_j = ((k31_ii+5)/10) *10; // 12345+5 => 12350 / 10 => 1235 * 10 = 12350 �ݿø� ���
		
		System.out.printf("#4-2 : %d\n", k31_j); // ���
		
		k31_ii = 12344; // ���� �Է�
		k31_j = ((k31_ii+5)/10) * 10; // 12349 /10 => 1234.9 * 10 => 12340 : �ݿø� �� ���� ���
		
		System.out.printf("#4-2 : %d\n", k31_j); // ���
		
		

	}

}
