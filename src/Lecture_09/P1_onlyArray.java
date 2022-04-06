package Lecture_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1_onlyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		String[] strArray = inputStr.split(" ");

		ArrayList<String> str = new ArrayList();
		
		Arrays.sort(strArray);	

		System.out.println(strArray);

	}

}
