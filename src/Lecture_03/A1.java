package Lecture_03;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int count = 1, max = 0, min = 0, sum = 0;
		float mean = 0;

		while (true) {
			System.out.println("�ϳ��� ������ �Է��ϼ���");
			int inputNumber = scan.nextInt();

			sum += inputNumber;

			if (count == 1) {
				max = inputNumber;
				min = inputNumber;
			} else {
				if (inputNumber > max) {
					max = inputNumber;
				}
				if (min > inputNumber) {
					min = inputNumber;
				}
			}
			
			mean = (sum / count);
			System.out.println("Result : " + count + " Mean " + mean + " Max " + max + " Min " + min);
			count ++;
		}

	}

}
