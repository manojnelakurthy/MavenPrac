package newmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtest {
WebDriver driver;

	@BeforeTest
	public void launch(){
		 System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\Drivers&API's\\chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.get("http://qualitypointtech.net/timesheetdemo/index.php");
	}
	
@Test(parameters={"uname","pword"})
	public void start(String uname,String pword) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.name("login")).click();
		driver.switchTo().alert().accept();
	}
}
