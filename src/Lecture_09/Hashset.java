package Lecture_09;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> name = new HashSet<String>();
		name.add("kim");
		System.out.println(name);
		name.add("lee");
		System.out.println(name);
		name.add("kim");
		System.out.println(name);
		
		System.out.println(name.size());

	}

}
