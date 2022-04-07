package Lecture_10;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw = new FileWriter("C:\\Users\\local pc\\Desktop\\out.txt", false);
		for (int i = 15; i < 25; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}
		
		System.out.println("done");

		fw.close();

	}

}
