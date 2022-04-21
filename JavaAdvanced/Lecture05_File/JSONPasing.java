package Lecture05_File;

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

		JSONParser k31_parser = new JSONParser();

		Object k31_obj = k31_parser.parse(new FileReader("C:\\Users\\local pc\\Desktop\\testdata.json"));

		// JSONObject jsonObject = (JSONObject) obj;
		JSONArray k31_array = (JSONArray) k31_obj;

		System.out.println("============================================");
		for (int i = 0; i < k31_array.size(); i++) { // for i�� 0���� array size ��ŭ �ݺ�
			JSONObject k31_result = (JSONObject) k31_array.get(i);
			System.out.println("�̸� : " + k31_result.get("name"));
			System.out.println("�й� : " + k31_result.get("studentid"));

			JSONArray k31_score = (JSONArray) k31_result.get("score");
			long k31_kor = (long) k31_score.get(0);
			long k31_eng = (long) k31_score.get(1);
			long k31_mat = (long) k31_score.get(2);

			System.out.println("���� : " + k31_kor);
			System.out.println("���� : " + k31_eng);
			System.out.println("���� : " + k31_mat);
			System.out.println("���� : " + (k31_kor + k31_eng + k31_mat));
			System.out.println("��� : " + ((k31_kor + k31_eng + k31_mat) / 3.0));
			System.out.println("============================================");

		}
	}
}
