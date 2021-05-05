package newmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Newtest {
//WebDriver driver;
reportDemo report=new reportDemo();
	
	public void launch(){
		 //System.setProperty("webdriver.chrome.driver", "E:\\WorkSpace\\Drivers&API's\\chromedriver.exe");
	      // driver=new ChromeDriver();
	     //  driver.get("http://qualitypointtech.net/timesheetdemo/index.php");
	}
	
@Test()
	public void start() throws InterruptedException{
	boolean status=false;
	report.onTestStart();
	System.out.println("Test ");
		/*Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.name("login")).click();*/
		status=true;
		report.test.log(LogStatus.PASS, "Pass");
	
		report.onFinish();
	}
}
