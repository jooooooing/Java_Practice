package Lecture02;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double k31_fSin; //���� ����

//		for (int k31_i = 0; k31_i < 360; k31_i++) { // for�� i�� 0���� 359���� 1�� �����ϸ� �ݺ�
//			k31_fSin = Math.sin(k31_i * 3.141592 / 180); //fsin�� i * ����/180�� ����
//			System.out.printf("%d sin ==> %f\n", k31_i, k31_fSin); // i sin�� fSin
//		}
		for (int k31_i = 0; k31_i < 360; k31_i++) { //for�� i�� 0���� 359���� 1�� �����ϸ� �ݺ�
			k31_fSin = Math.sin(k31_i * 3.141592 / 180); //fsin�� i * ����/180�� ����
			int k31_iSpace = (int) ((1.0 - k31_fSin) * 50); // iSpace�� ������ (1-fSin * 50)�� ����
			for (int k31_j = 0; k31_j < k31_iSpace; k31_j++) { //for�� j�� 0���� iSpace���� 1�� �����ϸ� �ݺ� 
				System.out.printf(" "); //��ĭ ���
			}
				System.out.printf("*[%f][%d]\n", k31_fSin, k31_iSpace); //*, fSin, iSpace �� ���			
		}
	}
}
