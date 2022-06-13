package Review1;

import java.util.Scanner;

public class exam01 {	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		String[] strArr = new String[inputNum];
		for (int i = 0; i < inputNum; i++) {
			String inputStr = scanner.next();
			strArr[i] = inputStr;
		}
		System.out.println(resolve(inputNum, strArr));
	}

	public static String resolve(int num, String[] strArr) {

		String Answer = "";
//		StringBuffer Answer = new StringBuffer("Hello "); String은 불변이고 가변하게하여 메모리 절약 StringBuilder가 더 빠름, StringBuffer는 멀티쓰레드용
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			if (cnt == num - 1) {
				Answer += strArr[i] + ".";
			} else {
				Answer += strArr[i] + ",";
			}
			cnt++;
		}

		Answer = "Hello " + Answer;

		return Answer;

	}

}
