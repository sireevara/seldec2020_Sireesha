package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeVerfication {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    WebElement Attval=driver.findElementByName("username");
	    String GetAttValue=Attval.getAttribute("value");
	    System.out.println(GetAttValue);
	    if(Attval.getAttribute("value").contains("TestLeaf")) {
	    	
	    	System.out.println("Attibute value is correct");
	    }else
	    	System.out.println("Attibute value is incorrect");
 		 driver.get("http://leafground.com/pages/Link.html");
 		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 		 WebElement LinkAtt = driver.findElementByLinkText
 		 ("Find where am supposed to go without clicking me?");
 		 String ClickLink=LinkAtt.getAttribute("href");
 		 System.out.println(ClickLink); 
 		 driver.get("http://leafground.com/pages/Button.html");
 		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 		 System.out.println("CSS Value:"+ driver.findElementById("color").getCssValue("background-color"));
 		 System.out.println(driver.findElementById("home").getText());
 		 System.out.println("Size of the Element:"+ driver.findElementById("color").getSize());
 		 System.out.println("Location of the Element:"+ driver.findElementById("color").getLocation().getX());
 		 System.out.println("Tagname of the Element:"+ driver.findElementById("color").getTagName());
 		 System.out.println("Element is displayed:"+ driver.findElementById("color").isDisplayed());
 		 driver.get("http://leafground.com/pages/Edit.html");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 		 System.out.println("Element is enabled:"+ driver.findElementByName("username").isEnabled());
 		 System.out.println("Element is enabled:"+ driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/div/div/input").isEnabled());
 		 driver.get("http://leafground.com/pages/checkbox.html");
 		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 		 System.out.println("Element is Checked or not:"+ driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/div[1]").isSelected());
 		
 		
 		 }
	    }


