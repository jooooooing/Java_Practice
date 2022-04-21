package Lecture05_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\local pc\\Desktop\\무료와이파이정보.CSV");
		BufferedReader br = new BufferedReader (new FileReader(f));
		
		String readtxt;
		
		if((readtxt = br.readLine())==null) {
			System.out.println("빈 파일입니다.");
			return;
		}
		
		String[] k31_field_name = readtxt.split(",");
		
		int k31_LineCnt = 0;
		while ((readtxt = br.readLine())!=null) {
			
			String[] k31_field = readtxt.split(",");
			System.out.printf("**[%d번째 항목]***********\n", k31_LineCnt);
			for (int j = 0; j < k31_field_name.length; j++) {
				System.out.printf(" %s : %s\n", k31_field_name[j], k31_field[j]);
			}
			System.out.println("****************************");
			if (k31_LineCnt == 100)
			break;
			k31_LineCnt ++;
		}
		
		br.close();

	}

}
