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
		
		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder(); //DocumentBuilder 객체 선언
		
		Document doc = docBuilder.parse(new File("C:\\Users\\local pc\\Desktop\\weather.xml"));		  //Document 객체 선언 파일 경로 지정
		Element root = doc.getDocumentElement(); //Element 객체 선언
		
		//xml의 루트를 기준으로  data태그를 찾는다.
		NodeList k31_tag = doc.getElementsByTagName("data");
		
		//String 변수 선언
		String k31_seq = ""; //48시간중 몇번째 인지 알려줌
		String k31_hour = ""; //동네예보 3시간 단위
		String k31_day = ""; // 몇번째날(0: 오늘 / 1: 내일 / 2: 모레)
		String k31_temp = ""; //현재 시간 온도
		String k31_tmx = ""; // 최고 온도
		String k31_tmn = ""; // 최저 온도
		String k31_sky = ""; // 하늘 상태코드 (1: 맑음, 2: 구름 조금, 3: 구름많음, 4: 흐림)
		String k31_pty = ""; // 강수상태코드 (0 :없음, 1: 비, 2: 비/눈, 3:,눈/비 , 4: 눈)
		String k31_wfKor = ""; //날씨 한국어
		String k31_wfEn = ""; // 날씨 영어
		String k31_pop = ""; //강수 확률 %
		String k31_r12 = ""; // 12시간 예상 강수량
		String k31_s12 = ""; // 12시간 예상 적설량
		String k31_ws = ""; //풍속 (m/s)
		String k31_wd = ""; //풍향 (0~7 : 북, 북동, 동, 남동, 남, 남서, 서, 북서)
		String k31_wdKor = ""; //풍향 한국어
		String k31_wdEn = ""; //풍향 영어
		String k31_reh = ""; //습도 %
		String k31_r06 = ""; // 6시간 예상 강수량
		String k31_s06 = ""; // 6시간 예상 적설량
		
		//데이터 파싱
		for(int i=0; i<k31_tag.getLength(); i++) {			//for 반복 0부터 tag 길이 만큼 반복
			k31_seq=k31_tag.item(i).getAttributes().getNamedItem("seq").getNodeValue(); //seq는 seq에서 가져옴
			Element elmt=(Element)k31_tag.item(i); //Element 객체 선언
		    k31_hour=elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue(); // TagName "hour"의 요소를 가져와서 대입
		    k31_day=elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue(); // TagName "day"의 요소를 가져와서 대입
		    k31_temp=elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue(); // TagName "temp"의 요소를 가져와서 대입
		    k31_tmx=elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue(); // TagName "tmx"의 요소를 가져와서 대입
		    k31_tmn=elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue(); // TagName "tmn"의 요소를 가져와서 대입
		    k31_sky=elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue(); // TagName "sky"의 요소를 가져와서 대입
		    k31_pty=elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue(); // TagName "pty"의 요소를 가져와서 대입
		    k31_wfKor=elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue(); // TagName "wfKor"의 요소를 가져와서 대입
		    k31_wfEn=elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue(); // TagName "wfEn"의 요소를 가져와서 대입
		    k31_pop=elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue(); // TagName "pop"의 요소를 가져와서 대입
		    k31_r12=elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue(); // TagName "r12"의 요소를 가져와서 대입
		    k31_s12=elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue(); // TagName "s12"의 요소를 가져와서 대입
		    k31_ws=elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue(); // TagName "ws"의 요소를 가져와서 대입
		    k31_wd=elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue(); // TagName "wd"의 요소를 가져와서 대입
		    k31_wdKor=elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue(); // TagName "wdKor"의 요소를 가져와서 대입
		    k31_wdEn=elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue(); // TagName "wdEn"의 요소를 가져와서 대입
		    k31_reh=elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue(); // TagName "reh"의 요소를 가져와서 대입
			k31_r06 = elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue(); // TagName "r06"의 요소를 가져와서 대입
			k31_s06 = elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue(); // TagName "s06"의 요소를 가져와서 대입
 
		//출력부
			System.out.println("*******************************************************");
			System.out.printf("시간 : %s\n", k31_hour);
			System.out.printf("day : %s (0: 오늘 / 1: 내일 / 2: 모레)\n", k31_day);
			System.out.printf("현재 시간온도 : %s\n", k31_temp);
			System.out.printf("최고기온: %s\n", k31_tmx);
			System.out.printf("최저기온 : %s\n", k31_tmn);
			System.out.printf("하늘 : %s (1: 맑음, 2: 구름 조금, 3: 구름많음, 4: 흐림) \n", k31_sky);
			System.out.printf("강수 : %s (0 :없음, 1: 비, 2: 비/눈, 3:,눈/비 , 4: 눈) \n", k31_pty);
			System.out.printf("날씨(Kor) : %s\n", k31_wfKor);
			System.out.printf("날씨(Eng) : %s\n", k31_wfEn);
			System.out.printf("강수확률(%%) : %s\n", k31_pop);
			System.out.printf("12시간 예상 강수량 : %s\n", k31_r12);
			System.out.printf("12시간 예상 적설량 : %s\n", k31_s12);
			System.out.printf("풍속 : %s (m/s)\n", k31_ws);
			System.out.printf("풍향 : %s (0~7 : 북, 북동, 동, 남동, 남, 남서, 서, 북서)\n", k31_wd);
			System.out.printf("풍향(Kor) : %s\n", k31_wdKor);
			System.out.printf("풍향(Eng) : %s\n", k31_wdEn);
			System.out.printf("습도(%%) : %s\n", k31_reh);
			System.out.printf("6시간 예상 강수량 : %s\n", k31_r06);
			System.out.printf("6시간 예상 적설량 : %s\n", k31_s06);
			System.out.println("*******************************************************");

		}

	}

}

