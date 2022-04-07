package Lecture_10;

public class tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 5, 10, 22 };

		try {
			System.out.println(numbers[3]);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointerException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(numbers[2]);
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("General exception");
		} finally {
			System.out.println("finally");
		}
	}

}
