package Lecture01;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 5. �Ҽ��� ���Ͽ����� ��� �ɱ�?
		int k31_MyVal = 14 / 5; // �� ���� 2.8������ �Ҽ��� ���� ������2, �ݿø��ϸ� 3
		
		System.out.printf("#5-1 : %d\n", k31_MyVal); 

		double k31_MyValF;

		k31_MyValF = 14 / 5;
		System.out.printf("#5-2 : %f\n", k31_MyValF);

		k31_MyValF = 14.0 / 5;
		System.out.printf("#5-3 : %f\n", k31_MyValF);

		k31_MyValF = (14.0) / 5 + 0.5;
		System.out.printf("#5-4 : %f\n", k31_MyValF);

		k31_MyVal = (int) ((14.0) / 5 + 0.5);
		System.out.printf("#5-5 : %d\n", k31_MyVal);

	}

}