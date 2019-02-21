package com.java.start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello, I am the first program from the Macbook Pro!");
		
		//System.getProperty("webdriver.chrome.driver", "Users⁩\\sanjaynakka⁩\\Downloads⁩\\googlechrome.dmg");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://apple.com");
		
		Thread.sleep(2000);
		
		driver.get("https://google.com");
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
