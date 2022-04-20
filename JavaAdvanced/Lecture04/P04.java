package Lecture04;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P04 main = new P04();
		String name= "폴리융";
		int korean = 100, english = 100, math = 100, science = 100, society = 100;
		
		System.out.println("3월 성적표");
		System.out.println("=============================================");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("=============================================");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t\n", name, korean, english, math, main.sum(korean, english, math), main.avg(korean, english, math));
		System.out.println();
		
		System.out.println("4월 성적표");
		System.out.println("======================================================");
		System.out.println("이름\t 국어\t 영어\t 수학\t 과학\t 총점\t 평균");
		System.out.println("======================================================");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\t\n", name, korean, english, math, science, main.sum(korean, english, math, science), main.avg(korean, english, math, science));
		System.out.println();
		
		System.out.println("5월 성적표");
		System.out.println("============================================================");
		System.out.println("이름\t 국어\t 영어\t 수학\t 과학\t 사회\t 총점\t 평균");
		System.out.println("============================================================");
		System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\t %d\t\n", name, korean, english, math, science, society, main.sum(korean, english, math, science, society), main.avg(korean, english, math, science, society));
		
	}
	
	public  int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public  int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	public  int sum(int a, int b, int c, int d, int e) {
		return a+b+c+d+e;
	}
	
	public int avg(int a, int b, int c) {
		return (a+b+c) / 3;
	}
	
	public int avg(int a, int b, int c, int d) {
		return (a+b+c+d) / 4;
	}
	
	public  int avg(int a, int b, int c, int d, int e) {
		return (a+b+c+d+e) / 5;
	}
	
	

}
