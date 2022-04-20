package Lecture04;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Self02 {
	
	static Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //출력일자 형식 지정

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k31_iPerson = 200; // 이 값을 주는 만큼 저장소 생성
		
		InputData inData = new InputData(k31_iPerson+1); //생성자의 숫자만큼 배열을 만든다.
		
		for(int i = 0; i < k31_iPerson+1; i ++) {
			String k31_name = String.format("홍길%02d", i); // 이름 만들기
			int k31_kor = (int)(Math.random()*100); // 국어점수 ran 만들기
			int k31_eng = (int)(Math.random()*100); // 영어점수 ran 만들기
			int k31_math = (int)(Math.random()*100); // 수학점수 ran 만들기
			inData.SetData(i, k31_name, k31_kor, k31_eng, k31_math);
			
		}		
		
		System.out.println("		성적집계표");
		System.out.printf("			출력일자 : %s\n", sdt.format(calt.getTime()));
		
		System.out.println("============================================================");
		System.out.println("번호\t   이름\t       국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================================");
		
		int sumKor = 0, sumEng = 0, sumMath = 0, sumSum = 0, sumAve = 0;
		int aveKor = 0, aveEng = 0, aveMath = 0, aveSum = 0, aveAve = 0;
		
		for (int i =1; i < k31_iPerson+1; i++) {
			System.out.printf("%03d\t%7s\t%3d\t%3d\t%3d\t%3d\t%3.0f\n",
					i, inData.k31_name[i],inData.k31_kor[i], inData.k31_eng[i], inData.k31_math[i], inData.k31_sum[i], inData.k31_ave[i]);
			
			sumKor += inData.k31_kor[i];
			sumEng += inData.k31_eng[i];
			sumMath += inData.k31_math[i];
			sumSum += inData.k31_sum[i];
			sumAve += inData.k31_ave[i];			
		}
		
		aveKor = sumKor / (inData.k31_kor.length);
		aveEng = sumEng / (inData.k31_eng.length);
		aveMath = sumMath / (inData.k31_math.length);
		aveSum = sumSum / (inData.k31_sum.length);
		aveAve = sumAve / (inData.k31_ave.length);
		
		System.out.println("============================================================");
		System.out.printf("합계\t    		%4d\t%4d\t%4d\t%4d\t%4d\n", sumKor, sumEng, sumMath, sumSum, sumAve);
		System.out.printf("평균\t    		%4d\t%4d\t%4d\t%4d\t%4d\n", aveKor, aveEng, aveMath, aveSum, aveAve);

	}

}
