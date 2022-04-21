package Lecture05_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P05_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\day_data\\THTSKS010H00.dat");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		File f1 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\day_data.StockDailyPrice.csv");
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
		
		String k31_readtxt; // File을 읽어서 저장할 Stirng 선언
		
		int k31_LineCnt = 0;
		int k31_wcnt = 0;

		while ((k31_readtxt = br.readLine()) != null) {
			StringBuffer k31_s = new StringBuffer();
			String[] k31_field = k31_readtxt.split("%_%");
			
			if (k31_field.length> 2&&k31_field[2].replace("^","").trim().substring(0,1).equals("A")) {
			k31_s.append(k31_field[0].replace("^", "").trim());
			for (int j = 1; j < k31_field.length; j++) {
				k31_s.append("," + k31_field[j].replace("^", "").trim());
			}
			
			bw1.write(k31_s.toString());
			bw1.newLine();
			k31_wcnt ++;
		}		
			k31_LineCnt ++;
		}
		
		br.close();
		bw1.close();
		
		System.out.printf("Program End [%d][%d]records\n", k31_LineCnt, k31_wcnt);
		br.close();
		

	}

}
