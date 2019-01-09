import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Facebook {

	public static void main(String[] args) 
	{
		FileInputStream fi=new FileInputStream("./Inputfile/web.xlsx");
		Workbook wb=new XSSFWorkbook(fi);
		Sheet sh=wb.getSheet("Sheet1");
		
		
		Facebook f=new Facebook();
		

		
		ExtentHtmlReporter report=new ExtentHtmlReporter("./reports/report.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		ExtentTest logger=extent.createTest("Signing to facebook");
		logger.log(Status.INFO, "Facebook----");
		
		
		System.setProperty("webdriver.gecko.driver","D:\\documents\\tarun\\Gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://facebook.com");
		logger.log(Status.INFO, "Log Into Fb");
		
		
		

		  
	 
		String eb1=sh.getRow(0).getCell(0).getStringCellValue();
		String eb2=sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.id("email")).sendKeys(eb1);
		
		driver.findElement(By.id("pass")).sendKeys(eb2);
		
		logger.pass("LogIn Success");
		
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		
		logger.log(Status.INFO,"Logged In successfully");
		
		Thread.sleep(10000);
		
		driver.close();
		
	
		
		
		
		extent.flush();
		
		fi.close();
		
		
	
		

	}