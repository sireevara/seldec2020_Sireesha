package week2.day1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learndropdown {

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
		WebElement dropDown =driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(dropDown);
		source.selectByVisibleText("Cold Call");
		WebElement dropDown1 =driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownrship=new Select(dropDown1);
		ownrship.selectByValue("OWN_PARTNERSHIP");
		WebElement dropDown2 =driver.findElementById("createLeadForm_marketingCampaignId");
		Select MarkCamp=new Select(dropDown2);
		MarkCamp.selectByIndex(1);
		//method to find out all the list of options in dropdown
		WebElement state=driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select StateValues=new Select(state);
		List<WebElement> ListofOptions = StateValues.getOptions();
		int CountofOptions=ListofOptions.size();
		StateValues.selectByIndex(CountofOptions-1);
		WebElement SelectedOption=StateValues.getFirstSelectedOption();
		System.out.println(SelectedOption.getText());
		
	
	}

}
