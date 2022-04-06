package Lecture_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input Number");
		int inputNum = scan.nextInt();

		int num1 = 0, num2 = 1, sum = 0;
		list.add(num1);
		list.add(num2);

		for (int i = 2; i < inputNum; i++) {
			sum = list.get(i - 2) + list.get(i - 1);
			list.add(sum);
		}
		
		System.out.println("The resut is");		
		System.out.println(list);
	}

}
