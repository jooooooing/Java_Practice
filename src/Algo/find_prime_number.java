package Algo;

import java.util.ArrayList;

public class find_prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 6;
		solution(n1);

	}

	public static int solution(int n) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);

		for (int j = 3; j <= n; j++) {
			for (int i = 0; i < list.size(); i++) {
				if (j % list.get(i) != 0) {
					list.add(j);
				} else {
					continue;
				}
			}
		}

		answer = list.size();

		for (int item : list) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println("cnt : " + answer);
		return answer;
	}

}
