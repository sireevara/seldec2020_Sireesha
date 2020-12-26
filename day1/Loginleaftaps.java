package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginleaftaps {

	public static void main(String[] args) throws InterruptedException {
		
// Precondition to start the webdriver
		
		WebDriverManager.chromedriver().setup();
		
//Manual import of the browser driver ((System.out.println(System.getProperty("webdriver.chrome.driver"))
		
//step 1 Launching the chrome browser
		
		ChromeDriver driver=new ChromeDriver();
		
//step 2 Maximize the browser
		
		driver.manage().window().maximize();
		
//Load the application URL
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
// Enter username
		
		WebElement username=driver.findElementById("username");
		
		username.sendKeys("demosalesmanager");
		
// Enter Password
		
		driver.findElementById("password").sendKeys("crmsfa");
		
//login
		
		driver.findElementByClassName("decorativeSubmit").click();
		
//Click on Linktext
		
		driver.findElementByLinkText("CRM/SFA").click();
		
//Click on Leads tab
		
		driver.findElementByLinkText("Leads").click();
		
//Click on createlead
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
        driver.findElementById("createLeadForm_firstName").sendKeys("siri");
        driver.findElementById("createLeadForm_lastName").sendKeys("vara");
        driver.findElementByName("submitButton").click();
        
//		Thread.sleep(2000);
//		driver.close();
//      Enter User Name
//      Enter Password
//      Click Login
		
		

	}

}
