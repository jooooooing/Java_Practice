package Lecture_07;

public class P5_Descriptive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] scoreTable = { {"Name", "Korean", "English", "Math"}, { "jeong", "70", "80", "100" }, {"Pyo", "60", "70", "86" }, {"Choi", "54", "100", "82" },
				{ "Mike", "87", "95", "79" } };

		int subSum = {}, subMin = {}, subMax = {};
		int personSum = {}, personMin = {}, personMAx = {};

		float[] subAvg = {}, personAvg = {};

		for (int i = 0; i < scoreTable.length; i++) {
			for (int j = 0; j < scoreTable[i].length; j++) {
				try {
					Integer.parseInt(scoreTable[i][j]);
					for (int k = 1; k < 2; k++) {
						for (int l = 1; l < 5; l++) {
							subSum[l] = scoreTable[k][l];
							System.out.print(scoreTable[k][l]);
						}
					}
				} catch (NumberFormatException e) {
					// exception
				}

			}

		}

	}

}
