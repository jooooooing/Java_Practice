package Lecture_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arryListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name = new ArrayList();
		Scanner scan = new Scanner(System.in);
		
		name.add(scan.nextLine());
		name.add(scan.nextLine());
		name.add(scan.nextLine());
		name.add(scan.nextLine());
		name.add(scan.nextLine());
		
		Collections.sort(name);
		System.out.println(name);
	

	}

}
