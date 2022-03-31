package Lecture_05;

public class P2 {
	
	public static final int johnsAge = 37;
	public static final int katesAge = 55;
	public static int mikeAge = 31;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mikeAge = 30;
		printAge(mikeAge);

	}
	
	public static void printAge(int personAge) {
		System.out.println("Age : " + personAge);
	}

}
