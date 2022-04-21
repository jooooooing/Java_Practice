package Lecture05_File;

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
		
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		Document doc = docBuilder.parse(new File("C:\\Users\\local pc\\Desktop\\testdata.xml"));		
		Element root = doc.getDocumentElement();
		
		NodeList k31_tag_name = doc.getElementsByTagName("name"); 
		NodeList k31_tag_studentid = doc.getElementsByTagName("studentid"); 
		NodeList k31_tag_kor = doc.getElementsByTagName("kor"); 
		NodeList k31_tag_eng = doc.getElementsByTagName("eng"); 
		NodeList k31_tag_mat = doc.getElementsByTagName("mat"); 
		
		System.out.println("****************************************");
		for (int i = 0; i < k31_tag_name.getLength(); i++) {
			System.out.printf("이름 : %s\n", k31_tag_name.item(i).getFirstChild().getNodeValue());
			System.out.printf("학번 : %s\n", k31_tag_studentid.item(i).getFirstChild().getNodeValue());
			System.out.printf("국어 : %s\n", k31_tag_kor.item(i).getFirstChild().getNodeValue());
			System.out.printf("영어 : %s\n", k31_tag_eng.item(i).getFirstChild().getNodeValue());
			System.out.printf("수학 : %s\n", k31_tag_mat.item(i).getFirstChild().getNodeValue());
			System.out.println("****************************************");		
		}
		
		

	}

}
