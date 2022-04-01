package Lecture_06;

import java.util.Scanner;

public class A1Class {
	Scanner scan = new Scanner(System.in);
	
	int chooseMenu;
	String savedCourse;
	int pickCourse;
	
	public A1Class() {
		// TODO Auto-generated constructor stub
	}

	public A1Class(int chooseMenu) {
		this.chooseMenu = chooseMenu;
	}

	public void printMenu() {
		System.out.println("# Menu\n1. Course list\n2. My course");

		int chooseMenu = scan.nextInt();
		this.chooseMenu = chooseMenu;
	}

	public void printCourse() {
		if (chooseMenu == 1) {
			System.out.println(
					"# Course List\n1. Korean\n2. Math\n3. English\n4. Social Studies\n5. Science\n0. Back to Main");
			int pickCourse = scan.nextInt();
			this.pickCourse = pickCourse;
		} else if (chooseMenu == 2) {
			System.out.println("# My Course\n ");
		}
	}

	public void saveCourse() {
		if (this.pickCourse == 1) {
			this.savedCourse = "\"Korean\"";
		} else if (this.pickCourse == 2) {
			this.savedCourse = "\"Math\"";
		} else if (this.pickCourse == 3) {
			this.savedCourse = "\"English\"";
		} else if (this.pickCourse == 4) {
			this.savedCourse = "\"Social Studies\"";
		} else if (this.pickCourse == 5) {
			this.savedCourse = "\"Science\"";
		} else if (this.pickCourse == 6) {
			printMenu();
		}

	}

	public void myCourse() {

	}

	public void printData() {
		if (pickCourse < 6) {
			System.out.println(this.savedCourse + " is registered.");
		} else {

		}
	}

}
