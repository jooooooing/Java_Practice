package Lecture05_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P05_5 {
	
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //출력일자 형식 지정
	static DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // 콤마찍기 메소드

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언		
		System.out.printf("시작 : %s\n", sdt.format(calt.getTime())); //시작 시간 출력	
		
		File f1 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\day_data.StockDailyPrice.csv"); //read한 파일경로 지정
		BufferedReader br = new BufferedReader(new FileReader(f1)); //bufferReader 객체 선언 
		
		File f2 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\samsung2015.csv"); //write할 파일경로 지정
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));	//bufferWriter 객체 선언
		
		String k31_readCsv;	// File을 읽어서 저장할 Stirng 선언 
		int k31_cnt = 0; // 읽고 쓴 데이터 count용 변수 선언 및 초기화
		int k31_Max = 0, k31_Min = 9999999; // max, min 변수 선언 및 초기화 (max는 가장 작게 min 은 최대한 크게)
		int k31_Maxday = 0;
		int k31_Minday = 0;
		
		while ((k31_readCsv = br.readLine()) != null) { // readcsv br.readLine하여 readCsv에 대입했을때 값이 있다면 아래를 계속 반복
			String[] k31_csvField = k31_readCsv.split(",");	// String 배열 csvFiled에 readCsv파일을 ,로 분리하여 배열 입력
			if(k31_csvField[1].contains("2015") == true && k31_csvField[2].equals("A005930")) { //배열 index 1에 문자열 "2015"가 있고 and index 2에"A005930"이 있다면
				bw.write(k31_readCsv.toString()); //bw해라 readCsv를 string 형태로
				bw.newLine(); //bw 새로운 라인 개행
				k31_cnt ++; // 데이터 count 1증가
				
				if (Integer.parseInt(k31_csvField[3]) > k31_Max) { // Max값이 csvField[3]값보다 작으면
					k31_Max = Integer.parseInt(k31_csvField[3]); //  Max에 csvField[3]를 입력
					k31_Maxday = Integer.parseInt(k31_csvField[1]);
				} else if (Integer.parseInt(k31_csvField[3]) < k31_Min) { //Min값이 csvField[3]값보다 크면
					k31_Min = Integer.parseInt(k31_csvField[3]); // Min에 csvField[3]를 입력
					k31_Minday = Integer.parseInt(k31_csvField[1]);
				}
			}			
		}
		
		br.close(); //read한 파일 닫기
		System.out.println("Program End\n" + "total record count : " + k31_cnt); // 프로그램 종료 알림, 데이터 숫자 알림
		System.out.println("MaxDay :" + k31_Maxday);
		System.out.println("Max :" + df.format(k31_Max)); //max 값 출력
		System.out.println("Max :" + df.format(k31_Max/50)); //max 값 출력
		
		System.out.println("MinDay :" + k31_Minday);
		System.out.println("Min :" + df.format(k31_Min)); //min 값 출력
		System.out.println("Min :" + df.format(k31_Min/50)); //min 값 출력
		Calendar calt2 = Calendar.getInstance(); //Calendar 메소드 선언
		System.out.printf("종료 : %s\n", sdt.format(calt2.getTime())); //종료 시간 출력
		bw.close();		//Write한 파일 닫기

	}

}
