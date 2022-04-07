package Lecture_10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\local pc\\Desktop\\out.csv");
		for (int i = 1; i < 11; i ++) {
			String data = i + "," + "ÇÐ»ý" + "\n";
			output.write(data.getBytes());
		}
		output.close();
	}

}
