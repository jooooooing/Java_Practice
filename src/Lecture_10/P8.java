package Lecture_10;

import java.util.Arrays;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int sizeOfArray = scan.nextInt();	
		scan.nextLine();
		System.out.println(sizeOfArray);
		String[] numArray = new String[sizeOfArray];	
		
		
		String inputNums = scan.nextLine();
		numArray = inputNums.split(" ");
		System.out.println(inputNums);
		
//			
//		


//
//		try {
//			Arrays.sort(numArray);
//			System.out.println(numArray);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("finally");
//		}

	}

}
