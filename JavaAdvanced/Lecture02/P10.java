package Lecture02;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k31_iNum = 1001034567; // int ���� ���� �� �ʱ�ȭ
		String k31_sNum = String.valueOf(k31_iNum); // String ���� ���� �� int�� Num������ String���� ��ȯ
		String k31_sNumVoice = ""; // String ���� ���� �� �ʱ�ȭ
		System.out.printf("==> %s [%d�ڸ�]\n", k31_sNum, k31_sNum.length()); // �ڸ��� ���

		int k31_i, k31_j; // ���� i j ����

		String[] k31_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" }; // �迭 ���� �� �Է�, ���� �κ� voice
		String[] k31_unitX = { " ", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" }; // �迭 ���� �� �Է�, �ڸ��� �κ� voice

		k31_i = 0; // i ���� ���� �� �ʱ�ȭ
		k31_j = k31_sNum.length() - 1; // j ���� ���� �� �ʱ�ȭ j = String Num������ ���� ���� -1
		
//		System.out.println(k31_sNum.substring(k31_i+3, k31_i + 4));

		while (true) { // while �ݺ��� break���������� ���
			if (k31_i >= k31_sNum.length()) // 1�� �����ϴ� i�� String Num ������ ���� ���̺��� Ŀ����
				break; // �����
			// i�� String Num ������ ���� ���̺��� ��������
			System.out.printf("%s[%s]", k31_sNum.substring(k31_i, k31_i + 1), //��� String Num ������ �ڸ���
					k31_units[Integer.parseInt(k31_sNum.substring(k31_i, k31_i + 1))]); // ��� String Num ������ �ڸ��� (�迭���� �ѱ� ���� ������)

			if (k31_sNum.substring(k31_i, k31_i + 1).equals("0")) { // String Num ���� �ڸ����� 0�̰�
				if (k31_unitX[k31_j].equals("��") || k31_unitX[k31_j].equals("��")) { //�ѱ� ���� �� �Ǵ� ���̸�
					k31_sNumVoice = k31_sNumVoice + "" + k31_unitX[k31_j]; // NumVoice =  NumVocie + " " +   �ѱ� �� '��' �Ǵ� '��'�� ������
				} else { //�ѱ� ���� �� �Ǵ� ���� �ƴ϶��
					// nothing �ƹ��ϵ� ����
				}
			} else { // String Num ������ �ڸ����� 0�� �ƴ϶�� 
				k31_sNumVoice = k31_sNumVoice + k31_units[Integer.parseInt(k31_sNum.substring(k31_i, k31_i + 1))] + k31_unitX[k31_j];
				// NumVoice = NumVoice + ���ںκ� voice�� �迭 units���� �������� + �ڸ����κ� voice�� unitX���� ������
			}
			k31_i++; // i�� 1���ϰ� -> while �ݺ� �����
			k31_j--; // j�� 1����  -> while �ݺ� �����
		}

		System.out.printf("\n %s[%s]\n", k31_sNum, k31_sNumVoice); //���� ���

	}

}
