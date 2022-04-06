package Lecture_09;

import java.util.ArrayList;
import java.util.Collections;

public class PArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList();
		name.add("kim");
		name.add("lee");
		name.add("John");

		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(2));

		name.remove(1);
		System.out.println(name);

		name.set(1, "park");
		System.out.println(name);
		System.out.println(name.size());

		name.add("lee");
		System.out.println(name);

		Collections.sort(name);
		System.out.println(name);

		Collections.reverse(name);
		System.out.println(name);

	
	}

}
