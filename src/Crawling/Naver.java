package Crawling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	


public class Naver {
	
	 //WebDriver
    private static WebDriver driver;
    
    //Properties
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:/chromedriver/chromedriver.exe";

	// 크롤링 할 URL
	private static String base_url;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);

		// Driver SetUp
		driver = new ChromeDriver();
		base_url = "https://www.naver.com/"; // naver 접속 //
		driver.get(base_url);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input")).click(); // 검색창
																													// 클릭//

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input"))
				.sendKeys("에버랜드");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/button/span[2]")).click(); // 검색
																															// 클릭//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/ul/li[2]/a")).click(); // view 클릭

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[1]/div/div[3]/a")).click(); // option
																												// 클릭

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div[1]/a[8]")).click(); // 1년
																															// 클릭

		var stTime = new Date().getTime(); // 현재시간
		while (new Date().getTime() < stTime + 15000) { // 30초 동안 무한스크롤 지속
			Thread.sleep(500); // 리소스 초과 방지
			// executeScript: 해당 페이지에 JavaScript 명령을 보내는 거
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}

		String[] day = new String[211];
		String[] title = new String[211];

		for (int i = 1; i < 211; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			day[i] = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
							+ i + "]/div/div[1]/a/div[2]/span")) // 날짜 텍스트 긁어오기//
					.getText();
			System.out.print("\"" + day[i] + "\"" + ",");

			title[i] = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
							+ i + "]/div/div[4]/a")) // 블로그 제목//
					.getText();
			System.out.println("\"" + title[i] + "\"");

		}
		
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]/div[1]/div/h1/a/i")).click(); // 네이버 클릭(메인 돌아가기)
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input")).click(); // 검색창
																													// 클릭//

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input"))
				.sendKeys("롯데월드");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/button/span[2]")).click(); // 검색
																															// 클릭//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/ul/li[3]/a")).click(); // view 클릭

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[1]/div/div[3]/a")).click(); // option
																												// 클릭

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div[1]/a[8]")).click(); // 1년
																															// 클릭

		while (new Date().getTime() < stTime + 30000) { // 30초 동안 무한스크롤 지속
			Thread.sleep(500); // 리소스 초과 방지
			// executeScript: 해당 페이지에 JavaScript 명령을 보내는 거
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}

		String[] day2 = new String[211];
		String[] title2 = new String[211];

		for (int i = 1; i < 211; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			day2[i] = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
							+ i + "]/div/div[1]/a/div[2]/span")) // 날짜 텍스트 긁어오기//
					.getText();
			System.out.print("\"" + day2[i] + "\"" + ",");

			title2[i] = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
							+ i + "]/div/div[4]/a")) // 블로그 제목//
					.getText();
			System.out.println("\"" + title2[i] + "\"");

		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]/div[1]/div/h1/a/i")).click(); // 네이버 클릭(메인 돌아가기)
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input")).click(); // 검색창
																													// 클릭//

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/div/input"))
				.sendKeys("서울랜드");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/div[3]/form/fieldset/button/span[2]")).click(); // 검색
																															// 클릭//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[1]/div/ul/li[3]/a")).click(); // view 클릭

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[1]/div/div[3]/a")).click(); // option
																												// 클릭

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div[2]/ul/li[2]/div/div[1]/a[8]")).click(); // 1년
																															// 클릭

		while (new Date().getTime() < stTime + 30000) { // 30초 동안 무한스크롤 지속
			Thread.sleep(500); // 리소스 초과 방지
			// executeScript: 해당 페이지에 JavaScript 명령을 보내는 거
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}

		String[] day3 = new String[211];
		String[] title3 = new String[211];

		for (int i = 1; i < 211; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			day3[i] = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
							+ i + "]/div/div[1]/a/div[2]/span")) // 날짜 텍스트 긁어오기//
					.getText();
			System.out.print("\"" + day3[i] + "\"" + ",");

			title3[i] = driver.findElement(By.xpath(
					"/html/body/div[3]/div[2]/div/div[1]/section/div/div[2]/panel-list/div[1]/more-contents/div/ul/li["
							+ i + "]/div/div[4]/a")) // 블로그 제목//
					.getText();
			System.out.println("\"" + title3[i] + "\"");

		}
		
		
//		public static void FileReadWriter() throws IOException {
//		File f = new File(".csv");
//		BufferedWriter bw = new BufferedWriter (new FileWriter(f));
//		
//		bw.write();
//		bw.newLine();
//		bw.write();
//		bw.newLine();
//		
//		bw.close();
//		
//		
//	}
		
	}

}
