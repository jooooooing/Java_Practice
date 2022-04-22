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

public class Weather {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); //DocumentBuilder ��ü ����
		
		Document doc = docBuilder.parse(new File("C:\\Users\\local pc\\Desktop\\weather.xml"));		  //Document ��ü ���� ���� ��� ����
		Element root = doc.getDocumentElement(); //Element ��ü ����
		
		//xml�� ��Ʈ�� ��������  data�±׸� ã�´�.
		NodeList k31_tag = doc.getElementsByTagName("data");
		
		//String ���� ����
		String k31_seq = ""; //48�ð��� ���° ���� �˷���
		String k31_hour = ""; //���׿��� 3�ð� ����
		String k31_day = ""; // ���°��(0: ���� / 1: ���� / 2: ��)
		String k31_temp = ""; //���� �ð� �µ�
		String k31_tmx = ""; // �ְ� �µ�
		String k31_tmn = ""; // ���� �µ�
		String k31_sky = ""; // �ϴ� �����ڵ� (1: ����, 2: ���� ����, 3: ��������, 4: �帲)
		String k31_pty = ""; // ���������ڵ� (0 :����, 1: ��, 2: ��/��, 3:,��/�� , 4: ��)
		String k31_wfKor = ""; //���� �ѱ���
		String k31_wfEn = ""; // ���� ����
		String k31_pop = ""; //���� Ȯ�� %
		String k31_r12 = ""; // 12�ð� ���� ������
		String k31_s12 = ""; // 12�ð� ���� ������
		String k31_ws = ""; //ǳ�� (m/s)
		String k31_wd = ""; //ǳ�� (0~7 : ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)
		String k31_wdKor = ""; //ǳ�� �ѱ���
		String k31_wdEn = ""; //ǳ�� ����
		String k31_reh = ""; //���� %
		String k31_r06 = ""; // 6�ð� ���� ������
		String k31_s06 = ""; // 6�ð� ���� ������
		
		//������ �Ľ�
		for(int i=0; i<k31_tag.getLength(); i++) {			//for �ݺ� 0���� tag ���� ��ŭ �ݺ�
			k31_seq=k31_tag.item(i).getAttributes().getNamedItem("seq").getNodeValue(); //seq�� seq���� ������
			Element elmt=(Element)k31_tag.item(i); //Element ��ü ����
		    k31_hour=elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue(); // TagName "hour"�� ��Ҹ� �����ͼ� ����
		    k31_day=elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue(); // TagName "day"�� ��Ҹ� �����ͼ� ����
		    k31_temp=elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue(); // TagName "temp"�� ��Ҹ� �����ͼ� ����
		    k31_tmx=elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue(); // TagName "tmx"�� ��Ҹ� �����ͼ� ����
		    k31_tmn=elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue(); // TagName "tmn"�� ��Ҹ� �����ͼ� ����
		    k31_sky=elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue(); // TagName "sky"�� ��Ҹ� �����ͼ� ����
		    k31_pty=elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue(); // TagName "pty"�� ��Ҹ� �����ͼ� ����
		    k31_wfKor=elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue(); // TagName "wfKor"�� ��Ҹ� �����ͼ� ����
		    k31_wfEn=elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue(); // TagName "wfEn"�� ��Ҹ� �����ͼ� ����
		    k31_pop=elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue(); // TagName "pop"�� ��Ҹ� �����ͼ� ����
		    k31_r12=elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue(); // TagName "r12"�� ��Ҹ� �����ͼ� ����
		    k31_s12=elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue(); // TagName "s12"�� ��Ҹ� �����ͼ� ����
		    k31_ws=elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue(); // TagName "ws"�� ��Ҹ� �����ͼ� ����
		    k31_wd=elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue(); // TagName "wd"�� ��Ҹ� �����ͼ� ����
		    k31_wdKor=elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue(); // TagName "wdKor"�� ��Ҹ� �����ͼ� ����
		    k31_wdEn=elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue(); // TagName "wdEn"�� ��Ҹ� �����ͼ� ����
		    k31_reh=elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue(); // TagName "reh"�� ��Ҹ� �����ͼ� ����
			k31_r06 = elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue(); // TagName "r06"�� ��Ҹ� �����ͼ� ����
			k31_s06 = elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue(); // TagName "s06"�� ��Ҹ� �����ͼ� ����
 
		//��º�
			System.out.println("*******************************************************");
			System.out.printf("�ð� : %s\n", k31_hour);
			System.out.printf("day : %s (0: ���� / 1: ���� / 2: ��)\n", k31_day);
			System.out.printf("���� �ð��µ� : %s\n", k31_temp);
			System.out.printf("�ְ���: %s\n", k31_tmx);
			System.out.printf("������� : %s\n", k31_tmn);
			System.out.printf("�ϴ� : %s (1: ����, 2: ���� ����, 3: ��������, 4: �帲) \n", k31_sky);
			System.out.printf("���� : %s (0 :����, 1: ��, 2: ��/��, 3:,��/�� , 4: ��) \n", k31_pty);
			System.out.printf("����(Kor) : %s\n", k31_wfKor);
			System.out.printf("����(Eng) : %s\n", k31_wfEn);
			System.out.printf("����Ȯ��(%%) : %s\n", k31_pop);
			System.out.printf("12�ð� ���� ������ : %s\n", k31_r12);
			System.out.printf("12�ð� ���� ������ : %s\n", k31_s12);
			System.out.printf("ǳ�� : %s (m/s)\n", k31_ws);
			System.out.printf("ǳ�� : %s (0~7 : ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)\n", k31_wd);
			System.out.printf("ǳ��(Kor) : %s\n", k31_wdKor);
			System.out.printf("ǳ��(Eng) : %s\n", k31_wdEn);
			System.out.printf("����(%%) : %s\n", k31_reh);
			System.out.printf("6�ð� ���� ������ : %s\n", k31_r06);
			System.out.printf("6�ð� ���� ������ : %s\n", k31_s06);
			System.out.println("*******************************************************");

		}

	}

}

