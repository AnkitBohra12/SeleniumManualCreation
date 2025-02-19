package FirstSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
//		Launch Browser
		WebDriver driver = new ChromeDriver();
		ChromeDriver driver2 = new ChromeDriver();
		
//		Get the website
		driver.get("www.google.com");
//		Maximize the window
		driver.manage().window().maximize();
		
//		get the title
		String exp_title = "Google";
		String act_title = driver.getTitle();
		
//		comparing the title
		if(exp_title.equals(act_title)) {
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
		

	}

}
