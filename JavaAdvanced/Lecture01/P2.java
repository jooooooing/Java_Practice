package Lecture01;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#2. �����ϱ�, �ձ��ϱ�
		
		int k31_sum; // ���� int ����
		k31_sum=0; // ���� �ʱ�ȭ
		
		for (int k31_i=1; k31_i < 101; k31_i++) {  //for�� ���� 1~100���� �ݺ�
			k31_sum = k31_sum + k31_i;				// 1~100������ ���� ������Ű�� ��
		}
		System.out.printf("#2 : %d\n" , k31_sum); // ���� �� ���
		
		System.out.printf("#2-2 : %d\n", k31_sum/100); // 
		
		int [] k31_v = {1,2,3,4,5}; // �迭 v ���� �� �ʱ�ȭ
		int k31_vsum; // ���� ����
		
		k31_vsum = 0; // ���� �ʱ�ȭ
		
		for (int k31_i = 0; k31_i < 5; k31_i++){ //for�� ���� 5�� �ݺ�		
			k31_vsum = k31_vsum + k31_v[k31_i];	//�迭 �ε��� 0~4���� �ݺ��ϸ鼭 ���� ������Ŵ
		}
		
		System.out.printf("#2-3 : %d\n", k31_vsum); //���� ����� ���� �� ���

	}

}
