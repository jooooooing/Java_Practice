package Lecture03;

public class P01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 4; i++) { // for �ݺ��� i�� 1���� 9���� 1�� ����
			System.out.print("===========\t"+"===========\t"+"===========\n");
			System.out.print("������" +i + "��\t"+"������" +(i+3) + "��\t"+"������" +(i+6) + "��\n");
			System.out.print("===========\t"+"===========\t"+"===========\n");
			for (int j = 1; j <10; j ++) { // for �ݺ��� i�� 1���� 9���� 1�� ����
				System.out.println(i + "*" + j + "=" + i*j +"\t\t"+ (i+3) + "*" + j + "=" + (i+3)*j +"\t\t"+ (i+6) + "*" + j + "=" + (i+6)*j);		
			}

	}

}
}
