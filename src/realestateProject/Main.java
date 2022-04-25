package realestateProject;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main  extends Cal{

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		Merge merge = new Merge();
		merge.MergeFiles();
		int chooseMenu = 0;
		System.out.println("Choose Menu");
		Scanner scan = new Scanner(System.in);
		chooseMenu = scan.nextInt();
		
		Cal cal = new Cal();
		int numArr[] = cal.calFiles();
	
		
		while (true) {
			if (chooseMenu == 1) {
				Filter filter = new Filter();
				filter.filterFiles();
		     	Arrays.sort(numArr);
				divideHalf(numArr);		
				printResult(numArr);
				
			} else if (chooseMenu == 2) {
				Filter2 filter2 = new Filter2();
				filter2.filterFiles();
		     	Arrays.sort(numArr);
				divideHalf(numArr);		
				printResult(numArr);		
				
			} else {
				System.out.println("Wrong choice");
			}	

		}

		
	}

}
