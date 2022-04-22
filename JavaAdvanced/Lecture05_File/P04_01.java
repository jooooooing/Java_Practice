package Lecture05_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P04_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\local pc\\Desktop\\���������������.csv"); // File ��ü�� ���� ���� ��� ����
		BufferedReader br = new BufferedReader(new FileReader(f)); //BufferedReader ��ü ����

		String k31_readtxt; // ������ �о ������ String

		if ((k31_readtxt = br.readLine()) == null) { // ������ readLine������ line�� ����ִٸ�
			System.out.println("�� �����Դϴ�."); // �������Դϴ� ���
			return;
		}

		String[] k31_field_name = k31_readtxt.split(","); // �׸��̸� String �迭 = readtxt�� ,�� ���� �� ����

		double k31_lat = 37.3860521; // ������ġ ����
		double k31_lng = 127.1214038; // ������ġ �浵

		int k31_LineCnt = 0;
		
		while ((k31_readtxt = br.readLine()) != null) { // readLine������ ������� �ʴٸ� readtxt�� �Է�

			String[] k31_field = k31_readtxt.split(","); // readtxt�� ,�� �����Ͽ� �ڸ��� field �迭�� ����
			System.out.printf("**[%d��° �׸�]**********\n", k31_LineCnt+1); // �׸� ���� ��� cnt + 1 ��
			System.out.printf(" %s : %s\n", k31_field_name[9], k31_field[9]); //������ ���θ� �ּ�
			System.out.printf(" %s : %s\n", k31_field_name[13], k31_field[13]); // ����
			System.out.printf(" %s : %s\n", k31_field_name[14], k31_field[14]); // �浵
			double k31_dist = Math.sqrt( Math.pow(Double.parseDouble(k31_field[13])-k31_lat, 2) //�Ÿ� ���(��Ÿ��� ����)
					+ Math.pow(Double.parseDouble(k31_field[14])-k31_lng, 2));
			System.out.printf(" ���������� �Ÿ� : %f\n", k31_dist); // �Ÿ�
			System.out.println("************************************");

			k31_LineCnt++; // ���� +1

		}

		br.close();
	
	}

}
