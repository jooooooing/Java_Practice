package Lecture01;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] k31_item = {"Ȩ����", "��Ĩ", "��īĨ", "ġ�佺", "����Ĩ"}; //��ǰ���
		int[] k31_price = {1000,2000,3000,2500,1450}; // ��ǰ����(�ܰ�)
		int[] k31_amount = {10, 2, 1, 3, 5}; //���ż��� ���� ����
		double k31_taxRate = 0.1; //���� ���� ����
		
		int k31_totalSum = 0; //���ұݾ� ���� ����
		
		System.out.printf("*******************************************************\n"); //������ ���м�
		System.out.printf("	       	        ��ǰ���					 \n"); 
		System.out.printf("�׸�		�ܰ�	      ����	 	 �հ�\n");
		for (int i = 0; i < k31_item.length; i++) { //��ǰ��ϸ�ŭ �ݺ��� ����
			int k31_sum=k31_price[i]*k31_amount[i]; //�հ�  = ǰ�� * ���ż���
			k31_totalSum=k31_totalSum+k31_sum; // ���ұݾ� ����(��ǰ ��ϸ�ŭ �ݺ�)
			System.out.printf("%.5s		%2d		%2d		%5d\n", k31_item[i], k31_price[i], k31_amount[i], k31_sum);
		}
		System.out.printf("*******************************************************\n");
		System.out.printf("���ұݾ� :%43d\n", k31_totalSum);
		
		int k31_totalNetPrice = (int)(k31_totalSum / (1+k31_taxRate)); //�����ݾ� ��� (���ұݾ� / (1+����))
		System.out.printf("�����ݾ� :%43d\n",k31_totalNetPrice);
		int k31_tax = k31_totalSum - k31_totalNetPrice;
		System.out.printf("��    �� :%43d\n", k31_tax);
	}

}
