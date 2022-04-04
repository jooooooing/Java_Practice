package Lecture_07;

public class P4_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArray = { 2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20 };

		int min = 0;
		int max = 0;

		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[i]; j++) {
				if (numArray[i] > numArray[(numArray.length - 1)]) {
					min = numArray[(numArray.length - 1)];
					max = numArray[i];
				} else if (numArray[i] < numArray[(numArray.length - 1)]) {
					min = numArray[i];
					max = numArray[(numArray.length - 1)];
				}

			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
