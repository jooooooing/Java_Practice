package Review1;

import java.util.Scanner;

public class review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input first String");
		String str1 = scan.nextLine();
		
		System.out.println("Please input second String");
		String str2 = scan.nextLine();

		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();

		int cnt = 0;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1Arr[i] == str2Arr[j]) {
					cnt++;
				}
			}
		}

		if (cnt == str1.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
