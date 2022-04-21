package Lecture05_File;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON {
	
	
	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) {
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", name);
		dataObject.put("studentid", studentid);
		// Json Array ����
		JSONArray score = new JSONArray();
		score.add(kor);
		score.add(eng);
		score.add(mat);
		dataObject.put("score", score);
		
		return dataObject;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �ϼ��� JSONObject ����(��ü)
		JSONObject jsonObject = new JSONObject();
		//�Ѹ� ������ JSON������ ���� Array ����
		JSONArray datasArray = new JSONArray();
		
		//�Ѹ� ������ �� JSONObject ����
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", "����");
		dataObject.put("studentid", 209901);
		// Json Array ����
		JSONArray score = new JSONArray();
		score.add(90);
		score.add(100);
		score.add(95);
		dataObject.put("score", score);
		datasArray.add(dataObject);
		
		//�޼ҵ� Ȱ��
		
		datasArray.add(oneRec("����", 209902, 100, 85, 75));
		datasArray.add(oneRec("���", 209903, 90, 75, 85));
		datasArray.add(oneRec("�糪", 209904, 90, 85, 75));
		datasArray.add(oneRec("��ȿ", 209905, 80, 75, 85));
		datasArray.add(oneRec("�̳�", 209906, 90, 85, 55));
		datasArray.add(oneRec("����", 209907, 70, 75, 65));
		datasArray.add(oneRec("ä��", 209908, 100, 75, 95));
		datasArray.add(oneRec("����", 209909, 80, 65, 95));
		
		try {
			FileWriter file = new FileWriter("C:\\Users\\local pc\\Desktop\\testdata.json");
			file.write(datasArray.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("JSON Maked : " + datasArray);
	}

}
