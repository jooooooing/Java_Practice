package Lecture05_File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("C:\\Users\\local pc\\Desktop\\fileTest.txt");
			FileWriter fw = new FileWriter(f);
			
			fw.write("¾È³ç ÆÄÀÏ\n");
			fw.write("Hello  Çï·Î \n");
			
			fw.close();
			
			FileReader fr = new FileReader(f);
			
			int n = -1;
			char [] ch;
			
			while(true) {
				ch = new char[100];
				n = fr.read(ch);
				
				if (n == -1)
					break;
				
				for (int i =0; i < n; i ++) {
					System.out.printf("%c", ch[i]);
				}
			}
			
			fr.close();
			System.out.println("FILE READ END");
		}catch (Exception e) {
			System.out.println("¿¡·¯");
		}

	}

}
