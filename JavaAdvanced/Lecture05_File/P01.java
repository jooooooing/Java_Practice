package Lecture05_File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f = new File("C:\\Users\\local pc\\Desktop\\fileTest.txt"); // 파일 경로 지정
			FileWriter fw = new FileWriter(f); // FileWriter 객체 선언

			fw.write("안녕 파일\n"); // 파일에 입력
			fw.write("Hello  헬로 \n"); // 파일에 입력

			fw.close(); // fw 파일 종료

			FileReader fr = new FileReader(f); // FileReadr 객체 선언

			int n = -1; // while break를 위한 변수 선언
			char[] ch; // char 배열 선언

			while (true) { // while 계속 반복 break 만날 때까지
				ch = new char[100]; // ch 배열의 길이는 100
				n = fr.read(ch); // n은 fr로 ch read를 읽어서 n에 입력

				if (n == -1) // n이 -1이면
					break; // 반복문 탈출

				for (int i = 0; i < n; i++) { // i는 0부터 n까지 반복
					System.out.printf("%c", ch[i]); // ch배열 i번째 값 출력
				}
			}
			fr.close(); // fr 종료
			System.out.println("FILE READ END"); // file read 완료 출력
		} catch (Exception e) { // 에러 출력
			System.out.println("에러");
		}

	}

}
