package Lecture_05;

import java.util.Scanner;

public class P3 {
	
	public static final String father = "Daniel";
	public static final String mother = "Jessica";
	public static final String son = "heungmin";
	public static final String daughter = "Jenny";
	public static final int a = 45;
	public static final int b = 40;
	public static final int c = 18;
	public static final int d = 14;
	public static final int fatherNum = 1, motherNum = 2, sonNum = 3, daughterNum = 4;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
				
		printMenu();
		int chooseNum = scan.nextInt();
		System.out.println(" -> " + chooseNum);
		printName(chooseNum);
		
	}
	
	public static void printMenu() {
		System.out.println("#Printing a Name");
		System.out.println("1. Father\n2. Mother\n3. Son\n4. Daughter");
	}
	

	public static void print(String text, int a) {
		System.out.println(text);
		System.out.println(a);
	}
	
	public static void printName(int chooseNum) {		
		if (chooseNum == fatherNum) {
			print(father, a);
		} else if (chooseNum == motherNum) {
			print(mother, b);
		} else if (chooseNum == sonNum) {
			print(son, c);
		} else if (chooseNum == daughterNum) {
			print(daughter, d);
		}
	}


}
