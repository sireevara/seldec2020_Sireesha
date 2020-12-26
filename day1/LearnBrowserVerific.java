package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnBrowserVerific {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("The title of the page is" +driver.getTitle());
		if(driver.getTitle().contains("Leaftaps"))
		{
			System.out.println("The title contains leaftaps");
			
		}else
		{
			System.out.println("The title doesnt match");
		}
	
       System.out.println("The url of the page is "  +driver.getCurrentUrl());
       if(driver.getCurrentUrl().contains("leaftaps"))
       {
    	   System.out.println("URL Matched");
       }else
       {
    	   System.out.println("URL Mismatched");
       }
       
       System.out.println("The Page source code of last page loaded"  +driver.getPageSource());
       }       
	}


