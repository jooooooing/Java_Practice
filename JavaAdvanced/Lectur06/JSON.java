package Lectur06;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON {

	public static JSONObject oneRec(String name, int studentid, int kor, int eng, int mat) { //JSONObject인 oneRec 메소드 생성 
		JSONObject dataObject = new JSONObject(); //JSONObject 객체 선언
		dataObject.put("name", name); //Name태그에 String name 입력
		dataObject.put("studentid", studentid); //studentid 태그에 String studentid 입력
		// Json Array 생성
		JSONArray score = new JSONArray(); //JSONArrya 객체 선언 score
		score.add(kor); //score JSONArray에 kor 입력 
		score.add(eng); //score JSONArray에 eng 입력 
		score.add(mat); //score JSONArray에 mat 입력 
		dataObject.put("score", score); //JSONObject인 dataObject score 태그에 score 입력 

		return dataObject; //JSONObject return
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 최종 완성될 JSONObject 선언(전체)
		JSONObject jsonObject = new JSONObject();
		// 한명 성적의 JSON정보를 담을 Array 선언
		JSONArray datasArray = new JSONArray();

		// 한명 정보가 들어갈 JSONObject 선언
		JSONObject dataObject = new JSONObject();
		dataObject.put("name", "나연");  //Name태그에 String name 입력
		dataObject.put("studentid", 209901); //studentid 태그에 String studentid 입력
		
		JSONArray score = new JSONArray(); // Json Array 생성 
		score.add(90); //score JSONArrya에 입력
		score.add(100); //score JSONArrya에 입력
		score.add(95); //score JSONArrya에 입력
		dataObject.put("score", score); //JSONObject인 dataObject score 태그에 score 입력 
		datasArray.add(dataObject); //datasArray에 dataObject 추가

		// 메소드 활용하여 반복 입력
		datasArray.add(oneRec("정연", 209902, 100, 85, 75));
		datasArray.add(oneRec("모모", 209903, 90, 75, 85));
		datasArray.add(oneRec("사나", 209904, 90, 85, 75));
		datasArray.add(oneRec("지효", 209905, 80, 75, 85));
		datasArray.add(oneRec("미나", 209906, 90, 85, 55));
		datasArray.add(oneRec("다현", 209907, 70, 75, 65));
		datasArray.add(oneRec("채영", 209908, 100, 75, 95));
		datasArray.add(oneRec("쯔위", 209909, 80, 65, 95));

		try { 
			FileWriter file = new FileWriter("C:\\Users\\local pc\\Desktop\\testdata.json"); //file 객체 선언 및 경로 지정
			file.write(datasArray.toJSONString()); //datasArray를 JSONString형태로 입력
			file.flush(); //메모리 비워줌
			file.close(); //파일 닫기
		} catch (IOException e) {
			e.printStackTrace(); //오류 추적
		}
		System.out.println("JSON Maked : " + datasArray); //출력
	}

}
