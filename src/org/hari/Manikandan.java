package org.hari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manikandan {

	public static void main(String[] args) {
		// configure browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M SAI KRISHNA\\eclipse-workspace\\SELENIUM\\DRIVER\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		//to launch url
		
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
      String url = driver.getCurrentUrl();
      System.out.println(url);
      
	
        
        
        
       }

}
