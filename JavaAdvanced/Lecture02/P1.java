package Lecture02;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_sum = 0; // ���� ���� �� �ʱ�ȭ
		for (int k31_i = 0; k31_i < 10; k31_i++) { // for �ݺ� 0���� 9���� 1�� �����ϸ� �ݺ�
			k31_sum = k31_sum + k31_i; // sum ������ i�� ���ϸ鼭 ������Ŵ
		}
		System.out.printf("sum %d\n", k31_sum); // ��� sum

		for (int k31_j = 1; k31_j < 10; k31_j++) { // for �ݺ� 1���� 9���� 1�� �����ϸ� �ݺ�
			System.out.println("*************************************************"); // ���м� ���
			System.out.printf("*������ %d �� \n*", k31_j); //��� j
			System.out.println("*************************************************"); // ���м� ���
			for (int k31_k = 1; k31_k < 10; k31_k++) { // for �ݺ� 1���� 9���� 1�� �����ϸ� �ݺ�
				System.out.printf(" %d * %d = %d \n", k31_j, k31_k, k31_j * k31_k); // ��� �� * ��� = ���
			}
		}
	}
}
