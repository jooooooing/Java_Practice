package Lectur06;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); //DocumentBuilder 객체 선언
		
		Document doc = docBuilder.parse(new File("C:\\Users\\local pc\\Desktop\\testdata.xml")); //Document 객체 선언 파일 경로 지정
		Element root = doc.getDocumentElement(); //Element 객체 선언
		
		
		
		NodeList k31_tag_name = doc.getElementsByTagName("name");  //tag가 "name"인 것을 가져와 nodelist로 저장 
		NodeList k31_tag_studentid = doc.getElementsByTagName("studentid"); //tag가 "studentid"인 것을 가져와 nodelist로 저장 
		NodeList k31_tag_kor = doc.getElementsByTagName("kor"); //tag가 "kor"인 것을 가져와 nodelist로 저장 
		NodeList k31_tag_eng = doc.getElementsByTagName("eng"); //tag가 "eng"인 것을 가져와 nodelist로 저장 
		NodeList k31_tag_mat = doc.getElementsByTagName("mat"); //tag가 "mat"인 것을 가져와 nodelist로 저장 
		
		//출력부
		System.out.println("****************************************");
		for (int i = 0; i < k31_tag_name.getLength(); i++) { //tagname의 길이만큼 반복
			System.out.printf("이름 : %s\n", k31_tag_name.item(i).getFirstChild().getNodeValue()); //name을 출력
			System.out.printf("학번 : %s\n", k31_tag_studentid.item(i).getFirstChild().getNodeValue()); //studentid을 출력
			System.out.printf("국어 : %s\n", k31_tag_kor.item(i).getFirstChild().getNodeValue()); //kor을 출력
			System.out.printf("영어 : %s\n", k31_tag_eng.item(i).getFirstChild().getNodeValue()); //eng을 출력
			System.out.printf("수학 : %s\n", k31_tag_mat.item(i).getFirstChild().getNodeValue()); //mat을 출력
			System.out.println("****************************************");		 
		}
	}
}
