package Lecture04;

public class ReportSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_iPerson = 10; // 이 값을 주는 만큼 저장소 생성
		
		InputData inData = new InputData(k31_iPerson); //생성자의 숫자만큼 배열을 만든다.
		
		for(int i = 0; i < k31_iPerson; i ++) {
			String k31_name = String.format("홍길%02d", i); // 이름 만들기
			int k31_kor = (int)(Math.random()*100); // 국어점수 ran 만들기
			int k31_eng = (int)(Math.random()*100); // 영어점수 ran 만들기
			int k31_math = (int)(Math.random()*100); // 수학점수 ran 만들기
			inData.SetData(i, k31_name, k31_kor, k31_eng, k31_math);
			
		}		
		
		for (int i =0; i < k31_iPerson; i++) {
			System.out.printf("번호:%d, 이름:%s, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%f\n",
					i, inData.k31_name[i],inData.k31_kor[i], inData.k31_eng[i], inData.k31_math[i], inData.k31_sum[i], inData.k31_ave[i]);
		}
		
		
		

	}

}
