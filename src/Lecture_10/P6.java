package Lecture_10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String realTime = format.format(time);	
			
		System.out.println(realTime);
		
		Scanner scan = new Scanner(System.in);
		int second = scan.nextInt();
		
		String afterTime = null;
		
		if (second != 0) {			
			try {
				Thread.sleep((second*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		time = new Date();	
		afterTime = format.format(time);		
		System.out.println("Time is over (" + afterTime + ")");	
		
	
	}

}
