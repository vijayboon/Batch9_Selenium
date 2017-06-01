package Com.Project.Tracko;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_Up {
	
WebDriver driver;

By signUpBtn_locator = By.xpath("//a[@class='btn btn-cta btn-cta-secondary'][@href='trackoweb/signup.html']");
	
	public Sign_Up(WebDriver driver2)
	{
		driver=driver2;
	}
	
	public void func()
	{
		System.out.println("Function is working");
	}
	
	public void signup()
	{
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement SignupBtn = driver.findElement(signUpBtn_locator);
		SignupBtn.click();		
	}

}
