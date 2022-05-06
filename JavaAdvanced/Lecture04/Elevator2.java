package Lecture04;

public class Elevator2 {
	private int k31_limit_up_floor; // �ֻ�����
	private int k31_limit_down_floor; // ��������
	private int k31_floor; //������
	private String k31_help; // �ȳ�
	
	Elevator2(){
		k31_limit_up_floor = 10;
		k31_limit_down_floor = 1;
		k31_floor = 1;
		k31_help = "���������� �⺻ �ذ��Ϸ�";		
	}
	
	//�ִ���, �ּ���, �������� �־ Ŭ������ ������ �� �ֵ�����
	
	Elevator2(int up_floor, int d_floor, int in_floor) {
		k31_limit_up_floor = up_floor;
		k31_limit_down_floor = d_floor;
		k31_floor = in_floor;
		k31_help = "���������� ���� �ذ��Ϸ�";		
	}
	
	void up() {
		if (k31_floor == k31_limit_up_floor) {
			k31_help = "������ ���Դϴ�.";
		} else {
			k31_floor ++;
			k31_help = String.format("[%d] ���Դϴ�", k31_floor);
		}
	}
	
	void down() {
		if (k31_floor == k31_limit_up_floor) {
			k31_help = "ó�� ���Դϴ�.";
		} else {
			k31_floor --;
			k31_help = String.format("[%d] ���Դϴ�", k31_floor);
		}
	}
	
	//ó�� �������� �����ϸ� �׸�ŭ�� �ö󰡵��� ��
	void up(int u) {
		for (int i = 0; i < u; i++) {
			this.up(); //this�� �����Ȯ����
		}
			
	}
	
	//ó�� �������� �����Ѵٸ� �׸�ŭ�� ���������� ��
	void down(int u) {
		for (int i = 0; i < u; i++) {
			down(); //this�� �Ƚẽ
		}
	}
	
	void msg(String id) {
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n", id, k31_help,
				k31_limit_up_floor, k31_limit_down_floor, k31_floor);
	}

}
