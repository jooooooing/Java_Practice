package Lecture_06;

import java.util.Scanner;

public class mobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] foo = { 1345, 1301, 1368, 1322, 1310, 1370, 1318, 1350, 1303, 1299 };


	    // ��� ���ϱ�
	    System.out.println(mean(foo));
	    // ��� ���: 1328.6


	    // ǥ���� ǥ������ ���ϱ� (STDEV)
	    System.out.println(standardDeviation(foo, 1));
	    // ��� ���: 27.46391571984349


	    // ������ ��ü�� ǥ������ ���ϱ� (STDEVP)
	    System.out.println(standardDeviation(foo, 0));
	    // ��� ���: 26.054558142482477
	  }




	  public static double mean(double[] array) {  // ��� ��� ���ϱ�
	    double sum = 0.0;

	    for (int i = 0; i < array.length; i++)
	      sum += array[i];

	    return sum / array.length;
	  }


	  public static double standardDeviation(double[] array, int option) {
	    if (array.length < 2) return Double.NaN;

	    double sum = 0.0;
	    double sd = 0.0;
	    double diff;
	    double meanValue = mean(array);

	    for (int i = 0; i < array.length; i++) {
	      diff = array[i] - meanValue;
	      sum += diff * diff;
	    }
	    sd = Math.sqrt(sum / (array.length - option));

	    return sd;
	  }


	}
