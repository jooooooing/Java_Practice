package Lecture_10;

import java.io.File;

public class listFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("C:\\Users\\local pc\\Desktop\\practice");
		File files[] = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}

	}

}
