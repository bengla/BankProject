import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BankAcc {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuru\\Desktop\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");	
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
	}
	@Test
	public void Test() {
		driver.get("https://stage-go.wepay.com/getting-started");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,350)");
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("kabir");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("ahmed");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("ahmedkabir@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("kulkatta.com");
		driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("7773054455");
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"State\"]")));
		dropdown.selectByVisibleText("DC");
		
		dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"Country\"]")));
		dropdown.selectByVisibleText("India");
		js.executeScript("scroll(0,150)");
		
		dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"Number_of_Platform_Users__c\"]")));
		dropdown.selectByVisibleText("101-1,000");
		
		driver.findElement(By.xpath("//*[@id=\"Number_of_Platform_Users__c\"]"));
		driver.findElement(By.xpath("//*[@id=\"Referrer_Description__c\"]")).sendKeys("FOR FUNN");
		driver.findElement(By.xpath("//*[@id=\"mktoForm_1234\"]/div[15]/span/button")).click();
		
		driver.get("https://go.wepay.com/thank-you");
		driver.findElement(By.xpath("//*[@id=\"75\"]/div/div[1]/div/a")).click();
		
		
	}
}
