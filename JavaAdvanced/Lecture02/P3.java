package Lecture02;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_i; // int ������ ���� ���� 
		double k31_d; // double �Ǽ��� ���� ����

		k31_i = 10 / 3; // ���� �ʱ�ȭ 3.3333�̳� ���� 3
		k31_d = 10 / 3.0; // ���� �ʱ�ȭ 3.33333

		if (k31_i == k31_d) { //i�� d�� ���ٸ�
			System.out.printf("eqaul\n"); // eqaul ���
		} else {  //i�� d�� ���� �ʴٸ�
			System.out.printf("Not equal[%f][%f]\n", (double) k31_i, k31_d); // Not eqaul ���
		}

		if (k31_d == 3.333333) { // d�� 3.33333�� ���ٸ�
			System.out.println("equal"); // eqaul ���
		} else { //���� �ʴٸ�
			System.out.printf("Not equal[3.333333][%f]\n", k31_d); // Not eqaul ���
		}

		k31_d = (int) k31_d; //���� d�� int������ ����ȯ�� d�� �Է�
		if (k31_i == k31_d) { // ���� i�� int�� ��ȯ�� d�� ���ٸ�
			System.out.printf("eqaul\n"); // eqaul ���
		} else { //���� �ʴٸ�
			System.out.printf("Not equal[%f][%f]\n", (double) k31_i, k31_d); // Not eqaul ���
		}
		//���
		System.out.printf("int�� �μ�[%d][%f]\n", k31_i, k31_d);
		System.out.printf("double�� �μ�[%f][%f]\n", (double) k31_i, k31_d);

		char k31_a = 'c'; // char ���� ���� �� �ʱ�ȭ

		if (k31_a == 'b') { // ������ ���� a�� ���� b�� ���ٸ�
			System.out.println("a�� b�̴�");
		}
		if (k31_a == 'c') { // ������ ���� a�� ���� c�� ���ٸ�
			System.out.println("a�� c�̴�");
		}
		if (k31_a == 'd') { // ������ ���� a�� ���� d�� ���ٸ�
			System.out.println("a�� d�̴�");
		}

		String k31_aa = "abcd"; // String ���� ���� �� �ʱ�ȭ

		if (k31_aa.equals("abcd")) { // String�� ���� aa�� ���� abcd�� ���ٸ�
			System.out.println("aa�� abcd�̴�");
		} else {
			System.out.println("aa�� abcd�� �ƴϴ�");
		}

		boolean k31_bb = true; // boolean ���� ���� �� �ʱ�ȭ

		if (!!k31_bb) { // boolean ���� ���� bb�� true�� �ƴϰ� �ƴϸ� => ��, true�̸�
			System.out.println("bb�� �ƴϰ� �ƴϸ� ���̴�");
		} else {
			System.out.println("bb�� �ƴϰ� �ƴϸ� �����̴�");
		}
	}

}
