package Lecture02;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 13; i++) { //for �ݺ��� i�� 1���� 13���� 1�� �����ϸ� �Ʒ� �ݺ�
			System.out.printf(" %d�� =>", i); // ��� i
			LOOP: for (int j = 1; j < 32; j++) { // LOOP�� j�� 1���� 32���� 1�� �����ϸ� �Ʒ� �ݺ�
				System.out.printf("%d, ", j); // ��� j

				switch (i) {case 4: case 6: case 9: case 7: case 11: // i ���� 4,6,9,11�϶� case
					if (j == 30) // j�� 30�̸�
						break LOOP; // LOOP�ΰ���.
					break; // �ݺ��� Ż��
				case 2: // i ���� 4,6,9,11�϶� case
					if (j == 28) // j�� 28�̸�
						break LOOP; // LOOP�ΰ���.
					break; // �ݺ��� Ż��
				}
			}
			System.out.printf("\n"); // ��ĭ ����
		}
	}
}
