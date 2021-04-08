package com.assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main extends PojoClass {

	public Main(WebDriver driver) {
		super(driver);

	}

	public static WebDriver driver;
	public static PojoClass p;
	public static Select s;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Gopal Patchayappan\\LennoxProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(excelGetValue("Sheet1", 1, 0));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		p = new PojoClass(driver);
		click(p.getSign());

		enterValue(p.getTxtUserName(), excelGetValue("Sheet1", 1, 1));

		enterValue(p.getTxtPassword(), excelGetValue("Sheet1", 1, 2));

		click(p.getTxtLoginBtn());

		click(p.getMenuBtn());

		click(p.getSalesTool());

		click(p.getBuild_a_Proposal());

		Thread.sleep(10000);

		Actions action = new Actions(driver);

		action.moveToElement(p.getSelectLead()).build().perform();
		click(p.getSelectLead());

		click(p.getAddLead());

		enterValue(p.getFirstName(), excelGetValue("Sheet1", 1, 3));

		enterValue(p.getLastName(), excelGetValue("Sheet1", 1, 4));

		enterValue(p.getPhNo(), excelGetValue("Sheet1", 1, 5));

		enterValue(p.getEmail(), excelGetValue("Sheet1", 1, 6));

		click(p.getCalender());

		click(p.getDate1());

		s = new Select(p.getSchedulResTime());

		s.selectByIndex(9);

		click(p.getCalender1());

		click(p.getDate2());

		click(p.getAddDocument());

		s = new Select(p.getSelectDocumentType());
		s.selectByIndex(1);

		Thread.sleep(3000);

		Actions a = new Actions(driver);

		a.moveToElement(p.getSelectFile()).click().perform();
		Thread.sleep(10000);

		uploadFile("F:\\hello\\Gopal.pdf");
		Thread.sleep(10000);

		click(p.getAddLead1());

		Thread.sleep(10000);

		click(p.getSaveLead());

		String attribute = p.getMessage().getAttribute("value");

		if (attribute.equals("Lead Saved Successfully")) {

			System.out.println("File Uploaded Successfully");

		}

	}

}
