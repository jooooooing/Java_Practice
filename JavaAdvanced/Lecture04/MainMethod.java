package Lecture04;

public class MainMethod {

	public static void iamMethod() { // 메소드 정의
		System.out.println("메소드라 불러줘요~"); // 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainMethod.iamMethod(); //클래스명.메소드명 메소드 호출
		iamMethod(); //자기 클래스 안에 함수 정의하여 메소드명으로만 메소드 호출

	}

}
