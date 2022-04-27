package Review1;

import java.util.Scanner;

public class review4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Current Date");		
		String inputCurrent = scan.nextLine();
		
		System.out.println("Birthday");
		String inputBirth = scan.nextLine();
		
		System.out.println("Current Date :\n" + inputCurrent);
		System.out.println("Birthday :\n" + inputBirth);
		
		String currentYear = inputCurrent.substring(0, 4);
		String currentDate = inputCurrent.substring(4, 8);
		
		String birthYear = inputBirth.substring(0, 4);
		String birthDate = inputBirth.substring(4, 8);				
		
		int yearGap = Integer.parseInt(currentYear) -  Integer.parseInt(birthYear);
		int dateGap = Integer.parseInt(currentDate) -  Integer.parseInt(birthDate);
		
		int koreanAge = 0;
		int intAge = 0;
		
		if (dateGap >= 0 ) {
			koreanAge = yearGap + 1;
			intAge = yearGap+1;
		} else {
			koreanAge = yearGap+1;
			intAge = yearGap-1;
		}
		
		System.out.println(koreanAge + "years old in Korean age");
		System.out.println(intAge + "years old in international age");
	}

}
