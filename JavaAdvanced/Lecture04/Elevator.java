package Lecture04;

public class Elevator {
	int k31_limit_up_floor = 10;
	int k31_limit_down_floor = 0;
	int k31_floor = 1;
	String k31_help;

	void up() {
		if (k31_floor == k31_limit_up_floor) {
			k31_help = "���������Դϴ�";
		} else {
			k31_floor++;
			k31_help = String.format("%d���Դϴ�", k31_floor);
		}
	}

	void down() {
		if (k31_floor == k31_limit_down_floor) {
			k31_help = "ó�����Դϴ�.";
		} else {
			k31_floor--;
			k31_help = String.format("%d���Դϴ�.", k31_floor);
		}
	}
}
