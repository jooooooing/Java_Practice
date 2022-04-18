package Lecture03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P04 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calt = Calendar.getInstance(); //Calendar 메소드 선언
		DecimalFormat df = new DecimalFormat ( "###,###,###,###"); // 콤마찍기 메소드
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		//변수 선언
		String k31_itemName1= "퓨어에어 비말차단용마스크(최고급)";
		String k31_itemCode1= "1031615";
		int k31_price1 = 3000;
		int k31_amount1 = 1;
		int k31_result1 = k31_price1*k31_amount1;
		String k31_itemName2= "슬라이드식명찰(가로형)(100호)";
		String k31_itemCode2= "1008152";
		int k31_price2 = 1000;
		int k31_amount2 = 1;
		int k31_result2 = k31_price2*k31_amount2;
		String k31_itemName3= "매직흡착 인테리어후크(알루미늄타입)";
		String k31_itemCode3= "1020800";
		int k31_price3 = 1000;
		int k31_amount3 = 1;
		int k31_result3 = k31_price3*k31_amount3;
		int k31_sum = k31_result1 + k31_result2 + k31_result3;		
		double k31_taxRate = 0.1;
		int k31_netPrice = netprice(k31_sum, k31_taxRate);
		int k31_tax = (k31_sum - k31_netPrice);			
		int endBytes = 26;				
		
		//출력부
		
		System.out.println("		\"국민가게다이소\"");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화 : 031-702-6016");
		System.out.println("본사 : 서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표 : 박정부, 신호섭 213-81-52063");
		System.out.println("매장 : 경기도 성남시 분당구 분당로53번길 11(서현동)");
		
		System.out.println("==================================================");
		System.out.println("소비자중심경영(CCM) 인증기업");
		System.out.println("ISO 9001 품질경영시스템 인증기업");
		System.out.println("==================================================");
		System.out.println("교환/환불 14일 (03월 12일) 이내,");
		System.out.println("(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("체크카드 취소 시 최대 7일 소요");
		System.out.println("==================================================");
		System.out.printf("[POS 1058231] %35s\n", sdt.format(calt.getTime()));
		System.out.println("==================================================");
		
		System.out.printf("%s  %5s %5s %8s\n[%s]\n", substringByBytes(k31_itemName1,0, endBytes), df.format(k31_price1), df.format(k31_amount1), df.format(k31_result1), k31_itemCode1);
		System.out.printf("%s  %5s %5s %8s\n[%s]\n", substringByBytes(k31_itemName2,0, endBytes), df.format(k31_price2), df.format(k31_amount2), df.format(k31_result2), k31_itemCode2);
		System.out.printf("%s  %5s %5s %8s\n[%s]\n", substringByBytes(k31_itemName3,0, endBytes), df.format(k31_price3), df.format(k31_amount3), df.format(k31_result3), k31_itemCode3);
		
		System.out.printf("			과세합계 %15s\n", df.format(k31_netPrice));
		System.out.printf("			  부가세 %15s\n", df.format(k31_tax));
		
		
		System.out.println("--------------------------------------------------");
		System.out.printf("판매합계 %39s\n", df.format(k31_sum));
		System.out.println("==================================================");
		System.out.printf("신용카드 %39s\n", df.format(k31_sum));
		System.out.println("--------------------------------------------------");
		System.out.println("우리카드			538720**********");
		System.out.printf("승인번호 77982843(0)		  승인금액 %s\n", df.format(k31_sum));
		System.out.println("--------------------------------------------------");
		System.out.printf("%30s 분당서현점\n", sdt.format(calt.getTime()));
		System.out.println("상품 및 기타 문의 : 1522-4400");
		System.out.println("멤버십 및 샵다이소 관련 문의 : 1599-2211");
		System.out.println("	    ││││ ││ ││││ │││ ││││││");
		System.out.println("	    ││││ ││ ││││ │││ ││││││");
		System.out.println("		2112820610158231");
	
	
		System.out.println("--------------------------------------------------");
		System.out.println("◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서\n "
						+ "회원가입 후 다양한 혜택을 누려보세요!◈");
		
		

	}
	
	public static int netprice(int price, double rate) {
		return (int) (price / (1 + rate)+0.5);
	}
	
	public static String substringByBytes(String str, int beginBytes, int endBytes) {
	    if (str == null || str.length() == 0) {
	        return ("");
	    }
	 

	     if (beginBytes < 0) {
	        beginBytes = 0;
	    }

	    if (endBytes < 1) {
	        return ("");	  
	    }

	    int len = str.length();

	    int beginIndex = -1;
	    int endIndex = 0;

	    int curBytes = 0;
	    String ch = null;
	    for (int i = 0; i < len; i++) {
	        ch = str.substring(i, i + 1);
	        curBytes += ch.getBytes().length;
	 

	        if (beginIndex == -1 && curBytes >= beginBytes) {
	            beginIndex = i;
	        }

	        if (curBytes > endBytes) {
	            break;
	        } else {
	            endIndex = i + 1;
	        }
	    }
	 

	    return str.substring(beginIndex, endIndex);
	}
}
