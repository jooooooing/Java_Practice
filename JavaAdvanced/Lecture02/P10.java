package Lecture02;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_iNum = 1001034567; // int 변수 선언 및 초기화
		String k31_sNum = String.valueOf(k31_iNum); // String 변수 선언 및 int형 Num변수를 String으로 변환
		String k31_sNumVoice = ""; // String 변수 선언 및 초기화
		System.out.printf("==> %s [%d자리]\n", k31_sNum, k31_sNum.length()); // 자리수 출력

		int k31_i, k31_j; // 변수 i j 선언

		String[] k31_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" }; // 배열 선언 및 입력, 숫자 부분 voice
		String[] k31_unitX = { " ", "십", "백", "천", "만", "십", "백", "천", "억", "십" }; // 배열 선언 및 입력, 자릿수 부분 voice

		k31_i = 0; // i 변수 선언 및 초기화
		k31_j = k31_sNum.length() - 1; // j 변수 선언 및 초기화 j = String Num변수의 글자 길이 -1
		
//		System.out.println(k31_sNum.substring(k31_i+3, k31_i + 4));

		while (true) { // while 반복문 break만날때까지 계속
			if (k31_i >= k31_sNum.length()) // 1씩 증가하는 i가 String Num 변수의 문장 길이보다 커지면
				break; // 멈춰라
			// i가 String Num 변수의 문장 길이보다 작을때는
			System.out.printf("%s[%s]", k31_sNum.substring(k31_i, k31_i + 1), //출력 String Num 문장의 자릿수
					k31_units[Integer.parseInt(k31_sNum.substring(k31_i, k31_i + 1))]); // 출력 String Num 문장의 자릿수 (배열에서 한글 음을 가져옴)

			if (k31_sNum.substring(k31_i, k31_i + 1).equals("0")) { // String Num 문장 자릿수가 0이고
				if (k31_unitX[k31_j].equals("만") || k31_unitX[k31_j].equals("억")) { //한글 음이 만 또는 억이면
					k31_sNumVoice = k31_sNumVoice + "" + k31_unitX[k31_j]; // NumVoice =  NumVocie + " " +   한글 음 '만' 또는 '억'을 더해줌
				} else { //한글 음이 만 또는 억이 아니라면
					// nothing 아무일도 없음
				}
			} else { // String Num 문장의 자릿수가 0이 아니라면 
				k31_sNumVoice = k31_sNumVoice + k31_units[Integer.parseInt(k31_sNum.substring(k31_i, k31_i + 1))] + k31_unitX[k31_j];
				// NumVoice = NumVoice + 숫자부분 voice를 배열 units에서 가져오고 + 자릿수부분 voice는 unitX에서 가져옴
			}
			k31_i++; // i에 1더하고 -> while 반복 재시작
			k31_j--; // j에 1빼고  -> while 반복 재시작
		}

		System.out.printf("\n %s[%s]\n", k31_sNum, k31_sNumVoice); //최종 출력

	}

}
