package Lecture04;

public class Overloading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Calc1 cc = new Calc1();
	
	System.out.printf("2°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", cc.sum(1, 2));
	System.out.printf("3°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", cc.sum(1, 2, 3));
	System.out.printf("4°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", cc.sum(1, 2, 3, 4));
	System.out.printf("´õºíÇü µ¡¼ÀÀÌ È£ÃâµÊ [%f]\n", cc.sum(1.3, 2.4));
		

	}

}
