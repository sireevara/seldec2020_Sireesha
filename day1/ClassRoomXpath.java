package week2.day1;


	//driver.findElementByLinkText("Create Lead").click();
	driver.findElementByXPath("//a[contains(@href,'createLeadForm')]").click();
	//driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("IBM");
	//driver.findElementById("createLeadForm_firstName").sendKeys("siri");
	driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("siri");
	//driver.findElementById("createLeadForm_lastName").sendKeys("vara");
	driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("vara");
	driver.findElementByXPath("//input[@class='smallSubmit']").click();
//Thread.sleep(2000);
//driver.close();
			}
}
