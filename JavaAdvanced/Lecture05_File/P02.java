package Lecture05_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P02 {

	public static void FileWrite() throws IOException { //FileWrite �޼ҵ� 
		File f = new File("C:\\Users\\local pc\\Desktop\\fileTest2.txt"); // file ��ü ����
		BufferedWriter bw = new BufferedWriter(new FileWriter(f)); // BufferedWrite ��ü ����

		bw.write("hi file"); // bw �Է�
		bw.newLine(); // newLine
		bw.write("Hello world"); // bw�Է�
		bw.newLine(); // newLine

		bw.close(); // bw ����
	}

	public static void FileRead() throws IOException { //FileRead �޼ҵ� 
		File f = new File("C:\\Users\\local pc\\Desktop\\fileTest2.txt"); // file ��ü ����
		BufferedReader br = new BufferedReader(new FileReader(f)); // Bufferedreader ��ü ����
		String readtxt; // String ���� ���� �� �ʱ�ȭ

		while ((readtxt = br.readLine()) != null) { //readLin ���� �� ������� �ʴٸ�
			System.out.printf("%s\n", readtxt); //readtxt ���
		}

		br.close(); //br ����
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWrite();
		FileRead();

	}

}
