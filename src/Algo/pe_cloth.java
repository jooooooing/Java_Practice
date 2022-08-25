package Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pe_cloth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int[] lost = { 2, 3, 5 };
		int[] reserve = { 2, 3, 5 };

		solution(n, lost, reserve);

	}

	private static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int sameCnt = 0;

		List<Integer> answerlist = new ArrayList<>();
		List<Integer> lostList = new ArrayList<>();
		List<Integer> reserveList = new ArrayList<>();

		for (int element : lost) {
			lostList.add(element);
		}

		for (int element : reserve) {
			reserveList.add(element);
		}
		
		// 분실자가 없는 경우 answer = 학생 수
		if (lost.length == 0) {
			answer = n;
			// 분실자가 있는 경우
		} else {
			// 분실자와 여벌자가 같은 경우를 카운팅함
			for (int i = 0; i < lost.length; i++) {
				for (int j = 0; j < reserve.length; j++) {
					if (lost[i] == reserve[j]) {
						sameCnt++;
						answerlist.add(lost[i]);
						lostList.remove(Integer.valueOf(lost[i]));
						answer = answerlist.size();
					}
				}
			}

			// 아무도 없는 경우 answer = 학생수 - 분실자
			if (sameCnt == 0) {
				answer = n - lost.length;
			} else {
				for (int i = 0; i < lostList.size(); i++) {
					for (int j = 0; j < reserveList.size(); j++) {
						if (lostList.get(i) + 1 == reserve[j]) {
							answerlist.add(lostList.get(i));
							lostList.remove(lostList.get(i));
							answer = answerlist.size();
						}
					}
				}
			}
		}

		System.out.println(answer);

		return answer;
	}

}
