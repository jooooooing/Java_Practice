package Lecture_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class BufferedReaderP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader f = new FileReader("C:\\Users\\local pc\\Desktop\\trafficvolume.csv");
		BufferedReader b = new BufferedReader(f);
		String row;

		while ((row = b.readLine()) != null) {
			Stream<String> i = b.lines();
			i.filter(line -> line.contains("¸ñ")).findFirst().ifPresent(System.out::println);

//				 i.filter(row -> row.contains("14½Ã"))
//				 .findFirst()
		}
		b.close();
		f.close();

	}

}
