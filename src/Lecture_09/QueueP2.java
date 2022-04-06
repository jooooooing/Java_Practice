package Lecture_09;

import java.util.LinkedList;
import java.util.Queue;

public class QueueP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> list = new LinkedList<Integer>();

		while (list.size() < 10) {
			int ran = (int) (Math.random() * 30);
			
			if (ran % 2 == 1) {
				list.add(ran);				
				if (ran % 3 == 0) {					
					System.out.print(ran + " ");
				}
			} else if (ran % 2 == 0) {
				continue;
			}

		}		
		System.out.println("\n" +list);
	}
}
