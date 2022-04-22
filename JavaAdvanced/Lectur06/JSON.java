package Lectur06;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON {

	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) { //JSONObject�� oneRec �޼ҵ� ���� 
		JSONObject dataObject = new JSONObject(); //JSONObject ��ü ����
		dataObject.put("name", name); //Name�±׿� String name �Է�
		dataObject.put("studentid", studentid); //studentid �±׿� String studentid �Է�
		// Json Array ����
		JSONArray score = new JSONArray(); //JSONArrya ��ü ���� score
		score.add(kor); //score JSONArray�� kor �Է� 
		score.add(eng); //score JSONArray�� eng �Է� 
		score.add(mat); //score JSONArray�� mat �Է� 
		dataObject.put("score", score); //JSONObject�� dataObject score �±׿� score �Է� 

		return dataObject; //JSONObject return
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� �ϼ��� JSONObject ����(��ü)
		JSONObject jsonObject = new JSONObject();
		// �Ѹ� ������ JSON������ ���� Array ����
		JSONArray datasArray = new JSONArray();

		// �Ѹ� ������ �� JSONObject ����
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", "����");  //Name�±׿� String name �Է�
		dataObject.put("studentid", 209901); //studentid �±׿� String studentid �Է�
		
		JSONArray score = new JSONArray(); // Json Array ���� 
		score.add(90); //score JSONArrya�� �Է�
		score.add(100); //score JSONArrya�� �Է�
		score.add(95); //score JSONArrya�� �Է�
		dataObject.put("score", score); //JSONObject�� dataObject score �±׿� score �Է� 
		datasArray.add(dataObject); //datasArray�� dataObject �߰�

		// �޼ҵ� Ȱ���Ͽ� �ݺ� �Է�
		datasArray.add(oneRec("����", 209902, 100, 85, 75));
		datasArray.add(oneRec("���", 209903, 90, 75, 85));
		datasArray.add(oneRec("�糪", 209904, 90, 85, 75));
		datasArray.add(oneRec("��ȿ", 209905, 80, 75, 85));
		datasArray.add(oneRec("�̳�", 209906, 90, 85, 55));
		datasArray.add(oneRec("����", 209907, 70, 75, 65));
		datasArray.add(oneRec("ä��", 209908, 100, 75, 95));
		datasArray.add(oneRec("����", 209909, 80, 65, 95));

		try { 
			FileWriter file = new FileWriter("C:\\Users\\local pc\\Desktop\\testdata.json"); //file ��ü ���� �� ��� ����
			file.write(datasArray.toJSONString()); //datasArray�� JSONString���·� �Է�
			file.flush(); //�޸� �����
			file.close(); //���� �ݱ�
		} catch (IOException e) {
			e.printStackTrace(); //���� ����
		}
		System.out.println("JSON Maked : " + datasArray); //���
	}

}
