package Algo;

import java.util.ArrayList;
import java.util.List;

public class kakao_id {

	public static void main(String[] args) {

		String new_id = "...!@BaT#*...y.abcdefghijklm"; // 입력 1이상 1,000 이하의 문자열, 알파벳 대문자, 알파벳 소문자,
														// 숫자,
		// 특수문자(-_.~!@#$%^&*()=+[{]}:?,<>/)
//		String new_id = "a"; //입력 1이상 1,000 이하의 문자열, 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자(-_.~!@#$%^&*()=+[{]}:?,<>/)

		// 아이디의 길이는 3자 이상 15자 이하
		// 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표만 사용 (-, _, .)
		// 단, 마침표는 처음과 끝에 사용 불가하며 연속 사용 불가
		// 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천(중복 고려? 일단 x)

		System.out.println("input : " + new_id);

		// 길이 정제
		new_id = trimLength(new_id);
		System.out.println("trim : " + new_id);

		// 대문자를 소문자로
		new_id = convertString(new_id);
		System.out.println("convert : " + new_id);

		// 특수문자 제거
		new_id = new_id.replaceAll("[~!@#$%^&*()=+\\[{\\]}:?,<>/]", "");
		System.out.println("특수문자 제거" + new_id);

		// 마침표 처음과 끝 찾기
		new_id = dontDotDot(new_id);
		System.out.println("dontDotDot : " + new_id);

		new_id = deleteDot(new_id);
		System.out.println("deleteDot : " + new_id);

	}

	// 대소문자 변경
	private static String convertString(String new_id) {
		int tmp;
		String tmpString = "";

		for (int i = 0; i < new_id.length(); i++) {
			tmp = (int) new_id.charAt(i);

			if ((65 <= tmp) && (tmp <= 90)) {
				tmpString += (char) (tmp + 32);
			} else {
				tmpString += (char) tmp;
			}
		}

		return tmpString;
	}

	// 길이 자르기
	private static String trimLength(String new_id) {

		boolean lengthOk = false;
		while (lengthOk != true) {
			if (new_id.length() > 15) {
				new_id = new_id.substring(0, 15);
				lengthOk = true;
			} else if (new_id.length() < 3) {
				new_id += "1";
			} else {
				lengthOk = true;
			}
		}
		return new_id;
	}

	private static String deleteDot(String new_id) {
		// 마침표 처음과 끝 찾기
		char[] tempChar = new char[new_id.length()];
		for (int i = 0; i < new_id.length(); i++) {
			tempChar[i] = new_id.charAt(i);
		}

		// 처음과 끝의 마침표를 빈문자로 치환함
		if (tempChar[0] == '.') {
			tempChar[0] = '\0';
		} else if (tempChar[new_id.length() - 1] == '.') {
			tempChar[new_id.length() - 1] = '\0';
		}

		List<String> list = new ArrayList<>();

		for (int i = 0; i < tempChar.length; i++) {
			if (tempChar[i] != '\0') {
				list.add(Character.toString(tempChar[i]));
			}
		}

		new_id = ""; // 초기화 한번 해줌
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println();
			new_id += list.get(i); // .을 제거한 값을 다시 넣어줌
		}

		return new_id;
	}

	private static String dontDotDot(String new_id) {
		char[] tempChar = new char[new_id.length()];
		for (int i = 0; i < new_id.length(); i++) {
			tempChar[i] = new_id.charAt(i);
		}

		List<String> list = new ArrayList<>();

		list.add(Character.toString(tempChar[0]));

		for (int i = 1; i < tempChar.length; i++) {
			if (tempChar[i] == '.' && tempChar[i] == tempChar[i - 1]) {
				list.remove(Character.toString(tempChar[i]));
			} else {
				list.add(Character.toString(tempChar[i]));
			}
		}

		new_id = "";
		for (int i = 0; i < list.size(); i++) {
			new_id += list.get(i);
		}

		return new_id;

	}

}
