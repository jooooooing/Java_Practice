package Lecture05_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P04_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\local pc\\Desktop\\경기도_성남시_주차장정보.csv"); // File 객체와 읽을 파일 경로 설정
		BufferedReader br = new BufferedReader(new FileReader(f)); //BufferedReader 객체 생성

		String k31_readtxt; // 파일을 읽어서 저장할 String

		if ((k31_readtxt = br.readLine()) == null) { // 파일을 readLine했을때 line이 비어있다면
			System.out.println("빈 파일입니다."); // 빈파일입니다 출력
			return;
		}

		String[] k31_field_name = k31_readtxt.split(","); // 항목이름 String 배열 = readtxt를 ,로 나눈 값 저장

		double k31_lat = 37.3860521; // 위도
		double k31_lng = 127.1214038; // 경도
		
		double distMax = 0;
		double distMin = 10;
		String MaxAddress = "";
		String MinAddress = "";

		while ((k31_readtxt = br.readLine()) != null) {

			String[] k31_field = k31_readtxt.split(",");
			double k31_dist = Math.sqrt(Math.pow(Double.parseDouble(k31_field[27]) - k31_lat, 2)
					+ Math.pow(Double.parseDouble(k31_field[28]) - k31_lng, 2));
			if (k31_dist > distMax) {
				distMax = k31_dist;
				MaxAddress= k31_field[4];
			} else if (k31_dist < distMin) {
				distMin = k31_dist;
				MinAddress= k31_field[4];
			}
		}
		
		System.out.println("최대거리(주소) : " + MaxAddress);
		System.out.printf("최대거리(값) : %4.4fkm\n", distMax * 100);
		
		System.out.println("최소거리(주소) : " + MinAddress);
		System.out.printf("최소거리(값) : %4.4fkm\n", distMin * 100);
		

		br.close();

	}

}
