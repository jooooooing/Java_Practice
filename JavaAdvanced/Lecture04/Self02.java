package Lecture04;

public class Self02 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_iPerson = 30; // �� ���� �ִ� ��ŭ ����� ����

		InputData inData = new InputData();	
		inData.InputData(k31_iPerson + 1);
		
		for (int i = 0; i < 7; i ++) {			
//			inData.InputData(k31_iPerson + 1); // �������� ���ڸ�ŭ �迭�� �����.
			inData.ran(inData.studentNum);
			inData.printHeader(inData.page);
			inData.printBody(inData.page);		
		}	

	}

}
