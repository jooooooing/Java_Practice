package Lecture_05;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print("abc", 2);
		print("kim", 6);
		print("lee", "kim");

	}
	
	public static void print(String text, int a) {
		System.out.println(text + a);
	}
	
	public static void print(String text, String text2) {
		System.out.println(text + text2);
	}

}
