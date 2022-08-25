package Algo;

public class caesar_pwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a B z";
		int n = 4;

		solution(s, n);

	}

	public static String solution(String s, int n) {
		String answer = "";
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int chIndex = (int)ch[i]; 
			
			//대문자의 경우
			if (chIndex >= 65 && chIndex<= 90) {
				chIndex += n;
				if (chIndex > 90) {
					chIndex -= 26;
				}
			//소문자
			} else if (chIndex >= 97 && chIndex <= 122) {
				chIndex += n;
				if (chIndex > 122) {
					chIndex -= 26;
				}
			}
			
			char newCh = (char)chIndex;
			answer += Character.toString(newCh);
		}
		
	System.out.println(answer);
	return answer;
}

}
