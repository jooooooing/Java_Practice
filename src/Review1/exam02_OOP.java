package Review1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exam02_OOP {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int R = scan.nextInt();
		
		Gongsa gongsa = new Gongsa(a, b, R);
		
		int N = scan.nextInt();
		
		List<Tree> trees = new ArrayList<>();		
		for (int i = 0; i < N; i++) {
			int x = scan.nextInt();
			int y= scan.nextInt();
			Tree tree = new Tree(x,y);
			trees.add(tree);
		}
		
		for (int i = 0; i < N; i++) {
			int x = 			
		}
		
		Park park = new Park(gongsa, trees);
		for (boolean result: park.isSilents()) {
			System.out.println(result ? "silent" : "noisy");
		}
	}
	
	class Gongsa {
		int x;
		int y;
		int radius;
		
		public Gongsa(int a, int b, int radius) {
			this.x = a;
			this.y = y;
			this.radius = radius;
			
		}
		
		public boolean isSilent(Tree tree) {
			return (tree.x-x) * (tree.x-x) + (tree.y-y) * (tree.y-y) >= radius * radius;
		}
		
	}

	class Tree {
		int x;
		int y;
		
		public Tree(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		public boolean isSilent(Gongsa gongsa) {
			return (gongsa.x-x) * (gongsa.x-x) + (gongsa.y-y) * (gongsa.y-y) >= radius * radius;
		}
	}
	
	class Park {
		Gongsa gongsa;
		List<Tree> trees;
		
		public Park(Gongsa gongsa, List<Tree> trees) {
			this.gongsa = gongsa;
			this.trees = trees;
		}
		
		public List<Boolean> isSilents() {
			List<Boolean> results = new ArrayList<>();
			
			for (Tree tree : trees) {
				results.add(tree.isSilent(gongsa));
			}
			
			return results;
		}
		
		

		
	}
}
