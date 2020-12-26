package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classrm_xp_firstleadid {
public static void main(String[] args) throws InterruptedException {
					
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	//WebElement username=driver.findElementById("username");
	driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
    //driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	//driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	//driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByXPath("//div[@id='label']").click();
	//driver.findElementByLinkText("Leads").click();
	driver.findElementByXPath("//div[@class='x-panel-header']").click();
	//driver.findElementByLinkText("Create Lead").click();
	//driver.findElementByXPath("//a[contains(@href,'findLeads')]").click();
//	WebElement Firstleadidvalue = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
//	String id=Firstleadidvalue.getText();
//	System.out.println(id);
}
}