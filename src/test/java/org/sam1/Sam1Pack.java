package org.sam1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam1Pack {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saba Siva\\eclipse-workspace\\FacebookMaven\\driver\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 System.out.println("Hello Hi...........");
		 
		 System.out.println("Project is done successfully");
	}
}
