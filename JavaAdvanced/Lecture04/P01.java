package Lecture04;

public class P01 {

	static int iStatic;

	public static void add(int i) {
		iStatic++;
		i++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", iStatic);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", i);

	}

	public static int add2(int i) {
		iStatic++;
		i++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", iStatic);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", i);
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iMain;
		iMain = 1;
		iStatic = 1;

		System.out.println("=========================");
		System.out.printf("�޼ҵ�ȣ���� ���ο��� iStatic=[%d]\n", iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο��� iMain=[%d]\n", iMain);
		System.out.println("=========================");

		add(iMain);

		System.out.println("=========================");
		System.out.printf("�޼ҵ�ȣ���� ���ο��� iStatic=[%d]\n", iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο��� iMain=[%d]\n", iMain);
		System.out.println("=========================");

		iMain = add2(iMain);

		System.out.println("=========================");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� iStatic=[%d]\n", iStatic);
		System.out.printf("�޼ҵ� add2ȣ���� ���ο��� iMain=[%d]\n", iMain);
		System.out.println("=========================");

	}

}
