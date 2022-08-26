package Algo;

public class weird_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";
		
		System.out.println(solution(s));

	}
	
    private static String solution(String s) {
		String answer = "";
		
		StringBuilder sb = new StringBuilder();

		String[] splitStr = s.split(" ", -1); //
        
		String[] answerArr = new String[splitStr.length];
		char ch = 0;

		for (int i = 0; i < splitStr.length; i++) {
			String temp = "";
			char[] chs = splitStr[i].toCharArray();

			for (int j = 0; j < chs.length; j++) {
				if (j % 2 == 0) {
					ch = Character.toUpperCase(chs[j]);
					temp += String.valueOf(ch);
	
				} else if (j % 2 == 1) {
					ch = Character.toLowerCase(chs[j]);
					temp += String.valueOf(ch);
				
				}
			}

			answerArr[i] = temp; 
	
		}
		
		for (int i = 0; i < answerArr.length; i++) {
			
			if (i != answerArr.length-1) {
				sb.append(answerArr[i] + " ");
			} else {
				sb.append(answerArr[i]);
			}
		}
	
		return sb.toString();
    }

}
