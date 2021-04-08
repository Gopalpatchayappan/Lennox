package com.assessment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Gopal Patchayappan\\LennoxProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void enterValue(WebElement element, String Data) {
		element.sendKeys(Data);

	}

	public static void click(WebElement element) {
		element.click();

	}

	public static String excelGetValue(String sheetname, int row, int cell) throws Exception {

		File file = new File("F:\\Gopal Patchayappan\\LennoxProject\\excel\\Lennox.xlsx");
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);

		int type = c.getCellType();

		String input = null;

		if (type == 1) {
			input = c.getStringCellValue();
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			input = String.valueOf(l);
		}
		return input;

	}

	public static void setClipBoard(String file) {
		StringSelection obj = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);

	}

	public static void uploadFile(String FilePath) throws AWTException {

		setClipBoard(FilePath);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
