package Com.Project.Tracko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Otp_SignUp {
	
	WebDriver driver;
	By otptxtbox_locator= By.xpath("//input[@id='otp'][@placeholder='Otp code']");
	By verifybtn_locator= By.xpath("//button[@id='sub_btn_verify']");
	By confirmbtn_locator=By.xpath("//button[@class='confirm']");
	
	public Otp_SignUp(WebDriver driver2)
	{
		driver=driver2;
	}
	
	public void otptxtbox_function() 
	{
		WebElement otptxtbox=driver.findElement(By.xpath("//input[@id='otp'][@placeholder='Otp code']"));
		otptxtbox.sendKeys("123456");
	}
	
	public void verifybtn_function() throws InterruptedException
	{
		
		WebElement verifybtn=driver.findElement(By.xpath("//button[@id='sub_btn_verify']"));
		verifybtn.click();
		
		Thread.sleep(5000);
	}
	
	public void confirmbtn_function()
	{
		
		WebElement confirmbtn =driver.findElement(By.xpath("//button[@class='confirm']"));
		confirmbtn.click();
	}

}
