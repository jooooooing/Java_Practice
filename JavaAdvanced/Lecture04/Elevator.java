package Lecture04;

public class Elevator {
	int k31_limit_up_floor = 10; //최상위 층
	int k31_limit_down_floor = 0; //최하위 층
	int k31_floor = 1; //현재층
	String k31_help; //안내멘트 변수 선언

	void up() {
		if (k31_floor == k31_limit_up_floor) {
			k31_help = "마지막층입니다";
		} else {
			k31_floor++;
			k31_help = String.format("%d층입니다", k31_floor);
		}
	}

	void down() {
		if (k31_floor == k31_limit_down_floor) {
			k31_help = "처음층입니다.";
		} else {
			k31_floor--;
			k31_help = String.format("%d층입니다.", k31_floor);
		}
	}
}
