package verifyEasybibFunctionalities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import initialSettings.BrowserSetting;
import objectRepository.CitationPage;

/**
 * This class verifies the presence of certain buttons on Citations page
 * @author Jeel Patel
 * @version 1.0
 *
 */
public class VerifyButtons {
	BrowserSetting brSet;
	WebDriver driver;

	@BeforeClass
	public void driverInitialization(){

		brSet = new BrowserSetting();
		driver = brSet.BrowserSettings();
	}
	@Test
	public void verifyButtonPresence() {
		
		CitationPage cp = new CitationPage(driver);
		
		// Verify "Copy All" button presence
		Assert.assertTrue(cp.copyAllButtonElement().isDisplayed());
		
		// Verify "Export" button presence
		Assert.assertTrue(cp.exportButtonElement().isDisplayed());
		
		// Verify "Save" button presence
		Assert.assertTrue(cp.saveButtonElement().isDisplayed());
		}
	
	@AfterClass
	public void driverClosure() {
		driver.close();
	}
}
