package Lecture04;

public class Elevator2 {
	private int k31_limit_up_floor; // 최상위층
	private int k31_limit_down_floor; // 최하위층
	private int k31_floor; //현재층
	private String k31_help; // 안내
	
	Elevator2(){
		k31_limit_up_floor = 10;
		k31_limit_down_floor = 1;
		k31_floor = 1;
		k31_help = "엘리베이터 기본 준공완료";		
	}
	
	//최대층, 최소층, 현재층을 주어서 클래스를 생성할 수 있도록함
	
	Elevator2(int up_floor, int d_floor, int in_floor) {
		k31_limit_up_floor = up_floor;
		k31_limit_down_floor = d_floor;
		k31_floor = in_floor;
		k31_help = "엘리베이터 맞춤 준공완료";		
	}
	
	void up() {
		if (k31_floor == k31_limit_up_floor) {
			k31_help = "마지막 층입니다.";
		} else {
			k31_floor ++;
			k31_help = String.format("[%d] 층입니다", k31_floor);
		}
	}
	
	void down() {
		if (k31_floor == k31_limit_up_floor) {
			k31_help = "처음 층입니다.";
		} else {
			k31_floor --;
			k31_help = String.format("[%d] 층입니다", k31_floor);
		}
	}
	
	//처음 몇층인지 지정하면 그만큼씩 올라가도록 함
	void up(int u) {
		for (int i = 0; i < u; i++) {
			this.up(); //this를 쓰면명확해짐
		}
			
	}
	
	//처음 몇층인지 지정한다면 그만큼씩 내려가도록 함
	void down(int u) {
		for (int i = 0; i < u; i++) {
			down(); //this를 안써봄
		}
	}
	
	void msg(String id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n", id, k31_help,
				k31_limit_up_floor, k31_limit_down_floor, k31_floor);
	}

}
