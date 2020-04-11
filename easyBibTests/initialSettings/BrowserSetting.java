package initialSettings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BrowserSetting {

	public WebDriver BrowserSettings() {
		String Base_Url = "https://www.easybib.com/project/style/mla8?id=1586186473_5e8b48e9ce6bd6.38423782";
		WebdriverSettings wds = new WebdriverSettings();
		WebDriver driver = wds.driverSettings();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(Base_Url);
		return driver;
	}
}