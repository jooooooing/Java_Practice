package Lecture04;

public class Self02 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_iPerson = 30; // 이 값을 주는 만큼 저장소 생성

		InputData inData = new InputData();	
		inData.InputData(k31_iPerson + 1);
		
		for (int i = 0; i < 7; i ++) {			
//			inData.InputData(k31_iPerson + 1); // 생성자의 숫자만큼 배열을 만든다.
			inData.ran(inData.studentNum);
			inData.printHeader(inData.page);
			inData.printBody(inData.page);		
		}	

	}

}
