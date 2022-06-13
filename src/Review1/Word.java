package Review1;

public class Word {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(0)); // false
		System.out.println(word.isVowel(1)); // true
		System.out.println(word.isVowel2(0)); //
		System.out.println(word.isVowel2(1));
		System.out.println(word.isVowel2(2));
		System.out.println(word.isVowel2(3));
		System.out.println(word.isVowel2(4));
		System.out.println(word.isVowel2(5));
		System.out.println(word.isVowel2(6));
		System.out.println(word.isVowel2(7));
		System.out.println(word.isVowel2(8));
		System.out.println(word.isVowel2(9));
		System.out.println(word.isVowel2(10));
		System.out.println("자음" + word.isConsonant(0));
		System.out.println("자음" + word.isConsonant(1));
		System.out.println("자음" + word.isConsonant(2));
		System.out.println("자음" + word.isConsonant(3));
		System.out.println("자음" + word.isConsonant(4));

	}

	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	// i번째 글자가 모음인지 // a, e, i, o, u
	public boolean isVowel(int i) {
		return letters.substring(i, i + 1).equals("a") || letters.substring(i, i + 1).equals("i")
				|| letters.substring(i, i + 1).equals("e") || letters.substring(i, i + 1).equals("o")
				|| letters.substring(i, i + 1).equals("u");
	}

	public boolean isVowel2(int i) {
		String vowel = "aeiou";
		return vowel.contains(letters.substring(i, i + 1));
	}

	// i번째 글자가 모음인지 // a,e,i,o,u 제외한 나머지
	public boolean isConsonant(int i) {
		boolean isCon = true;
		String vowel = "aeiou";
		if (vowel.contains(letters.substring(i, i + 1))) {
			isCon = false;
		}
		return isCon;
	}

	public boolean isConsonant2(int i) {
		return !isVowel2(i);
	}

}
