package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");  //helps us to open url
		System.out.println(driver.getTitle());    //helps us to capture title of that particular page
		System.out.println(driver.getCurrentUrl()); //helps us capture cureent url which is opened in ur browser
		System.out.println(driver.getWindowHandle()); //it will capture current window name
	//	System.out.println(driver.getPageSource());  // capture backend html particular code
		driver.close();  // close the window
		// driver.quit();  
		
  //browser methods
	}

}
