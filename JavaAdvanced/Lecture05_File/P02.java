package Lecture05_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P02 {
	
	public static void FileWrite() throws IOException {
		File f = new File ("C:\\Users\\local pc\\Desktop\\fileTest.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		
		bw.write("hi file");
		bw.newLine();
		bw.write("Hello world");
		bw.newLine();
		
		bw.close();			
	}
	
	public static void FileRead() throws IOException {
		File f = new File ("C:\\Users\\local pc\\Desktop\\fileTest.txt");
		BufferedReader br = new BufferedReader (new FileReader(f));
		
		String readtxt;
		
		while ((readtxt= br.readLine()) != null) {
			System.out.printf("%s\n", readtxt);
		}
		
		br.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWrite();
		FileRead();		

	}	


	}

