package Com.Project.Tracko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Creat_Acc 
{
	WebDriver driver;
	String email;
	String mobail;
	String name;
	
	
	By nametxtbox_locator= By.xpath("//input[@id='name'][@placeholder='Your name']");
	By emailtextbox_locator=By.xpath("//input[@id='email'][@placeholder='Your email']");
	By mobtxtbox_locator= By.xpath("//input[@id='mobile'][@placeholder='Mobile']");
	By signbtn_locator= By.xpath("//button[@id='sub_btn_signup']");
	
	public Creat_Acc(WebDriver driver3)
	{
		driver=driver3;
	}
	
	public void signbtn_function(String name,String email,String mobail )
	{
		WebElement nametxtbox=driver.findElement(nametxtbox_locator);
		nametxtbox.sendKeys(name);
		
		WebElement emailtextbox = driver.findElement(emailtextbox_locator);
		emailtextbox.sendKeys(email);
		
		WebElement mobtxtbox=driver.findElement(mobtxtbox_locator);
		mobtxtbox.sendKeys(mobail);
		
		WebElement signbtn=driver.findElement(By.xpath("//button[@id='sub_btn_signup']"));
		signbtn.click();
	}

}
