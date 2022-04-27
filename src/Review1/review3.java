package Review1;

import java.util.Scanner;

public class review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Please input 0 or 1");

		int cnt = 0;
		int[] numArr1 = new int[4];
		int[] numArr2 = new int[4];
		int[] numArr3 = new int[4];

		for (int i = 0; i < 4; i++) {
			int inputNum1 = scan.nextInt();
			numArr1[i] = inputNum1;
		}

		for (int i = 0; i < 4; i++) {
			int inputNum2 = scan.nextInt();
			numArr2[i] = inputNum2;
		}

		for (int i = 0; i < 4; i++) {
			int inputNum3 = scan.nextInt();
			numArr3[i] = inputNum3;
		}

		for (int i = 0; i < 4; i++) {
			cnt++;
			System.out.print(numArr1[i]);
			if (cnt == 4) {
				System.out.println();
				cnt = 0;
			}
		}

		for (int i = 0; i < 4; i++) {
			cnt++;
			System.out.print(numArr2[i]);
			if (cnt == 4) {
				System.out.println();
				cnt = 0;
			}
		}

		for (int i = 0; i < 4; i++) {
			cnt++;
			System.out.print(numArr3[i]);
			if (cnt == 4) {
				System.out.println();
				cnt = 0;
			}
		}
		boolean bingo = false;

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				if (((numArr1[i] + numArr1[i + 1] + numArr1[i + 2] + numArr1[i + 3]) == 0)
						|| ((numArr1[j] + numArr2[j] + numArr3[j]) == 0)) {
					bingo = true;
				}
			}
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				if (((numArr2[i] + numArr2[i + 1] + numArr2[i + 2] + numArr2[i + 3]) == 0)
						|| ((numArr1[j] + numArr2[j] + numArr3[j]) == 0)) {
					bingo = true;
				}
			}
		}

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {
				if (((numArr3[i] + numArr3[i + 1] + numArr3[i + 2] + numArr3[i + 3]) == 0)
						|| ((numArr1[j] + numArr2[j] + numArr3[j]) == 0)) {
					bingo = true;
				}
			}
		}

		if (bingo == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
