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

public class P05_2 {
	
	static SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss"); //출력일자 형식 지정

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언
		System.out.printf("시작 : %s\n", sdt.format(calt.getTime())); //시작 시간 출력
		File f = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\day_data\\THTSKS010H00.dat"); //file객체 선언 및 경로 지정
		BufferedReader br = new BufferedReader(new FileReader(f)); //BufferReader 객체 선언 
		
		File f1 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\day_data.StockDailyPrice.csv"); //file 객체 선언 및 경로 지정
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1)); //BufferWriter 객체 선언
		
		String k31_readtxt; // File을 읽어서 저장할 Stirng 선언
		
		int k31_LineCnt = 0; // 전체 Line 카운트 변수 선언 및 초기화
		int k31_wcnt = 0; // 추출한 행수 변수 선언 및 초기화

		while ((k31_readtxt = br.readLine()) != null) { //br.readLine을 읽어서 대입한 readtxt가 비어있지 않다면
			StringBuffer k31_s = new StringBuffer(); //StringBuffer k31_s 객체선언
			String[] k31_field = k31_readtxt.split("%_%"); //String 배열을 %_%로 구분하여 배열 입력
			
			if (k31_field.length> 2&&k31_field[2].replace("^","").trim().substring(0,1).equals("A")) { //길이가 2보다 크고 배열[2]값에 ^를 지우고 trim 하고 A를 포함하면
			k31_s.append(k31_field[0].replace("^", "").trim()); //k31_s에 k31_filed[0]의 값을 replace하고 앞뒤 공백을 없앤 후 넣어줌
			for (int j = 1; j < k31_field.length; j++) { //1부터 filed 배열 길이 만큼 반복
				k31_s.append("," + k31_field[j].replace("^", "").trim()); // k31_s에 ,를 추가하고 배열[j]값의 ^를 제거하고 앞뒤 공백 제거
			}
			
			bw1.write(k31_s.toString()); //k31_s 값을 String으로 BufferedReader로 입력
			bw1.newLine(); //새로운행
			k31_wcnt ++; //추출 카운트 +1
		}		
			k31_LineCnt ++; //전체 카운트 +1
		}
		
		br.close(); //파일 닫음
		bw1.close(); //파일 닫음
		
		System.out.printf("Program End [%d][%d]records\n", k31_LineCnt, k31_wcnt);
		br.close(); //파일 닫음
		
		Calendar calt2 = Calendar.getInstance(); //Calendar 메소드 선언
		System.out.printf("종료 : %s\n", sdt.format(calt2.getTime())); //종료 시간 출력

	}

}
