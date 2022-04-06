package Lecture_09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> list = new LinkedList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		String numSeries = scan.nextLine();
		int pickNum = scan.nextInt();
		int count = 0;
		String[] cutInput = numSeries.split(" ");
		
		
		list.poll();
		System.out.println(list);
		
		
		
		
		

	}
}
