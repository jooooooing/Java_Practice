package Review1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam01_r {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<String> s = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			s.add(scan.next());
		}
		System.out.println(resolve(s));
		scan.close();
		
	}
	
	public static String resolve (List<String> strings) {
		StringBuilder sb = new StringBuilder(str: "Hello ");
		for (String s : strings) {			
			sb.append(s).append(str:",");
		}
		
		return sb.substring(start: 0, sb.length() - 1) + ".";
	}

}
