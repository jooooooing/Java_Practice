package Algo;

import java.util.ArrayList;
import java.util.List;

public class kakao_id {

	public static void main(String[] args) {

		String new_id = ".AD1Casdd.[~!@#$%^&*()=+[{]}:?,<>/]321123123."; // �Է� 1�̻� 1,000 ������ ���ڿ�, ���ĺ� �빮��, ���ĺ� �ҹ���, ����,
																// Ư������(-_.~!@#$%^&*()=+[{]}:?,<>/)
//		String new_id = "a"; //�Է� 1�̻� 1,000 ������ ���ڿ�, ���ĺ� �빮��, ���ĺ� �ҹ���, ����, Ư������(-_.~!@#$%^&*()=+[{]}:?,<>/)

		// ���̵��� ���̴� 3�� �̻� 15�� ����
		// ���ĺ� �ҹ���, ����, ����, ����, ��ħǥ�� ��� (-, _, .)
		// ��, ��ħǥ�� ó���� ���� ��� �Ұ��ϸ� ���� ��� �Ұ�
		// �Էµ� ���̵�� �����ϸ鼭 ��Ģ�� �´� ���̵� ��õ(�ߺ� ���? �ϴ� x)

		System.out.println("input : " + new_id);

		// ���� ����
		new_id = trimLength(new_id);
		System.out.println("trim : " + new_id);

		// �빮�ڸ� �ҹ��ڷ�
		new_id = convertString(new_id);
		System.out.println("convert : " + new_id);

		// Ư������ ����
		new_id = new_id.replaceAll("[~!@#$%^&*()=+\\[{\\]}:?,<>/]", "");
		System.out.println("Ư������ ����" + new_id);

		// ��ħǥ ó���� �� ã��
		new_id = deleteDot(new_id);
		System.out.println("deletDot : " + new_id);

	}

	// ��ҹ��� ����
	private static String convertString(String new_id) {
		int tmp;
		String tmpString = "";

		for (int i = 0; i < new_id.length(); i++) {
			tmp = (int) new_id.charAt(i);

			if ((65 <= tmp) && (tmp <= 90)) {
				tmpString += (char) (tmp + 32);
			} else {
				tmpString += (char) tmp;
			}
		}

		return tmpString;
	}

	// ���� �ڸ���
	private static String trimLength(String new_id) {

		boolean lengthOk = false;
		while (lengthOk != true) {
			if (new_id.length() > 15) {
				new_id = new_id.substring(0, 15);
				lengthOk = true;
			} else if (new_id.length() < 3) {
				new_id += "1";
			} else {
				lengthOk = true;
			}
		}
		return new_id;
	}
	
	private static String deleteDot(String new_id) {
		// ��ħǥ ó���� �� ã��
		char[] tempChar = new char[new_id.length()];
		for (int i = 0; i < new_id.length(); i++) {
			tempChar[i] = new_id.charAt(i);
		}

		// ó���� ���� ��ħǥ�� ���ڷ� ġȯ��
		if (tempChar[0] == '.' || tempChar[new_id.length() - 1] == '.') {
			tempChar[0] = '\0';
			tempChar[new_id.length()-1] = '\0';
		}

		List<String> list = new ArrayList<>();

		for (int i = 0; i < tempChar.length; i++) {
			if (tempChar[i] != '\0') {
				list.add(Character.toString(tempChar[i]));
			}
		}

		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println();
			new_id = ""; //�ʱ�ȭ �ѹ� ����
			new_id += list.get(i); //.�� ������ ���� �ٽ� �־���
		}
		
		return new_id;
	}

}
