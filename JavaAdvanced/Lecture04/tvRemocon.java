package Lecture04;

public class tvRemocon {

	int k31_Limit_up_vol = 20;
	int k31_Limit_down_vol = 1;
	int k31_volumn = 4;
	String k31_volInfo;

	int k31_limit_up_ch = 99;
	int k31_limit_down_ch = 1;
	int k31_channel = 20;
	String k31_chInfo;

	void VolUp() {
		for (int i = 0; i < 10; i++) {
			k31_volumn ++;
		}
		if (k31_volumn == k31_Limit_up_vol) {
			k31_volInfo = "최대 음량입니다.";
		} else {
			k31_volInfo = String.format("음량은 %d입니다", k31_volumn);
		}
	}

	void VolDown() {
		for (int i = 0; i < 10; i++) {
			k31_volumn --;
		}
		if (k31_volumn == k31_Limit_down_vol) {
			k31_volInfo = "최소 음량입니다.";
		} else {
			k31_volInfo = String.format("음량은 %d입니다", k31_volumn);
		}
	}

	void chUp() {

		for (int i = 0; i < 10; i++) {
			k31_channel ++;
		}
		if (k31_channel == k31_limit_up_ch) {
			k31_chInfo = "최대 채널입니다.";
		} else {
			k31_chInfo = String.format("%d번입니다", k31_channel);
		}
	}

	void chDown() {
		for (int i = 0; i < 10; i++) {
			k31_channel --;
		}
		if (k31_channel == k31_limit_down_ch) {
			k31_chInfo = "최소 채널입니다.";
		} else {
			k31_chInfo = String.format("%d번입니다", k31_channel);
		}
}
}
