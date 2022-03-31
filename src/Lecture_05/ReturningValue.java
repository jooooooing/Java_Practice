package Lecture_05;

public class ReturningValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum;
		sum = addOperation(5, 12);
		System.out.println(sum);
	}
	
	public static double addOperation(int a, int b) {
		int sum = a + b;
		double sum2 = 1.111;
		return sum2;
	}

}
