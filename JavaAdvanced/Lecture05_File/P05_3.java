package Lecture05_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P05_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\day_data.StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f1));
		
		File f2 = new File("C:\\Users\\local pc\\Desktop\\실습데이터\\A005930.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));		
		
		String k31_readCsv;	// File을 읽어서 저장할 Stirng 선언
		int k31_cnt = 0;
		
		while ((k31_readCsv = br.readLine()) != null) {
			String[] k31_csvField = k31_readCsv.split(",");			
			if(k31_csvField[2].equals("A005930") == true) {
				bw.write(k31_readCsv.toString());
				bw.newLine();
				k31_cnt ++;
			}			
		}
		
		br.close();
		System.out.println("Program End\n" + "total record count : " + k31_cnt);
		bw.close();		

	}

}
