package Lecture03;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 10; i = i+3) { // for 반복문 i는 1부터 9까지 i에 +3을 더함
			System.out.print("===========\t"+"===========\t"+"===========\n"); 
			System.out.print("구구단" +i + "단\t"+"구구단" +(i+1) + "단\t"+"구구단" +(i+2) + "단\n");
			System.out.print("===========\t"+"===========\t"+"===========\n");
			for (int j = 1; j <10; j ++) { // for 반복문 i는 1부터 9까지 1씩 더함
				System.out.println(i + "*" + j + "=" + i*j +"\t\t"+ (i+1) + "*" + j + "=" + (i+1)*j +"\t\t"+ (i+2) + "*" + j + "=" + (i+2)*j);
		
			}
			
		}

		
	}

}
