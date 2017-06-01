package Com.Project.Tracko;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SetUp {
	
	WebDriver driver;
	String email="Tooni@gmail.com";
	String mobail="7878787878";
	String name="Boon";
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  Sign_Up ref=new Sign_Up(driver);
	  ref.func();
	  ref.signup();
	  
	  Creat_Acc ref2 =new Creat_Acc(driver);
	  ref2.signbtn_function(name, email, mobail);
	  
	  Otp_SignUp ref3=new Otp_SignUp(driver);
	  ref3.otptxtbox_function();
	  ref3.verifybtn_function();
	  ref3.confirmbtn_function();
	  
	  SetPassword ref4=new SetPassword(driver);
	  ref4.setpasstxtbox_function();
	  ref4.Resetpasstxtbox_function();
	  ref4.setpassbtn_function();
	  
	  Log_in_Account ref5=new Log_in_Account(driver);
	  ref5.mobiletxtbox_function(mobail);
	 ref5.passtxtbox_function();
	 ref5.submitbtn_function();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://dev.tracko.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
