package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://vegzo.trygo.in/");
		 
		 String title =driver.getTitle();
		 
		 System.out.println("Page title" + title);
		 
		 System.out.println("URL" + driver.getCurrentUrl());
		 

		 System.out.println( driver.getPageSource());

		
	}

}
