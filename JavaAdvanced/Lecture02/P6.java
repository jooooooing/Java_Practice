package Lecture02;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 13; i++) { // for�� i�� 1���� 13���� 1���� �����ϸ鼭 �ݺ�
			System.out.printf(" %d�� => ", i); // ��� : ��
			for (int j = 1; j < 32; j++) { // for�� j�� 1���� 32���� 1���� �����ϸ鼭 �ݺ�
				System.out.printf("%d, ", j); // ��� : ��
				if (i == 4 || i == 6 || i == 7 || i == 11) { // i�� 4 �Ǵ� 6 �Ǵ� 7 �Ǵ� 11�̰�
					if (j == 30) // j�� 30�̸�
						break; // �ݺ� ���߰� Ż�� -> 22������
				}

				if (i == 2) { // i�� 2���̰�
					if (j == 28) // j�� 28�̸�
						break; // �ݺ� ���߰� Ż�� -> 22������
				}
			}
			System.out.println(); // ��ĭ ����
		}
	}
}
