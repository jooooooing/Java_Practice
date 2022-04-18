package Lecture03;

public class P01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 4; i++) { // for 반복문 i는 1부터 9까지 1씩 더함
			System.out.print("===========\t"+"===========\t"+"===========\n");
			System.out.print("구구단" +i + "단\t"+"구구단" +(i+3) + "단\t"+"구구단" +(i+6) + "단\n");
			System.out.print("===========\t"+"===========\t"+"===========\n");
			for (int j = 1; j <10; j ++) { // for 반복문 i는 1부터 9까지 1씩 더함
				System.out.println(i + "*" + j + "=" + i*j +"\t\t"+ (i+3) + "*" + j + "=" + (i+3)*j +"\t\t"+ (i+6) + "*" + j + "=" + (i+6)*j);		
			}

	}

}
}
