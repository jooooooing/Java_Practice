package Review1;

public class programmers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcde";
		String answer = "";

		int leng = s.length();

		System.out.println(leng / 2 - 1);
		System.out.println(leng / 2);
		System.out.println(leng / 2 + 1);

		System.out.println("leng" + leng);
		System.out.println(s.substring(0, 0));
		System.out.println(s.substring(0, 1));
		System.out.println(s.substring(1, 2));
		System.out.println(s.substring(2, 3));
		System.out.println(s.substring(2, 4));
		System.out.println(s.substring(3, 4));

//        if (leng % 2 == 0) {
//            answer = s.substring (leng/2-1, leng/2+1);            
//        } else {
//            answer = s.substring(leng/2, leng/2+1);
//        }      

		System.out.println("answer:" + answer);
	}

	class Solution {
		public String solution(String s) {
			String answer = "";
			int leng = s.length();
			if (leng % 2 == 0) {
				answer = s.substring(leng / 2 - 1, leng / 2 + 1);
			} else {
				answer = s.substring(leng / 2, leng / 2 + 1);
			}
			return answer;
		}
	}

	String getMiddle(String word) {

		return word.substring((word.length() - 1) / 2, word.length() / 2 + 1);
	}

}
