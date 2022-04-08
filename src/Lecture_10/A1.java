package Lecture_10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A1 extends Thread {

	static int inputTime = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 thread = new A1();
		thread.start();
		System.out.println(getCurrentTime());
		Scanner scan = new Scanner(System.in);
		inputTime = scan.nextInt();		

	}

	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}

	public void run() {
		int cnt = 0;
		while (true) {
			if (cnt == inputTime) {
				break;
			}
			try {
				System.out.println(getCurrentTime() + "-" + cnt);
				Thread.sleep(inputTime * 1000);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}