package Lecture04;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tvRemocon remo;
		remo = new tvRemocon();
		
		System.out.println("현재 채널은 " + remo.k31_channel+"번 입니다.");
		
		remo.chUp();
		System.out.printf("%s\n", remo.k31_chInfo);
		
		remo.chDown();
		System.out.printf("%s\n", remo.k31_chInfo);
		
		System.out.println("현재 볼륨은 " + remo.k31_volumn+"입니다.");
		
		remo.VolUp();
		System.out.printf("%s\n", remo.k31_volInfo);
		
		remo.VolDown();
		System.out.printf("%s\n", remo.k31_volInfo);

	}

}
