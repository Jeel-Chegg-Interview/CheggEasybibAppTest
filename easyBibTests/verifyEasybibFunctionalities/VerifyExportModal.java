package verifyEasybibFunctionalities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import initialSettings.BrowserSetting;
import objectRepository.CitationPage;

/**
 * This class tests the opening of Export modal
 * @author Jeel Patel
 * @version 1.0
 *
 */
public class VerifyExportModal {
	BrowserSetting brSet;
	WebDriver driver;

	@BeforeClass
	public void driverInitialization(){

		brSet = new BrowserSetting();
		driver = brSet.BrowserSettings();
	}
	@Test
	public void verifyExportModal() {
		
		CitationPage cp = new CitationPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// Scrolling down to the element
		js.executeScript("arguments[0].scrollIntoView(true);", cp.exportButtonElement());
		
		// Clicking on Export button
		cp.exportButtonElement().click();
		
		// Verify "Export Modal" opened after clicking the "Export" button
		Assert.assertTrue(cp.exportModalElement().isDisplayed());
		}
	
	@AfterClass
	public void driverClosure() {
		driver.close();
	}
}
