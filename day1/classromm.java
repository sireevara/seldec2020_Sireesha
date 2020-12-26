package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classromm {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username=driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
	    driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
        Select sourceValues=new Select(source);
		List<WebElement> Listofsource = sourceValues.getOptions();
		int Countofsource=Listofsource.size();
		Listofsource.get(Countofsource-2).click();
	    WebElement MarkCampaign=driver.findElementById("createLeadForm_marketingCampaignId");
	    Select MarkCampValues=new Select(MarkCampaign);
	    List<WebElement> MarkCampValueslist = MarkCampValues.getOptions();
	    int Count=MarkCampValueslist.size();
	    MarkCampValueslist.get(Count-1).click();
	}
	
	

}
