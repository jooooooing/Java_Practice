package Lecture_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mobile_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		ArrayList<String> result = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		String info = null;

		System.out.println("Please input infomation(names and scores)");
		for (int i = 0; i < 5; i++) {
			info = scan.nextLine();
			list.add(info);
		}

		for (int i = 0; i < list.size(); i++) {
			scoreList.add(Integer.parseInt(list.get(i).substring(list.get(i).length() - 2)));
		}

		Collections.sort(scoreList);

		for (int i = 4; i > -1; i--) {
			for (int j = 0; j < 5; j++) {
				if (list.get(j).contains(Integer.toString(scoreList.get(i)))) {
					result.add(list.get(j).substring(0, list.get(j).length() - 3));
				}
			}
		}
		System.out.println("#Rank" + "\n" + result);
	}
}
