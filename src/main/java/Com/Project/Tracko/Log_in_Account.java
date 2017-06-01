package Com.Project.Tracko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Log_in_Account {
	WebDriver driver;
	By mobiletxtbox_locator=By.xpath("//input[@id='login-mobile'][@class='form-control login-mobile num']");
	By passtxtbox_locator=By.xpath("//input[@id='login-password'][@class='form-control login-password']");
	By submitbtn_locator=By.xpath("//button[@type='submit'][@id='sub_btn']");
	
	String mobail;
	
	public Log_in_Account(WebDriver driver5)
	{
		driver=driver5;
	}
	
	
	public void mobiletxtbox_function(String mobail)

	{
		WebElement mobiletxtbox=driver.findElement(By.xpath("//input[@id='login-mobile'][@class='form-control login-mobile num']"));
		mobiletxtbox.sendKeys(mobail);
	}
	public void passtxtbox_function()
	{
		WebElement passtxtbox=driver.findElement(By.xpath("//input[@id='login-password'][@class='form-control login-password']"));
		passtxtbox.sendKeys("VijayBoon@21");
		
	}
	
	public void submitbtn_function()
	{
		
		WebElement submitbtn=driver.findElement(By.xpath("//button[@type='submit'][@id='sub_btn']"));
		submitbtn.click();
	}


}
