package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P03 {
	
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate) + 0.5); // 세전 금액 구할 시 세금 반올림
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("###,###,###,###"); // 콤마 찍기 양식 메소드 선언
		Calendar calt = Calendar.getInstance(); // 달력 현재날짜 받기위한 메소드 선언

		int k31_Price = 330000; // 최종금액
		double k31_taxRate = 0.1; // 세율
		int k31_netPrice = netprice(k31_Price, k31_taxRate); // 세전 금액 구하기 메소드 활용
		int k31_tax = (k31_Price - k31_netPrice); // 세금 = 최종금액 - 세전금액

		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 현재날짜 시간 찍기

		// 출력부

		System.out.println("신용승인");
		System.out.println("단말기 : 2N68665898" + "            전표번호 : 041218");
		System.out.println("가맹점 : 한양김치찌개");
		System.out.println("주  소 : 경기 성남시 분당후 황새울로351번길 10 ,\n1층");
		System.out.println("대표자 : 유창선");
		System.out.println("사업자 : 752-53-00558" + "              TEL : 7055695");
		System.out.println("------------------------------------------------");
		System.out.printf("금  액 %38s 원\n", df.format((int) k31_netPrice));
		System.out.printf("부가세 %38s 원\n", df.format((int) k31_tax));
		System.out.printf("합  계 %38s 원\n", df.format(k31_Price));

		System.out.println("------------------------------------------------");
		System.out.println("우리카드");
		System.out.println("카드번호 : 5387-20**-****-4613(S)         일시불");
		System.out.printf("거래일시 : %s\n", sdt.format(calt.getTime()));
		System.out.println("승인번호 : 70404427");
		System.out.println("거래번호 : 357734873739");
		System.out.println("매입 : 비씨카드사" + "     가맹 : 720068568");
		System.out.println("알림 : EDC매출표");
		System.out.println("문의 : TEL)1544-7000");
		System.out.println("------------------------------------------------");
		System.out.println("               * 감사합니다 *                   ");
		System.out.println("                              표준V2.08_20200212");
	}

}
