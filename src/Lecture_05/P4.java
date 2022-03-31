package Lecture_05;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String inputFormula = scan.next();
		int index = inputFormula.indexOf("+");
		char findOper = inputFormula.charAt(index);
				
		
	}
		
	public static void findOper () {
		
		if (findOper == "+") {
			String front = inputFormula.substring(0, index);
			String oper = inputFormula.substring(index, index+1);
			String back = inputFormula.substring(index+1);
			
			double intFront = Double.parseDouble(front);
			double intBack= Double.parseDouble(back);			
			
			String front = inputFormula.substring(0, index);
			String oper = inputFormula.substring(index, index+1);
			String back = inputFormula.substring(index+1);
			
			double intFront = Double.parseDouble(front);
			double intBack= Double.parseDouble(back);
					
			System.out.println(front);
			System.out.println(oper);
			System.out.println(back);
			
			System.out.println(intFront+intBack);
		}
		
		
		
		}

	public static void calculator(String oper, double num1, double num2) {
		if (oper == "+") {
			double sum = num1 + num2;		
			System.out.println(sum);			
		} else if (oper == "-") {
			double minus = num1 - num2;
			System.out.println(minus);			
		} else if (oper == "*") {
			double multi = num1 * num2;
			System.out.println(multi);
		} else if (oper == "/") {
			if (num2 == 0) {
				System.out.println("please input postive int b");
			} else {
				double div = num1/num2;
				System.out.println(div);
			}			
		}		
	}
	
}
