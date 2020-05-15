package com.herokuapp.internet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTests {
//	@Test
	public void loginTest() {
		System.out.println("TESTING LOGIN");
		
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open test page
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		// sleep for 3 seconds
//		sleep(3000);
		
	}

}
