package Lecture_05;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int elementNum = scan.nextInt();
		int caseNum = scan.nextInt();
		int denominatorNum = elementNum - caseNum;

		printProcess(elementNum, denominatorNum, caseNum);

	}

	public static int elementFac(int elementNum) {
		if (elementNum == 1) {
			return 1;
		} else {
			return elementNum * elementFac(--elementNum);
		}
	}

	public static int caseFac(int caseNum) {
		if (caseNum == 1) {
			return 1;
		} else {
			return caseNum * caseFac(--caseNum);
		}
	}
	
	public static int denoFac(int denominatorNum) {
		if (denominatorNum == 1) {
			return 1;
		} else {
			return denominatorNum * denoFac(--denominatorNum);
		}
	}

	public static void printProcess(int elementNum, int denominatorNum, int caseNum) {

		System.out.print("C(" + elementNum + ", " + caseNum + ") = ");
		System.out.print(elementNum + "! / " + "(" + elementNum + "-" + caseNum + ")! / " + denominatorNum + "!" +" = ");

		for (int i = elementNum; i > 0; i--) {
			if (i == 1) {
				System.out.print(i + ") ");
			} else if (i == elementNum) {
				System.out.print("(" + i + " X ");
			} else {
				System.out.print(i + " X ");
			}
		}

		for (int i = denominatorNum; i > 0; i--) {
			if (i == 1) {
				System.out.print(i + ") ");
			} else if (i == denominatorNum) {
				System.out.print(" / (" + i + " X ");
			} else {
				System.out.print(i + " X ");
			}
		}
		
		for (int i = caseNum; i > 0; i--) {
			if (i == 1) {
				System.out.print(i + ") = ");
			} else if (i == caseNum) {
				System.out.print(" / (" + i + " X ");
			} else {
				System.out.print(i + " X ");
			}
		}
		

		System.out.print(elementFac(elementNum) + " / ");
		System.out.print(denoFac(denominatorNum) + " / ");
		System.out.print(caseFac(caseNum));
		
		System.out.println(" = " + resultPer(elementNum, denominatorNum, caseNum));

	}

	public static int resultPer(int elementNum, int denominatorNum, int caseNum) {
		return elementFac(elementNum) / denoFac(denominatorNum) / caseFac(caseNum);

	}

	public static void print(int elementNum, int denominatorNum) {
		System.out.println(elementNum);
		System.out.println(denominatorNum);
	}

}
