package Lecture_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			list.add(Integer.toString((int) (Math.random() * 1000)));
		}

		Collections.sort(list);
		System.out.println(list);

		for (int i = 0; i < 4; i++) {
			Collections.sort(list);
			System.out.print(list.get(i) + ", ");
		}

		for (int i = 6; i < 10; i++) {
			Collections.sort(list);
			System.out.print(list.get(i) + ", ");
		}
	}
}
