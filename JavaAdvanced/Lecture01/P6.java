package Lecture01;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_val = 271; // ���� ���� ��
		int k31_rate = 3; //���� 3�ۼ�Ʈ
		
		int k31_tax = taxcal(k31_val, k31_rate);
		
		System.out.printf("*********************\n");
		System.out.printf("�ܼ� ���� ���*\n");
		System.out.printf("*********************\n");
		System.out.printf("*********************\n");
		System.out.printf("*********************\n");
		
				

	}

	public class Taxcalc {

		public static int taxcal(int val, int rate) {
			int ret;

			if (((double) val * (double) rate / 100.0) == val * rate / 100)
				ret = val * rate / 100;
			else
				ret = val * rate / 100 + 1;
			return ret;
		}

	}

}
