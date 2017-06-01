package Com.Project.Tracko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SetPassword {
	WebDriver driver;
	
	By setpasstxtbox_locator=By.xpath("//input[@id='password'][@class='form-control login-password']");
	By Resetpasstxtbox_locator=By.xpath("//input[@id='repassword'][@class='form-control login-rpassword']");
	By setpassbtn_locator=By.xpath("//button[@id='sub_btn_setpass']");
	
	public SetPassword(WebDriver driver4)
	{
		driver=driver4 ;
	}
	
	public void setpasstxtbox_function()
	{
		WebElement setpasstxtbox=driver.findElement(By.xpath("//input[@id='password'][@class='form-control login-password']"));
		setpasstxtbox.sendKeys("VijayBoon@21");
	}
	public void Resetpasstxtbox_function()
	{
		
		WebElement Resetpasstxtbox=driver.findElement(By.xpath("//input[@id='repassword'][@class='form-control login-rpassword']"));
		Resetpasstxtbox.sendKeys("VijayBoon@21");
	}
	public void setpassbtn_function()
	{
		
		WebElement setpassbtn=driver.findElement(By.xpath("//button[@id='sub_btn_setpass']"));
		setpassbtn.click();		
	}

}
