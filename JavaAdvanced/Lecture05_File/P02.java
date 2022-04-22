package Lecture05_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P02 {

	public static void FileWrite() throws IOException { //FileWrite 메소드 
		File f = new File("C:\\Users\\local pc\\Desktop\\fileTest2.txt"); // file 객체 선언
		BufferedWriter bw = new BufferedWriter(new FileWriter(f)); // BufferedWrite 객체 선언

		bw.write("hi file"); // bw 입력
		bw.newLine(); // newLine
		bw.write("Hello world"); // bw입력
		bw.newLine(); // newLine

		bw.close(); // bw 종료
	}

	public static void FileRead() throws IOException { //FileRead 메소드 
		File f = new File("C:\\Users\\local pc\\Desktop\\fileTest2.txt"); // file 객체 선언
		BufferedReader br = new BufferedReader(new FileReader(f)); // Bufferedreader 객체 선언
		String readtxt; // String 변수 선언 및 초기화

		while ((readtxt = br.readLine()) != null) { //readLin 했을 때 비어있지 않다면
			System.out.printf("%s\n", readtxt); //readtxt 출력
		}

		br.close(); //br 종료
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWrite();
		FileRead();

	}

}
