package Lecture_10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class threadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);

		System.out.println(dateAndTime);
		System.out.println("start");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		time = new Date();
		dateAndTime = format.format(time);
		System.out.println(dateAndTime);
		System.out.println("end");
	}

}
