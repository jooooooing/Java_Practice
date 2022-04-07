package Lecture_10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileExist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fw = new File("C:\\Users\\local pc\\Desktop\\out.txt");
			
		System.out.println(fw.exists());
		if (fw.exists()) {
			fw.delete();
		}
		
		System.out.println(fw.exists());	

	}

}
