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
		
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); //DocumentBuilder ��ü ����
		
		Document doc = docBuilder.parse(new File("C:\\Users\\local pc\\Desktop\\testdata.xml")); //Document ��ü ���� ���� ��� ����
		Element root = doc.getDocumentElement(); //Element ��ü ����
		
		
		
		NodeList k31_tag_name = doc.getElementsByTagName("name");  //tag�� "name"�� ���� ������ nodelist�� ���� 
		NodeList k31_tag_studentid = doc.getElementsByTagName("studentid"); //tag�� "studentid"�� ���� ������ nodelist�� ���� 
		NodeList k31_tag_kor = doc.getElementsByTagName("kor"); //tag�� "kor"�� ���� ������ nodelist�� ���� 
		NodeList k31_tag_eng = doc.getElementsByTagName("eng"); //tag�� "eng"�� ���� ������ nodelist�� ���� 
		NodeList k31_tag_mat = doc.getElementsByTagName("mat"); //tag�� "mat"�� ���� ������ nodelist�� ���� 
		
		//��º�
		System.out.println("****************************************");
		for (int i = 0; i < k31_tag_name.getLength(); i++) { //tagname�� ���̸�ŭ �ݺ�
			System.out.printf("�̸� : %s\n", k31_tag_name.item(i).getFirstChild().getNodeValue()); //name�� ���
			System.out.printf("�й� : %s\n", k31_tag_studentid.item(i).getFirstChild().getNodeValue()); //studentid�� ���
			System.out.printf("���� : %s\n", k31_tag_kor.item(i).getFirstChild().getNodeValue()); //kor�� ���
			System.out.printf("���� : %s\n", k31_tag_eng.item(i).getFirstChild().getNodeValue()); //eng�� ���
			System.out.printf("���� : %s\n", k31_tag_mat.item(i).getFirstChild().getNodeValue()); //mat�� ���
			System.out.println("****************************************");		 
		}
	}
}
