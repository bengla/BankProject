import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForGitProject {
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
		driver.get("https://www.google.com/");
    }
}