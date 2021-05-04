package newmaven;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportDemo {

	public static ExtentReports reports=null;
	public ExtentTest test = null;
	public  String reportName= "";
	
	public void onTestStart(){
		reportName = "report.html";
		reports = new ExtentReports(reportName);
		System.out.println("on test start");
		test =reports.startTest("Any Variable");
	}
	
	public void onFinish(){
		reports.endTest(test);
		
		reports.flush();
	}
	
	@Test
	public void first(){
		onTestStart();
		test.log(LogStatus.INFO, "pass");
		onFinish();
	}
}
