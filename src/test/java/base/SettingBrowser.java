package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SettingBrowser {

	public WebDriver driver;
	FileReader browserInfoFile;
	public final Properties PropBrFile = new Properties();
	static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public WebDriver WebDriver_initilize(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(PropBrFile.getProperty("url"));
			tdriver.set(driver);
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{  
			driver = new FirefoxDriver();
			driver.get(PropBrFile.getProperty("url"));
			tdriver.set(driver);
		}
		return getDriver();
	}
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

	@BeforeMethod()
	public void setUpBrowser() throws IOException {
		if (driver == null) {
			browserInfoFile = new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\config.properties");
			PropBrFile.load(browserInfoFile);

		}
		if (PropBrFile.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver=WebDriver_initilize("firefox");
			driver.get(PropBrFile.getProperty("url"));
			driver.manage().window().maximize();
		} else if (PropBrFile.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver=WebDriver_initilize("firefox");
			driver.get(PropBrFile.getProperty("url"));
			driver.manage().window().maximize();

		} else {
			System.out.println("WebBrowser Not found");
		}
	}

	@AfterMethod()
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
