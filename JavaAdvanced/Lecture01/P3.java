package Lecture01;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k31_ii = 1000/3;
		System.out.printf("#3-1 : %d\n", k31_ii);
		k31_ii = 1000%3;
		System.out.printf("#3-2 : %d\n", k31_ii);

		for (int k31_i = 0; k31_i <20 ; k31_i++) {
			System.out.printf("#3-3 : %d ", k31_i);
			
			if (((k31_i+1)%5)==0) {
				System.out.print("\n");
			}
		}
	}

}
