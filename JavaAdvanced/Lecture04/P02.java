package Lecture04;

public class P02 {
	
	private static int k31_inVal;
	public static void up() {
	k31_inVal ++;
	System.out.printf("난 그냥 메소드[%d]\n", k31_inVal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		k31_inVal = 0; // 자기내부 변수사용
		
		Elevator elev; // 클래스를 받아 객체를 만듬
		elev = new Elevator(); //인스턴스를 생성하여 객체에 연결

		up(); // 현재 소스내 메소드
		for (int i = 0; i < 10; i++) {
			elev.up(); // 엘리베이터 클래스를 찍어낸 elev객체의 up 메소드
			System.out.printf("MSG[%s]\n", elev.k31_help);
		}

		for (int i = 0; i < 10; i++) {
			elev.down();
			System.out.printf("MSG[%s]\n", elev.k31_help);
		}

	}

}
