package Lecture05_File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f = new File("C:\\Users\\local pc\\Desktop\\fileTest.txt"); // ���� ��� ����
			FileWriter fw = new FileWriter(f); // FileWriter ��ü ����

			fw.write("�ȳ� ����\n"); // ���Ͽ� �Է�
			fw.write("Hello  ��� \n"); // ���Ͽ� �Է�

			fw.close(); // fw ���� ����

			FileReader fr = new FileReader(f); // FileReadr ��ü ����

			int n = -1; // while break�� ���� ���� ����
			char[] ch; // char �迭 ����

			while (true) { // while ��� �ݺ� break ���� ������
				ch = new char[100]; // ch �迭�� ���̴� 100
				n = fr.read(ch); // n�� fr�� ch read�� �о n�� �Է�

				if (n == -1) // n�� -1�̸�
					break; // �ݺ��� Ż��

				for (int i = 0; i < n; i++) { // i�� 0���� n���� �ݺ�
					System.out.printf("%c", ch[i]); // ch�迭 i��° �� ���
				}
			}
			fr.close(); // fr ����
			System.out.println("FILE READ END"); // file read �Ϸ� ���
		} catch (Exception e) { // ���� ���
			System.out.println("����");
		}

	}

}
