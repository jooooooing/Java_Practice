package Lecture_06;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		int[] numArray = new int[9];
		
		for (int i = 9; i > 0; i--) {
			numArray[i] = i;
			System.out.println(numArray[i]);
		}
		

	}

}
