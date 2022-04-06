package Lecture_09;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class hashSetSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> name = new HashSet<String>();
		Scanner scan = new Scanner(System.in);

		name.add(scan.nextLine());
		System.out.println(name);
		name.add(scan.nextLine());
		System.out.println(name);
		name.add(scan.nextLine());
		System.out.println(name);
		name.add(scan.nextLine());
		System.out.println(name);
		name.add(scan.nextLine());
		System.out.println(name);
		
		TreeSet nameSet = new TreeSet();
		nameSet.addAll(name);		
	

	}

}
