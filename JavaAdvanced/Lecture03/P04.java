package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P04 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언
		DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // 콤마찍기 메소드
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		
		//변수 선언
		String k31_itemName1= "퓨어에어 비말차단용마스크(최고급)"; // 품목명 1 변수 선언 및 초기화
		String k31_itemCode1= "1031615"; // 품목코드 1 변수 선언 및 초기화
		int k31_price1 = 1500000; // 품목단가 1 변수 선언 및 초기화
		int k31_amount1 = 10; // 품목수량 1 변수 선언 및 초기화
		int k31_result1 = k31_price1*k31_amount1; // 품목최종가격 1 변수 선언 및 초기화
		String k31_itemName2= "슬라이드식명찰(가로형)(100호)"; // 품목명 2 변수 선언 및 초기화
		String k31_itemCode2= "1008152"; // 품목코드 2 변수 선언 및 초기화
		int k31_price2 = 100000; // 품목단가 2 변수 선언 및 초기화
		int k31_amount2 = 1; // 품목수량 2 변수 선언 및 초기화
		int k31_result2 = k31_price2*k31_amount2; // 품목최종가격2 변수 선언 및 초기화
		String k31_itemName3= "매직흡착 인테리어후크(알루미늄타입)"; // 품목명 3 변수 선언 및 초기화
		String k31_itemCode3= "1020800"; // 품목코드 3 변수 선언 및 초기화
		int k31_price3 = 1000;  // 품목단가 3 변수 선언 및 초기화
		int k31_amount3 = 1; // 품목수량 3 변수 선언 및 초기화
		int k31_result3 = k31_price3*k31_amount3;  // 품목최종가격 3 변수 선언 및 초기화
		int k31_sum = k31_result1 + k31_result2 + k31_result3; //합계금액	
		double k31_taxRate = 0.1; //과세율
		int k31_netPrice = netprice(k31_sum, k31_taxRate); //세전 금액 계산
		int k31_tax = (k31_sum - k31_netPrice);	//부가세 계산		
		
		//출력부		
		System.out.println("		\"국민가게다이소\"");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부, 신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11 (서현\n동)");
		
		System.out.println("================================================");
		System.out.println("         소비자중심경영(CCM) 인증기업");
		System.out.println("         ISO 9001 품질경영시스템 인증기업");
		System.out.println("================================================");
		System.out.println("        교환/환불 14일 (03월12일) 이내,");
		System.out.println("(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("      포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("       체크카드 취소 시 최대 7일 소요");
		System.out.println("================================================");
		System.out.printf("[POS 1058231] %34s\n", sdt.format(calt.getTime()));
		System.out.println("================================================");
		
		System.out.printf("%s %10s %2s %11s\n[%s]\n", subStrByte(k31_itemName1,22), df.format(k31_price1), df.format(k31_amount1), df.format(k31_result1), k31_itemCode1);
		System.out.printf("%s %10s %2s %11s\n[%s]\n", subStrByte(k31_itemName2,22), df.format(k31_price2), df.format(k31_amount2), df.format(k31_result2), k31_itemCode2);
		System.out.printf("%s %10s %2s %11s\n[%s]\n", subStrByte(k31_itemName3,22), df.format(k31_price3), df.format(k31_amount3), df.format(k31_result3), k31_itemCode3);
		
		System.out.printf("			과세합계 %15s\n", df.format(k31_netPrice));
		System.out.printf("			  부가세 %15s\n", df.format(k31_tax));		
		
		System.out.println("------------------------------------------------");
		System.out.printf("판매합계 %39s\n", df.format(k31_sum));
		System.out.println("================================================");
		System.out.printf("신용카드 %39s\n", df.format(k31_sum));
		System.out.println("------------------------------------------------");
		System.out.println("우리카드			538720**********");
		System.out.printf("승인번호 77982843(0)	     승인금액 %10s\n", df.format(k31_sum));
		System.out.println("------------------------------------------------");
		System.out.printf("%30s 분당서현점\n", sdt.format(calt.getTime()));
		System.out.println("상품 및 기타 문의 : 1522-4400");
		System.out.println("멤버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.println("	    ││││ ││ ││││ │││ ││││││");
		System.out.println("	    ││││ ││ ││││ │││ ││││││");
		System.out.println("		2112820610158231");
	
	
		System.out.println("------------------------------------------------");
		System.out.println("◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서\n "
						+ " 회원가입 후 다양한 혜택을 누려보세요! ◈");
	}
	
	//메소드 부분
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate)+0.5);
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
           
           if(k31_sb.toString().getBytes().length == 21) { // byte가 15라면
              k31_sb.append(" "); // String sb에 공백 추가
           }
           
           return k31_sb.toString(); 
        }	       
  }
	
//	public static String substringByBytes(String str, int beginBytes, int endBytes) {
//	    if (str == null || str.length() == 0) {
//	        return ("");
//	    }
//	 
//
//	     if (beginBytes < 0) {
//	        beginBytes = 0;
//	    }
//
//	    if (endBytes < 1) {
//	        return ("");	  
//	    }
//
//	    int len = str.length();
//
//	    int beginIndex = -1;
//	    int endIndex = 0;
//
//	    int curBytes = 0;
//	    String ch = null;
//	    for (int i = 0; i < len; i++) {
//	        ch = str.substring(i, i + 1);
//	        curBytes += ch.getBytes().length;
//	 
//
//	        if (beginIndex == -1 && curBytes >= beginBytes) {
//	            beginIndex = i;
//	        }
//
//	        if (curBytes > endBytes) {
//	            break;
//	        } else {
//	            endIndex = i + 1;
//	        }
//	    }
//	 
//
//	    return str.substring(beginIndex, endIndex);
//	}
	

}
