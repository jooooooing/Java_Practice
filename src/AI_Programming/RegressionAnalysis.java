package AI_Programming;

import java.util.ArrayList;
import java.util.Collections;

public class RegressionAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int STARTNUM = 1000;
		final int LASTNUM = 5000;
		
		double[] distance = { 2.2, 3.1, 15.4, 7.6, 11, 9.2, 3.4, 13.7, 4.5, 10 ,2,1.5,1,3,4,5,8.5,12,18,2.5 ,2, 1.5, 10, 5, 20, 30, 7, 12, 15, 18 ,2, 1.5, 5, 10, 8, 8.4, 22, 18, 4.5, 0.8, 15, 2, 1.5, 10, 9, 0.5, 8.2, 5, 2.5, 1, 20};
	    double[] price = { 4000, 5700, 27300, 9000, 18000, 7400, 4800, 24000, 5600, 17700 ,4000,3000,2500,7500,9500,11000,16000,30000,43000,5000, 4000, 3000, 15600, 10000, 34000, 54000, 12300, 18000, 20000, 33000, 4000, 3800, 9600, 21000, 16400, 17200, 49600, 34900, 8200, 3800, 31900,4000, 3000, 18000, 16300, 2000, 15200, 9700, 5200, 2100, 37000};
		ArrayList<Integer> resultGapSumArrs = new ArrayList<Integer>();
		
		double y = 0;
		double resultGap = 0;
		
		for (int a = STARTNUM; a <= LASTNUM; a += 100) {
			//y값 계산
			//차이 계산
			//차이의 합 계산
			double resultGapSum = 0;
			for (int i = 0; i < 10; i++) {
				y = distance[i] * a;
//				System.out.println("y : " + y);
				resultGap = Math.abs(price[i] - y);
//				System.out.println("gap : " + resultGap);
				resultGapSum += resultGap;
				if ( i == 9) {
					resultGapSumArrs.add((int)resultGapSum);
				}
			}
		}
		
		int min = Collections.min(resultGapSumArrs); //ArrayList에서 최소값 찾기
//		System.out.println(min);      
		int index = resultGapSumArrs.indexOf(min); //찾은 최소값이 있는 ArrayList index 위치 찾기
//        System.out.println(index);
        
        System.out.println("최적의 a값 :" + (STARTNUM + (index*100))); // a + index * 100(증가 단위)

	}

}
