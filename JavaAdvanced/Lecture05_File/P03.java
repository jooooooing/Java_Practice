package Lecture05_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\local pc\\Desktop\\���������������.CSV"); //���� ��ü ���� �� ��� ����
		BufferedReader br = new BufferedReader (new FileReader(f)); // BufferedReader ��ü ����
		
		String readtxt; // String ���� ����
		
		if((readtxt = br.readLine())==null) { //readtxt �� br.readLine �� ���ε� �� ���� ����ִٸ�
			System.out.println("�� �����Դϴ�.");
			return;
		}
		
		String[] k31_field_name = readtxt.split(","); // Stinrg �迭 ���� �� readtxt�� ��ǥ(,)�� �������� split��
		
		int k31_LineCnt = 0; //lineCnut ���� ���� �� �ʱ�ȭ
		while ((readtxt = br.readLine())!=null) { //readtxt �� br.readLine �� ���ε� �� ���� ������� �ʴٸ�
			
			String[] k31_field = readtxt.split(","); // Stinrg �迭 ���� �� readtxt�� ��ǥ(,)�� �������� split��
			System.out.printf("**[%d��° �׸�]***********\n", k31_LineCnt); //cnt �׸� ���
			for (int j = 0; j < k31_field_name.length; j++) { //�׸� ����ŭ �ݺ�
				System.out.printf(" %s : %s\n", k31_field_name[j], k31_field[j]); //�׸� �̸�, �׸� ��
			}
			System.out.println("****************************");
			if (k31_LineCnt == 100) //100��°�� �����ϸ�
			break; // ����
			k31_LineCnt ++;
		}
		
		br.close();

	}

}
