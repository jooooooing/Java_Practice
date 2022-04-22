package Lecture05_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\local pc\\Desktop\\무료와이파이정보.CSV"); //파일 객체 선언 및 경로 지정
		BufferedReader br = new BufferedReader (new FileReader(f)); // BufferedReader 객체 선언
		
		String readtxt; // String 변수 선언
		
		if((readtxt = br.readLine())==null) { //readtxt 는 br.readLine 한 값인데 그 값이 비어있다면
			System.out.println("빈 파일입니다.");
			return;
		}
		
		String[] k31_field_name = readtxt.split(","); // Stinrg 배열 선언 및 readtxt를 쉼표(,)를 기준으로 split함
		
		int k31_LineCnt = 0; //lineCnut 변수 선언 및 초기화
		while ((readtxt = br.readLine())!=null) { //readtxt 는 br.readLine 한 값인데 그 값이 비어있지 않다면
			
			String[] k31_field = readtxt.split(","); // Stinrg 배열 선언 및 readtxt를 쉼표(,)를 기준으로 split함
			System.out.printf("**[%d번째 항목]***********\n", k31_LineCnt); //cnt 항목 출력
			for (int j = 0; j < k31_field_name.length; j++) { //항목 수만큼 반복
				System.out.printf(" %s : %s\n", k31_field_name[j], k31_field[j]); //항목 이름, 항목 값
			}
			System.out.println("****************************");
			if (k31_LineCnt == 100) //100번째에 도달하면
			break; // 종료
			k31_LineCnt ++;
		}
		
		br.close();

	}

}
