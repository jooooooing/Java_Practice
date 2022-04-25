package realestateProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Cal {
	static double percentile;
	static int quart1, half, quart3, full;
	static int[] lowerHalf, upperHalf;
	int[] arr;
	
	public static  int[] calFiles() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\local pc\\Desktop\\filesforpj\\filter.csv"));
		 String line = br.readLine();
		 int cnt = 0;
		 Path path = Paths.get("C:\\Users\\local pc\\Desktop\\filesforpj\\filter.csv");
		 int lineCount = (int) Files.lines(path).count();
		 int [] numArr = new int[lineCount-1];
		 while ((line = br.readLine()) != null) {
            if(line.contains(",")) {
                line = line.replaceAll(",","");
   		 }
   		 int num = Integer.parseInt(line);
   		 numArr[cnt] = num;
   		 cnt++;
         }
		 return numArr;
  }
	
	public static void divideHalf(int[] arr) {

		if (arr.length % 2 == 0) {
			lowerHalf = Arrays.copyOfRange(arr, 0, (arr.length / 2));
			upperHalf = Arrays.copyOfRange(arr, (arr.length / 2), (arr.length));

		} else if (arr.length % 2 == 1) {
			lowerHalf = Arrays.copyOfRange(arr, 0, (arr.length / 2));
			upperHalf = Arrays.copyOfRange(arr, (arr.length / 2) + 1, (arr.length));
		}

		quart1 = median(lowerHalf);
		half = median(arr);
		quart3 = median(upperHalf);
		full = arr[arr.length - 1];

	}

	public static int median(int[] arr) {
		int arrLength = arr.length;
		if (arrLength % 2 == 1) {
			return arr[arrLength / 2];
		} else {
			return (arr[arrLength / 2 - 1] + arr[arrLength / 2]) / 2;
		}
	}

	public static void printResult(int[] arr) {

		System.out.println("1������ : " + quart1);
		System.out.println("2������ : " + half);
		System.out.println("3������ : " + quart3);
		System.out.println("4������ : " + full);

	}

}
