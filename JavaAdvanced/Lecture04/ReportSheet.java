package Lecture04;

public class ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_iPerson = 10; // �� ���� �ִ� ��ŭ ����� ����
		
		InputData inData = new InputData(k31_iPerson); //�������� ���ڸ�ŭ �迭�� �����.
		
		for(int i = 0; i < k31_iPerson; i ++) {
			String k31_name = String.format("ȫ��%02d", i); // �̸� �����
			int k31_kor = (int)(Math.random()*100); // �������� ran �����
			int k31_eng = (int)(Math.random()*100); // �������� ran �����
			int k31_math = (int)(Math.random()*100); // �������� ran �����
			inData.SetData(i, k31_name, k31_kor, k31_eng, k31_math);
			
		}		
		
		for (int i =0; i < k31_iPerson; i++) {
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%d, ����:%d, ����:%d, ����:%d, ���:%f\n",
					i, inData.k31_name[i],inData.k31_kor[i], inData.k31_eng[i], inData.k31_math[i], inData.k31_sum[i], inData.k31_ave[i]);
		}
		
		
		

	}

}
