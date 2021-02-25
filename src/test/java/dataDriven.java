import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataDriven {
	static WebDriver driver;
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public dataDriven(String excelPath,String sheetName) throws IOException {
		fis = new FileInputStream(excelPath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		
	}
	public static WebDriver loadBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Workspace\\maven\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}
	
	
	
	
	
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	
	public static void launchUrl(String url) {
		driver.get(url);

	}
	
	public static void fill(WebElement element,String text) {
		element.sendKeys(text);

	}
	
	public void btnClick(WebElement element) {
		element.click();

	}
	
	public void getCellRowCount() throws IOException {
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);

	}
	
	public String getCellValue(int rowNum,int colNum) throws IOException {
		
		String cellValue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return cellValue;

	}
	

	public static void main(String[] args) throws IOException {
		
		








	}
}
