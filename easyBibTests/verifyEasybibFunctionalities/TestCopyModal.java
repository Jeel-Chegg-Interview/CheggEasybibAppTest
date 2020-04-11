package verifyEasybibFunctionalities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import initialSettings.BrowserSetting;
import objectRepository.CitationPage;

public class TestCopyModal {
	BrowserSetting brSet;
	WebDriver driver;

	@BeforeClass
	public void driverInitialization() {

		brSet = new BrowserSetting();
		driver = brSet.BrowserSettings();
	}

	@Test
	public void verifyCitationActionsMenu() {

		CitationPage cp = new CitationPage(driver);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		// Scrolling down to the element
		js.executeScript("arguments[0].scrollIntoView(true);", cp.citationMenuButtonElement());
		
		// Clicking on "Citations Menu" button
		cp.citationMenuButtonElement().click();

		// Clicking on "Copy citation" option
		cp.copyCitationButtonElement().click();
		
		// Verify "Copy Successful Modal" opened after clicking the "Copy citation" option from the menu
		Assert.assertTrue(cp.copySuccessfulModalElement().isDisplayed());
	}

	@AfterClass
	public void driverClosure() {
		driver.close();
	}
}
