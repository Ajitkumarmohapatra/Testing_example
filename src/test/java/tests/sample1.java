package tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
	//	System.out.println(driver.manage().window().getSize());
		driver.manage().window().setSize(new Dimension(500 , 300));
		

	}

}
