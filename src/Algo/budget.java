package Algo;

import java.util.Arrays;

public class budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = { 1, 3, 2, 5, 4 };
		int budget = 9;

		solution(d, budget);

	}

	static int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {
			if (budget - d[i] >= 0) {
				budget -= d[i];
				answer++;
			}

		}

		return answer;

	}

}
