package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언
		DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // 콤마찍기 메소드
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // 구매 시간 형식 지정
		SimpleDateFormat sdt2 = new SimpleDateFormat("YYYYMMdd"); // 영수증 하단부 형식 지정 
		SimpleDateFormat sdt3 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); //입차시간 형식 지정
		
		//변수선언
		String[] k31_itemName = {"(대)국산뒷다리불고기", "피코크 매콤순대볶음", "오뚜기 진라면 매운맛", "오리온눈을감자113g", "대림 마당놀이300g", // 0 ~ 4, 5개		
				"폰타나 스파게티 500g", "오뚜기 양송이스프80g", "피코크 가쓰오여섯가지", "어린잎 베지믹스 150g", "해표순창궁발아콩양념쌈장", "갈아만든 배 1L", "팔도비빔면 130g*4개", "상하 체다 슬라이스", // 5 ~ 12, 8개
				"CJ 더건강한샌드위치햄", "누들떡볶이떡500g", "피코크 잭슨피자 시카고", "스텔라 아르투아 500ml", "오랑지나 420ml*12입", "맛있는 오뚜기밥 210g", "델립그릴후랑크770g", "롯데크런키빼빼로312g", // 13 ~ 20, 8개
				"풀무원 돈까스 치즈볼", "오리온 후레쉬베리 840g", "다향훈제오리", "올반 구슬함박스테이크", "하인즈 화이트 식초 3L", "산토리 가쿠빈 700ml", "피코크 잭슨피자 하와이안", "순 유기농 바나나(봉)", // 21 ~ 28, 8개
				"GAP 죽장사과 4-6입", "남양 맛있는우유GT 저지방", "푸르밀 미숫가루우유", "상투과자E"}; // 29 ~ 32, 4개
		int [] k31_price = {5860, 108000, 3100, 2380, 2180, 1980, 1650, 4280, 2980, 1680, 1000980, 5280, 3360, 2180, 2980, 7980, 11480000, 14480, 9980, //금액 배열 입력
							7280, 7980, 12980, 10480, 17580, 12980, 6980, 33980, 6980, 4980, 10800, 4480, 5200, 2980};
		int [] k31_amount = {1, 2, 1, 1, 5, 20, 20, 50, 40, 10, 10, 10, 20, 20, 10, 10, 1, 1, 99, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // 수량 배열 입력
		boolean [] k31_taxFree = {false, false, false, false, false, //농수산물 면세 여부 배열 입력
							false, false,false, true, false, false, false, false, false,
							false, false, false, false, false, false, false, false,
							false, false, false, false, false, false, true,
							true, true, false, false};
		
		int k31_endBytes = 16; //품목 한글을 자르기 위한 byte 수
		int k31_cnt = 1;  // 줄바꿈을 위한 count 
		
		int k31_sumAmount = 0; //품목 수량
		int k31_taxFreePrice = 0; //면세품목 합계금액
		int k31_totalPrice = 0; //
		double k31_taxRate = 0.1; // 부가세율
		String k31_posNumFront = "0011"; // 포스기 앞 숫자
		int k31_posNumBack = 9861; // 포스기 뒤 숫자
		int k31_receiptCount = 31; // 영수증 순번
		double k31_pointRate = 0.001; // 포인트 적립률
		
		
		for (int i = 0; i < k31_itemName.length; i++) { // 품목수량과 면세품목 합계금액 계산을 위한 반복문
			k31_sumAmount = k31_sumAmount + k31_amount[i]; //품목 수량은 수량 배열 누적 합계			
			k31_totalPrice = k31_totalPrice + (k31_amount[i] * k31_price[i]); // 전체품목 금액 합계 = 전체 수량 배열 값 * 전체 가격 배열 값
			
			if (k31_taxFree[i] == true) { // taxFree boolean이 true라면 (면세물품이라면)
				k31_taxFreePrice = k31_taxFreePrice + (k31_amount[i] * k31_price[i]); // 면세물품 금액합계 = 면세품목 수량 * 가격 누적 합계 
			}				 						
		}
		
		int k31_finalPrice = k31_totalPrice - k31_taxFreePrice; // 과세 금액 = 전체 합계 - 면세물품 금액 
		int k31_netPrice = netprice(k31_finalPrice, k31_taxRate); //과세 물품 금액 = 메소드 netprice, return
		String[] k31_numArr = {" 총 품목 수량", " (*)면세 물품", " 과 세  물 품", " 부   가   세", " 합        계", " 결제대상금액"};
		
		//출력부
		System.out.println("┌─── 	    이마트 죽전점 (031)838-1234");
		System.out.println("│─── mart   206-86-50913 강희석");
		System.out.println("└─── 	    용인 수지구 포은대로 552\n");
		System.out.println("영수증 미지참시 교환/환불 불가");
		System.out.println("정상상품에 한함, 30일 이내(신선 7일)");
		System.out.println("※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.println("교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.println();		
		System.out.printf("[구매]%s      POS:%4s-%4d\n",sdt.format(calt.getTime()), k31_posNumFront, k31_posNumBack);
		
		System.out.println("-----------------------------------------");
		System.out.printf("  상 품 명	   단 가  수량      금 액\n");
		System.out.println("-----------------------------------------");
		
		
		for (int i = 0; i < k31_itemName.length; i ++) { //for 반복 배열 길이 만큼, 1씩 증가하면서
			if (k31_taxFree[i] == true) { //면세배열 값이 true면
				System.out.printf("%s %s%10s  %2s %10s\n", "*", subStrByte(k31_itemName[i], 14), df.format(k31_price[i]), k31_amount[i], df.format(k31_price[i]*k31_amount[i])); //목록을 출력할 때 *을 출력함	
			} else {			//면세 배열값이 false이면
			System.out.printf("%s %s%10s  %2s %10s\n", " ", subStrByte(k31_itemName[i], 14), df.format(k31_price[i]), k31_amount[i], df.format(k31_price[i]*k31_amount[i])); // 목록을 출력함 (* 제외)
			}
			if (k31_cnt % 5 ==0) { // 항목이 5줄 될때마다
				System.out.println("-----------------------------------------"); // 구분선을 출력함
			}
			k31_cnt++; // 항목 카운팅을 위한 변수에 ++ 
		}
		
		int k31_savePoint = point((k31_totalPrice), k31_pointRate); //포인트 적립
		int k31_availPoint = 5473; //가용 포인트 변수 선언 및 초기화
		int k31_totalPoint = k31_availPoint + k31_savePoint; // 누적 포인트 = 금회발생포인트 + 가용포인트
		
		//출력부
		System.out.println();
		System.out.printf("	       총 품목 수량 %13s\n", df.format(k31_itemName.length));
		System.out.printf("	    (*)면 세  물 품 %13s\n", df.format(k31_taxFreePrice));
		System.out.printf("	       과 세  물 품 %13s\n", df.format(k31_netPrice));
		System.out.printf("	       부   가   세 %13s\n", df.format(k31_finalPrice - k31_netPrice));
		System.out.printf("	       합        계 %13s\n", df.format(k31_totalPrice));
		System.out.printf("결 제 대 상 금 액 %23s\n", df.format(k31_totalPrice));

		System.out.println("-----------------------------------------");
		System.out.println("0012 KEB 하나	    541707**0484/35860658");
		System.out.printf("카드결제(IC)	      일시불 / %10s\n", df.format(k31_totalPrice));
		System.out.println("-----------------------------------------");
		System.out.println("	  [신세계포인트 적립]");
		System.out.println("이*현 고객님의 포인트 현황입니다.");
		System.out.printf("금회발생포인트 	     9350**9995    %6s\n", df.format(k31_savePoint));
		System.out.printf("누계(가용)포인트        %6s(   %6s)\n", df.format(k31_totalPoint), df.format(k31_availPoint));
		System.out.println("*신세계포인트 유효기간은 2년입니다.");
		System.out.println("-----------------------------------------");
		System.out.println("   구매금액기준 무료주차시간 자동부여");
		System.out.println("차량번호 : 			 34저****");
		Calendar k31_parking = Calendar.getInstance();; // 입차시간 조정을 위해 2시간 빼줌		
		k31_parking.add(Calendar.HOUR, -2); // 입차시간 조정을 위해 2시간 빼줌		
		System.out.printf("입차시간 :  %29s\n", sdt3.format(k31_parking.getTime()));
		System.out.println("-----------------------------------------");
		System.out.println("캐셔:084599 양OO  		     1150");
		System.out.println("   ││││││││ ││││ ││││ ││││ │││ ││││││");
		System.out.println("   ││││││││ ││││ ││││ ││││ │││ ││││││");
		System.out.printf("%14s/%s%d/%08d/%d\n", sdt2.format(calt.getTime()), k31_posNumFront, k31_posNumBack, k31_totalPrice,k31_receiptCount);		

	}
	//메소드
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate)); // 세전 금액 구하기
	}
	
	public static int point (int price, double rate) {
		return (int) (price * rate); // 포인트 적립 금액 구하기, 버림 계산
	}
	
	public static String subStrByte(String k31_source, int k31_cutLength) {
	            k31_source = k31_source.trim();// 파라미터 String source의 문장 앞뒤 공백을 지운다. (가운데 공백은 제거하지 않음)
	            if (k31_source.getBytes().length < k31_cutLength) { // String source 바이트의 길이가 20보다 작다면 
	               for (int k31_i = k31_cutLength - k31_source.getBytes().length; k31_i > 0; k31_i--) { //i는 20 - 공백을 지운 byte이고, 1이 될때까지 -1씩 감소하며 반복한다.
	                  k31_source += " "; // String source에 공백을 대입
	               }
	               return k31_source; // (20 - 공백을 지운 byte) 만큼 공백 return 
	            } else { //String source 바이트의 길이가 20보다 크다면
	               StringBuffer k31_sb = new StringBuffer(k31_cutLength);  //StringBuffer 클래스 객체 생성
	               int k31_cnt = 0; // cnt 변수 선언 및 초기화
	               for (char k31_ch : k31_source.toCharArray()) { // char ch 배열을 soruce.thCharArray를 통해 생성
	                  k31_cnt += String.valueOf(k31_ch).getBytes().length; // cnt는 
	                  if (k31_cnt > k31_cutLength) // cnt가 20보다 크면
	                     break; // 멈춤
	                  k31_sb.append(k31_ch); //String sb에 ch배열 추가
	               }
	               
	               if(k31_sb.toString().getBytes().length == 13) { // byte가 15라면
	                  k31_sb.append(" "); // String sb에 공백 추가
	               }
	               
	               return k31_sb.toString(); 
	            }	       
	      }
}
