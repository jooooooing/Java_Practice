package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언
		DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // 콤마찍기 메소드
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		//변수선언
		String[] k31_itemName = {"(대)국산뒷다리불고기", "피코크 매콤순대볶음", "오뚜기 진라면 매운맛", "오리온눈을감자113g", "대림 마당놀이300g", // 0 ~ 4, 5개
				"폰타나 스파게티 500g", "오뚜기 양송이스프80g", "피코크 가쓰오여섯가지", "어린잎 베지믹스 150g", "해표순창궁발아콩양념쌈장", "갈아만든 배 1L", "팔도비빔면 130g*4개", "상하 체다 슬라이스", // 5 ~ 12, 8개
				"CJ 더건강한샌드위치햄", "누들떡볶이떡500g", "피코크 잭슨피자 시카고", "스텔라 아르투아 500ml", "오랑지나 420ml*12입", "맛있는 오뚜기밥 210g", "델립그릴후랑크770g", "롯데크런키빼빼로312g", // 13 ~ 20, 8개
				"풀무원 돈까스 치즈볼", "오리온 후레쉬베리 840g", "다향훈제오리", "올반 구슬함박스테이크", "하인즈 화이트 식초 3L", "산토리 가쿠빈 700ml", "피코크 잭슨피자 하와이안", "순 유기농 바나나(봉)", // 21 ~ 28, 8개
				"GAP 죽장사과 4-6입", "남양 맛있는우유GT 저지방", "푸르밀 미숫가루우유", "상투과자E"}; // 29 ~ 32, 4개
		int [] k31_price = {6530, 10800, 3100, 2380, 2180, 1980, 1650, 4280, 2980, 1680, 980, 5280, 3360, 2180, 2980, 7980, 11480, 14480, 9980, //금액 배열 입력
							7280, 7980, 12980, 10480, 17580, 12980, 6980, 33980, 6980, 4980, 10800, 4480, 5200, 2980};
		int [] k31_amount = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // 수량 배열 입력
		boolean [] k31_taxFree = {true, false, false, false, false, //농수산물 면세 여부 배열 입력
							false, false,false, true, false, false, false, false, false,
							false, false, false, false, false, false, false, false,
							false, false, false, false, false, false, true,
							true, true, false, false};
		
		int k31_endBytes = 16; //품목 한글을 자르기 위한 byte 수
		int k31_cnt = 1;  // 줄바꿈을 위한 count 
		
		int k31_sumAmount = 0; //품목 수량
		int k31_taxFreePrice = 0; //면세품목 합계금액
		int k31_totalPrice = 0;
		double k31_taxRate = 0.1;
		
		
		for (int i = 0; i < k31_amount.length; i++) { // 품목수량과 면세품목 합계금액 계산을 위한 반복문
			k31_sumAmount = k31_sumAmount + k31_amount[i]; //품목 수량은 수량 배열 누적 합계			
			k31_totalPrice = k31_totalPrice + (k31_amount[i] * k31_price[i]); // 과세품목 금액 합계 = 전체 수량 배열 * 전체 가격 배열 - 면세품목 금액합계
			
			if (k31_taxFree[i] == true) { // taxFree boolean이 true라면
				k31_taxFreePrice = k31_taxFreePrice + (k31_amount[i] * k31_price[i]); // 면세품목 금액합계 = 면세품목 수량 * 가격 누적 합계 
			}			
			 						
		}
		
		int k31_finalPrice = k31_totalPrice - k31_taxFreePrice;
		int k31_netPrice = netprice(k31_totalPrice, k31_taxRate);	
		
		//출력부
		System.out.println("│─── 	 이마트 죽전점 (031)838-1234");
		System.out.println("│──-mart 206-86-50913 강희석");
		System.out.println("│─── 	 용인 수지구 포은대로 552");
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");
		System.out.println("※일부 브랜드 매장 제외(매장 고지물참조)");
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();		
		System.out.printf("[구매]%s   POS:0011-9861\n",sdt.format(calt.getTime()));
		
		System.out.println("-----------------------------------------");
		System.out.printf(" 상 품 명	  단 가	   수량     금 액\n");
		System.out.println("-----------------------------------------");
		
		for (int i = 0; i < k31_itemName.length; i ++) {
			if (k31_taxFree[i] == true) {
				System.out.printf("*%s %7s %3s %7s\n", subStrByte(k31_itemName[i], 20), df.format(k31_price[i]), k31_amount[i], df.format(k31_price[i]*k31_amount[i]));	
			} else {			
			System.out.printf(" %s %7s %3s %7s\n", subStrByte(k31_itemName[i], 20), df.format(k31_price[i]), k31_amount[i], df.format(k31_price[i]*k31_amount[i]));
			}
			if (k31_cnt % 5 ==0) {
				System.out.println("-----------------------------------------");
			}
			k31_cnt++;
		}
		
		System.out.printf("	총 품목 수량 %20s\n", df.format(k31_sumAmount));
		System.out.printf("	(*)면세 물품 %20s\n", df.format(k31_taxFreePrice));
		System.out.printf("	과 세  물 품 %20s\n", df.format(k31_netPrice));
		System.out.printf("	부   가   세 %20s\n", df.format(k31_totalPrice - k31_netPrice));
		System.out.printf("	합        계 %20s\n", df.format(k31_taxFreePrice + k31_netPrice + k31_finalPrice - k31_netPrice));
		System.out.printf(" 결제대상금액 %27s\n", df.format(k31_taxFreePrice + k31_netPrice + k31_finalPrice - k31_netPrice));
		
		System.out.println("-----------------------------------------");
		System.out.println("0012 KEB 하나	    541707**0484/35860658");
		System.out.printf("카드결제(IC)		일시불 /  %4s\n", df.format(k31_taxFreePrice + k31_totalPrice));
		System.out.println("-----------------------------------------");
		System.out.println("	  [신세계포인트 적립]");
		System.out.println("이*현 고객님의 포인트 현황입니다.");
		System.out.println("금회발생포인트 		 9350**9995  164");
		System.out.println("누계(가용)포인트 	  5,637(   5,473)");
		System.out.println("신세계포인트 유효기간은 2년입니다.");
		System.out.println("-----------------------------------------");
		System.out.println("  구매기준금액 무료주차시간 자동 부여");
		System.out.println("차량번호 : 			 34저****");
		System.out.printf("입차시간 : %30s\n", sdt.format(calt.getTime()));
		System.out.println("-----------------------------------------");
		System.out.println("캐셔:084599 양OO 		     1150");
		System.out.println("   ││││││││ ││││ ││││ ││││ │││ ││││││");
		System.out.println("   ││││││││ ││││ ││││ ││││ │││ ││││││");
		System.out.println("      20210303/00119861/00164980/31");
		

	}
	
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate)+0.5);
	}
	
	public static String subStrByte(String k31_source, int k31_cutLength) {
	         if (!k31_source.isEmpty()) {
	            k31_source = k31_source.trim();// 
	            if (k31_source.getBytes().length < k31_cutLength) {
	               for (int k31_7_i = k31_cutLength - k31_source.getBytes().length; k31_7_i > 0; k31_7_i--) {
	                  k31_source += " ";
	               }
	               return k31_source;
	            } else {
	               StringBuffer k31_sb = new StringBuffer(k31_cutLength);
	               int k37_cnt = 0;
	               for (char k37_ch : k31_source.toCharArray()) {
	                  k37_cnt += String.valueOf(k37_ch).getBytes().length;
	                  if (k37_cnt > k31_cutLength)
	                     break;
	                  k31_sb.append(k37_ch);
	               }
	               
	               if(k31_sb.toString().getBytes().length == 19) {
	                  k31_sb.append(" ");
	               }
	               
	               return k31_sb.toString();
	            }
	         } else {
	            return "";
	         }
	      }

}
