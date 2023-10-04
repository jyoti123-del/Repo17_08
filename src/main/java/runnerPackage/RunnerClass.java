package runnerPackage;

import org.openqa.selenium.WebDriver;

import basePackage.BaseClass;
import pomPackage.Calendar;
import pomPackage.LogInTest1;

public class RunnerClass extends BaseClass {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
	
     driver=BaseClass.getdriver();
	
     LogInTest1 lg= new LogInTest1(driver);

	lg.SendEmail();
	lg.Sendpassword();
	lg.ShowPassword();
    lg.getOTP();
	Thread.sleep(20000);
	lg.clickVerifybtn();
    Calendar cd=new Calendar(driver);
    cd.selectDate();
   // cd.clickonCalendar();
	
	
	
	
	
	
}
}