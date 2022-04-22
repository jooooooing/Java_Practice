package Lecture05_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P04_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\local pc\\Desktop\\무료와이파이정보.csv"); // File 객체와 읽을 파일 경로 설정
		BufferedReader br = new BufferedReader(new FileReader(f)); //BufferedReader 객체 생성

		String k31_readtxt; // 파일을 읽어서 저장할 String

		if ((k31_readtxt = br.readLine()) == null) { // 파일을 readLine했을때 line이 비어있다면
			System.out.println("빈 파일입니다."); // 빈파일입니다 출력
			return;
		}

		String[] k31_field_name = k31_readtxt.split(","); // 항목이름 String 배열 = readtxt를 ,로 나눈 값 저장

		double k31_lat = 37.3860521; // 현재위치 위도
		double k31_lng = 127.1214038; // 현재위치 경도

		int k31_LineCnt = 0;
		
		while ((k31_readtxt = br.readLine()) != null) { // readLine했을때 비어있지 않다면 readtxt에 입력

			String[] k31_field = k31_readtxt.split(","); // readtxt를 ,로 구분하여 자르고 field 배열에 넣음
			System.out.printf("**[%d번째 항목]**********\n", k31_LineCnt+1); // 항목 순번 출력 cnt + 1 행
			System.out.printf(" %s : %s\n", k31_field_name[9], k31_field[9]); //소재지 도로명 주소
			System.out.printf(" %s : %s\n", k31_field_name[13], k31_field[13]); // 위도
			System.out.printf(" %s : %s\n", k31_field_name[14], k31_field[14]); // 경도
			double k31_dist = Math.sqrt( Math.pow(Double.parseDouble(k31_field[13])-k31_lat, 2) //거리 계산(피타고라스 정리)
					+ Math.pow(Double.parseDouble(k31_field[14])-k31_lng, 2));
			System.out.printf(" 현재지점과 거리 : %f\n", k31_dist); // 거리
			System.out.println("************************************");

			k31_LineCnt++; // 순번 +1

		}

		br.close();
	
	}

}
