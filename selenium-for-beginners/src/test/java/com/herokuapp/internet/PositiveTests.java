package com.herokuapp.internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {
	@Test
	public void loginTest() {
		System.out.println("TESTING LOGIN");
		
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//open test page
		String url = "http://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is opened");
		

		
		// sleep for 3 seconds
//		sleep(3000);
		
		//enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		
		//enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSeceretPassword");
		//click login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		
		//logout button
		WebElement logoutButton = driver.findElement(By.xpath("//a[@class= 'button secondary radius']"));
		
		//successful login message
		WebElement successMessage = driver.findElement(By.cssSelector("#flash"));
		
		// close browser
		driver.quit();
		
	}

}
