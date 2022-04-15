package Lecture02;

import java.text.DecimalFormat;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k31_item = "사과"; // Stirng변수 선언 및 초기화
		int k31_unit_price = 5000; // int 변수 선언 및 초기화
		int k31_num = 500; // int 변수 선언 및 초기화
		int k31_total = k31_unit_price*k31_num; // int 변수 선언 및 초기화
		
		DecimalFormat df = new DecimalFormat ( "###,###,###,###,###"); //DecimalFormat 함수
		//헤더 찍기
		System.out.printf("=====================================================================\n");
		System.out.printf("%20.20s %8.8s %8.8s %8.8s \n", "품목", "단가", "수량", "합계");
		System.out.printf("=====================================================================\n");
		
		//값 찍기
		System.out.printf("%20.20s %10.10s %10.10s %10.10s\n", k31_item, df.format(k31_unit_price), df.format(k31_num), df.format(k31_total));
		System.out.printf("=====================================================================\n");

	}

}
