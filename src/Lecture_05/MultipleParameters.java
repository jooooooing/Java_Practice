package Lecture_05;

public class MultipleParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addOperation(5, 12);
		minusOperation(10, 3);
		multiOperation(3, 4);
		divOperation(20, 2);
	}

	public static void addOperation(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void minusOperation(int a, int b) {
		int minus = a - b;
		System.out.println(minus);
	}

	public static void multiOperation(int a, int b) {
		int multi = a * b;
		System.out.println(multi);
	}

	public static void divOperation(int a, int b) {
		if (b == 0) {
			System.out.println("please input postive int b");
		} else {
			int div = a / b;
			System.out.println(div);
		}

	}

}
