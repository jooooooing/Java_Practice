package Lectur06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONPasing {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser k31_parser = new JSONParser(); //JSONParser 객체 선언

		Object k31_obj = k31_parser.parse(new FileReader("C:\\Users\\local pc\\Desktop\\testdata.json")); //Object 객체 선언

		// JSONObject jsonObject = (JSONObject) obj;
		JSONArray k31_array = (JSONArray) k31_obj; //JSONArray 객체 선언 및 입력

		System.out.println("============================================"); 
		for (int i = 0; i < k31_array.size(); i++) { // for i는 0부터 array size 만큼 반복 //array size 만큼 반복
			JSONObject k31_result = (JSONObject) k31_array.get(i); //JSONObject result는 array 인덱스 i 값
			System.out.println("이름 : " + k31_result.get("name")); // 이름
			System.out.println("학번 : " + k31_result.get("studentid")); //학번

			JSONArray k31_score = (JSONArray) k31_result.get("score"); // 점수
			long k31_kor = (long) k31_score.get(0); //국어점수
			long k31_eng = (long) k31_score.get(1); //영어점수
			long k31_mat = (long) k31_score.get(2); //수학점수
			
			//결과 값 출력			
			System.out.println("국어 : " + k31_kor);
			System.out.println("영어 : " + k31_eng);
			System.out.println("수학 : " + k31_mat);
			System.out.println("총점 : " + (k31_kor + k31_eng + k31_mat));
			System.out.println("평균 : " + ((k31_kor + k31_eng + k31_mat) / 3.0));
			System.out.println("============================================");

		}
	}
}
