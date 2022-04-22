package Lecture05_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P05_4 {
	
	static Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //출력일자 형식 지정

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언
		System.out.printf("시작 : %s\n", sdt.format(calt.getTime())); //시작 시간 출력	
		
		File f1 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\day_data.StockDailyPrice.csv"); //read한 파일경로 지정
		BufferedReader br = new BufferedReader(new FileReader(f1)); //bufferReader 객체 선언 
		
		File f2 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\20120314.csv"); //write할 파일경로 지정
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));	//bufferWriter 객체 선언
		
		String k31_readCsv;	// File을 읽어서 저장할 Stirng 선언 
		int k31_cnt = 0; // 읽고 쓴 데이터 count용 변수 선언 및 초기화
		
		while ((k31_readCsv = br.readLine()) != null) { // readcsv br.readLine하여 readCsv에 대입했을때 값이 있다면 아래를 계속 반복
			String[] k31_csvField = k31_readCsv.split(",");	// String 배열 csvFiled에 readCsv파일을 ,로 분리하여 배열 입력
			if(k31_csvField[1].equals("20120314") == true) { //배열 index 1에 문자열 "20120314"가 있다는것이 True라면
				bw.write(k31_readCsv.toString()); //bw해라 readCsv를 string 형태로
				bw.newLine(); //bw 새로운 라인 개행
				k31_cnt ++; // 데이터 count 1증가
			}			
		}
		
		br.close(); //read한 파일 닫기
		System.out.println("Program End\n" + "total record count : " + k31_cnt); // 프로그램 종료 알림, 데이터 숫자 알림
		
		
		Calendar calt2 = Calendar.getInstance(); //Calendar 메소드 선언
		System.out.printf("종료 : %s\n", sdt.format(calt2.getTime())); //종료 시간 출력
		bw.close();		//Write한 파일 닫기

	}

}
