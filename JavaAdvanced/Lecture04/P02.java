package Lecture04;

public class P02 {
	
	private static int k31_inVal;
	public static void up() {
	k31_inVal ++;
	System.out.printf("�� �׳� �޼ҵ�[%d]\n", k31_inVal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		k31_inVal = 0; // �ڱ⳻�� �������
		
		Elevator elev; // Ŭ������ �޾� ��ü�� ����
		elev = new Elevator(); //�ν��Ͻ��� �����Ͽ� ��ü�� ����

		up(); // ���� �ҽ��� �޼ҵ�
		for (int i = 0; i < 10; i++) {
			elev.up(); // ���������� Ŭ������ �� elev��ü�� up �޼ҵ�
			System.out.printf("MSG[%s]\n", elev.k31_help);
		}

		for (int i = 0; i < 10; i++) {
			elev.down();
			System.out.printf("MSG[%s]\n", elev.k31_help);
		}

	}

}
