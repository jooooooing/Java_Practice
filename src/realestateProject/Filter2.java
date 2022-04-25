package realestateProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Filter2 {

	public static void filterFiles() throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader read = new BufferedReader(
				new FileReader("C:\\Users\\local pc\\Desktop\\filesforpj\\realEstateTransaction.csv"));
		String line;

		// create file
		PrintWriter pw = new PrintWriter("C:\\Users\\local pc\\Desktop\\filesforpj\\filter.csv");

		// Get input Values 
		System.out.println();
		System.out.println();		
		
		System.out.println("Input district for search (ex.강남구, 서초구, 송파구)");
		String loc = sc.nextLine();
		String[] locArr = loc.split(",");
		
		System.out.println();
		System.out.println("From year (ex.2006)");
		int fromYear = sc.nextInt();
		System.out.println();
		System.out.println("To year (ex.2021)");
		int toYear = sc.nextInt();		

		ArrayList<Integer> output = new ArrayList<Integer>();
		while ((line = read.readLine()) != null) {

			String[] cutLine = line.split("\\|");
			int date = 0;
			try {
				date = (Integer.parseInt(cutLine[6]) / 100);
			} catch (Exception e) {
				// TODO: handle exception
			}

			for (int j = fromYear; j <= toYear; j++) {
				for (int i = 0; i < locArr.length; i++) {
					if (cutLine[0].contains(locArr[i]) == true) {
						if (date >= fromYear && date <= toYear) {
							try {
								pw.println(cutLine[8]);
								pw.flush();
							} catch (Exception e) {
							}
						}
					}
				}
			}
		}
	}
}

//			for (int i = 0; i < locArr.length; i++) {
//				if (cutLine[0].contains(locArr[i]) == true) {
//					for (int j = fromYear; j <= toYear; j++) {
//						if (date >= fromYear && date <= toYear) {
//							try {
//								pw.println(cutLine[8]);
//								pw.flush();
//							} catch (Exception e) {
//							}
//						}
//					}
//				}
//			}
//
//		}

//		for( int i = 0; i < locArr.length; i++) {
//			if (cutLine[0].contains(locArr[i]) == true
//		}

	

		
		

//		ArrayList<Integer> output = new ArrayList<Integer>();
//		while ((line = read.readLine()) != null) {
//		
//			String[] cutLine = line.split("\\|");
//
//			int date=0;
//			try {
//				date = Integer.parseInt(cutLine[6]);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//
//
//			if (cutLine[0].contains(locArr[i]) == true) {
//				if (date >= firstDay && date <= secondDay) {
//
//					try {
//						pw.println(cutLine[8]);
//						pw.flush();
//					} catch (Exception e) {
//					}
//				}
//			} else {
//
//			}
//		}
		



