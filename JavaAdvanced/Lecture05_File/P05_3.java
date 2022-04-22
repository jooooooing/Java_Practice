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

public class P05_3 {
	
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //출력일자 형식 지정

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언
		System.out.printf("시작 : %s\n", sdt.format(calt.getTime()));		

		File f1 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\day_data.StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f1));
		
		File f2 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\A005930.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));		
		
		String k31_readCsv;	// File을 읽어서 저장할 Stirng 선언
		int k31_cnt = 0;
		
		while ((k31_readCsv = br.readLine()) != null) { //br.readLine을 읽어서 대입한 readtxt가 비어있지 않다면
			String[] k31_csvField = k31_readCsv.split(",");		//StringBuffer k31_s 객체선언	
			if(k31_csvField[2].equals("A005930") == true) { //csvFiled[2]값에 A005930 을 포함하면
				bw.write(k31_readCsv.toString()); //readCsv값을 String으로 파일쓰기
				bw.newLine(); //새로운 행
				k31_cnt ++; //카운트 추가
			}			
		}
		
		br.close();
		System.out.println("Program End\n" + "total record count : " + k31_cnt);
		
		
		Calendar calt2 = Calendar.getInstance(); //Calendar 메소드 선언
		System.out.printf("종료 : %s\n", sdt.format(calt2.getTime()));
		bw.close();		

	}

}
