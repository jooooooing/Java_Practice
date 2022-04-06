package Lecture_09;

import java.util.ArrayList;
import java.util.Collections;

public class Ran1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> numList = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			numList.add(Integer.toString((int) (Math.random() * 1000)));			
		}

		Collections.sort(numList);
		System.out.println(numList);

		Collections.reverse(numList);
		System.out.println(numList);

	}

}
