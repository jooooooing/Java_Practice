package Lecture02;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k31_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // �迭 ����

		for (int i = 1; i < 13; i++) { // for �ݺ� i�� 1���� 13���� 1�� �����ϸ� �ݺ�
			System.out.printf(" %d�� =>", i); // ��� i
			for (int j = 1; j < 32; j++) { // for �ݺ� j�� 1���� 32���� 1�� �����ϸ� �ݺ�
				System.out.printf("%d", j); // ��� j

				if (k31_iLMD[i - 1] == j) { // �迭���� j�� ������ break, �迭�� == ������ ��¥�̸� �޸��� ����� ���ؼ�
					break;  	
				} 
				
				System.out.printf(","); //��¥�ڿ� �޸����
				
			}
			System.out.println(); // �� ĭ ����
		}

	}

}
