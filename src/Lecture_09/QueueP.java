package Lecture_09;

import java.util.LinkedList;
import java.util.Queue;

public class QueueP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> name = new LinkedList<String>();
		name.offer("kim");
		System.out.println(name);
		name.offer("lee");
		System.out.println(name);
		System.out.println(name.poll());
		System.out.println(name.poll());
		System.out.println(name);

	}

}
