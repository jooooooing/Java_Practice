package Lecture_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		System.out.println("Please input First Word");
		String inputWord1 = scan.nextLine();
		String[] word1Array = inputWord1.split("");

		System.out.println("Please input Second Word");
		String inputWord2 = scan.nextLine();
		String[] word2Array = inputWord2.split("");

		for (int i = 0; i < word1Array.length; i++) {
			list1.add(word1Array[i]);
		}

		for (int i = 0; i < word2Array.length; i++) {
			list2.add(word2Array[i]);
		}

		int count = 0;

		if (list1.size() <= list2.size()) {
			for (int i = 0; i < list2.size(); i++) {
				if (list1.contains(list2.get(i))) {
					count = count + 1;
				}
			}
		} else if (list1.size() > list2.size()) {
			for (int i = 0; i < list1.size(); i++) {
				if (list2.contains(list1.get(i))) {
					count = count + 1;
				}
			}
		}

		System.out.println("1 : " + list1.size());
		System.out.println("2 : " + list2.size());
		System.out.println("3 : " + count);
	}

}
