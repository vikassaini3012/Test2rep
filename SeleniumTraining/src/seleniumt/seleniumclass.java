package seleniumt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass 

{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaTraining\\chromedriver_win32\\chromedriver.exe");	
		ChromeDriver chdriver = new ChromeDriver();
		
		chdriver.get("https://www.facebook.com/");
		chdriver.manage().window().maximize();
		
		//chdriver.findElements(By.id("email")).sendkeys()
	
		//ABS Comments
		
	
	}
}
