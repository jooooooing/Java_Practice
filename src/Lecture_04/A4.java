package Lecture_04;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String[] arrayWord;

		System.out.println("#Menu\n1. Encryption\n2. Decryption\n");
		int inputMenu = scan.nextInt();

		String encryStr; // ���ڿ� + 4 //
		String decryStr; // ���ڿ� - 4 //

		String inputStr = scan.next();
		char[] charArr = inputStr.toCharArray(); // ���ڸ� �ѱ��ھ� ������ �迭�� ����

		for (int i = 0; i < charArr.length; i++) {
			char[] arraySave = new char[charArr.length];
			if (inputMenu == 1) {
				arraySave[i] = (char) (charArr[i] + 4);
				System.out.print(arraySave[i]);
			} else if (inputMenu == 2) {
				arraySave[i] = (char) (charArr[i] - 4);
				System.out.print(arraySave[i]);
			} 
		}
	}
}
