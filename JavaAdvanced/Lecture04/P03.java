package Lecture04;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tvRemocon remo;
		remo = new tvRemocon();
		
		System.out.println("���� ä���� " + remo.k31_channel+"�� �Դϴ�.");
		
		remo.chUp();
		System.out.printf("%s\n", remo.k31_chInfo);
		
		remo.chDown();
		System.out.printf("%s\n", remo.k31_chInfo);
		
		System.out.println("���� ������ " + remo.k31_volumn+"�Դϴ�.");
		
		remo.VolUp();
		System.out.printf("%s\n", remo.k31_volInfo);
		
		remo.VolDown();
		System.out.printf("%s\n", remo.k31_volInfo);

	}

}
