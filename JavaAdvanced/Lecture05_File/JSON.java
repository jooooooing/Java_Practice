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
		// Json Array 생성
		JSONArray score = new JSONArray();
		score.add(kor);
		score.add(eng);
		score.add(mat);
		dataObject.put("score", score);
		
		return dataObject;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//최종 완성될 JSONObject 선언(전체)
		JSONObject jsonObject = new JSONObject();
		//한명 성적의 JSON정보를 담을 Array 선언
		JSONArray datasArray = new JSONArray();
		
		//한명 정보가 들어갈 JSONObject 선언
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", "나연");
		dataObject.put("studentid", 209901);
		// Json Array 생성
		JSONArray score = new JSONArray();
		score.add(90);
		score.add(100);
		score.add(95);
		dataObject.put("score", score);
		datasArray.add(dataObject);
		
		//메소드 활용
		
		datasArray.add(oneRec("정연", 209902, 100, 85, 75));
		datasArray.add(oneRec("모모", 209903, 90, 75, 85));
		datasArray.add(oneRec("사나", 209904, 90, 85, 75));
		datasArray.add(oneRec("지효", 209905, 80, 75, 85));
		datasArray.add(oneRec("미나", 209906, 90, 85, 55));
		datasArray.add(oneRec("다현", 209907, 70, 75, 65));
		datasArray.add(oneRec("채영", 209908, 100, 75, 95));
		datasArray.add(oneRec("쯔위", 209909, 80, 65, 95));
		
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
