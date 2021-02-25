import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Executable {

	public static void main(String[] args) throws IOException {
		dataDriven d = new dataDriven("E:/Excel/Book1.xlsx", "testdata");
		WebDriver lb = d.loadBrowser();
		d.maxWindow();
		d.launchUrl("https://my.naukri.com/account/createaccount");
		WebElement btnFresher = lb.findElement(By.xpath("//button[@value='fresher']"));
		btnFresher.click();
		WebElement txtName = lb.findElement(By.xpath("//input[@name='fname']"));
		WebElement txtEmail = lb.findElement(By.xpath("//input[@id='email']"));
		WebElement txtPass = lb.findElement(By.xpath("//input[@name='password']"));
		WebElement txtMob = lb.findElement(By.xpath("//input[@ng-model='status.number']"));
		//WebElement txtCity = lb.findElement(By.xpath("//input[@ng-blur='onInputBlur()']"));
		
		//d.getCellRowCount();
		String nameCellValue = d.getCellValue(1, 1);
		String emailCellValue = d.getCellValue(2, 1);
		String passCellValue = d.getCellValue(3, 1);
		String phCellValue = d.getCellValue(4, 1);
		//String cityCellValue = d.getCellValue(5, 1);
		
		d.fill(txtName,nameCellValue );
		d.fill(txtEmail,emailCellValue);
		d.fill(txtPass,passCellValue );
		d.fill(txtPass,passCellValue );
		//d.fill(txtCity, cityCellValue);
		

	}

}
