package Lecture_10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line = "abc";
		
		try {
			System.out.println(line.charAt(2));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		System.out.println("Hello world");
	}

}
