package Lecture_04;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArr[] = new int[5], row = 1; // 배열 생성

		for (int i = 0; i < numArr.length; i++) { //
			numArr[i] = (int) (Math.random() * 9); // 배열[i]번째에 난수를 담는다.
			System.out.print(numArr[i]);
			System.out.print("*");

			if (i % 2 == 0) { // 1,3,5행 //
				for (int j = 0; j < numArr[i]; j++) {
					System.out.print("*");
				}
				for (int k = 8 - numArr[i]; k > 0; k--) {
					System.out.print(" ");
				}
			}

			if (i % 2 == 1) { // 2, 4행 //
				for (int j = 0; j < numArr[i]; j++) {
					System.out.print(" ");
				}
				for (int k = 8 - numArr[i]; k > 0; k--) {
					System.out.print("*");
				}
			}
			System.out.println("*");
		}
	}
}
