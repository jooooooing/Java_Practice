package Lecture03;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 10; i = i+3) { // for �ݺ��� i�� 1���� 9���� i�� +3�� ����
			System.out.print("===========\t"+"===========\t"+"===========\n"); 
			System.out.print("������" +i + "��\t"+"������" +(i+1) + "��\t"+"������" +(i+2) + "��\n");
			System.out.print("===========\t"+"===========\t"+"===========\n");
			for (int j = 1; j <10; j ++) { // for �ݺ��� i�� 1���� 9���� 1�� ����
				System.out.println(i + "*" + j + "=" + i*j +"\t\t"+ (i+1) + "*" + j + "=" + (i+1)*j +"\t\t"+ (i+2) + "*" + j + "=" + (i+2)*j);
		
			}
			
		}

		
	}

}
