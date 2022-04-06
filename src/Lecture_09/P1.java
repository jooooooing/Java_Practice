package Lecture_09;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		String[] strArray = inputStr.split(" ");

		ArrayList<String> str = new ArrayList();

		for (int i = 0; i < strArray.length; i++) {
			str.add(strArray[i]);
		}

		Collections.sort(str);
		System.out.println(str);

	}

}
