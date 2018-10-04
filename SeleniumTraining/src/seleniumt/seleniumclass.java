package seleniumt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass 

{
	
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaTraining\\chromedriver_win32\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("vikas.saini1@gmail.com");
	
		driver.findElementByCssSelector("input[id = 'pass']").sendKeys("vikas123$");
		
		//driver.findElementByCssSelector("input[data-testid='royal_login_button']").click();
		WebElement loginclick = driver.findElementByCssSelector("input[data-testid='royal_login_button']");
		
		loginclick.click();
	}

	
	public void signup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaTraining\\chromedriver_win32\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElementByCssSelector("input[name='firstname']").sendKeys("lucky");
		driver.findElementByCssSelector("input[name='lastname']").sendKeys("saini");
		
		driver.findElementByCssSelector("input[name='reg_email__']").sendKeys("7973745001");
	//	driver.findElementByCssSelector("input[name='reg_email_confirmation_']").sendKeys("lucky.saini1@gmail.com");
		driver.findElementByCssSelector("input[name='reg_passwd__']").sendKeys("lucky123$");
		
	//	driver.findElementByCssSelector("input[name='sex']").click();
		
	driver.findElementByCssSelector("input[id='u_0_9']").click();
	driver.findElementByCssSelector("input[id='u_0_a']").click();
	
	//driver.findElementByCssSelector("input[type='radio'],[name='sex'],[value = '2']").click();

	//driver.findElementByCssSelector("input[name='sex'],[value = '2']").click();
		System.out.println (driver.findElementByCssSelector("input[name='websubmit']").getLocation());
	
		System.out.println("End of Program");
	}

	
	
	public static void main(String[] args) 
	{
		seleniumclass functions = new seleniumclass();
		
		functions.signup();
		
	}
}
