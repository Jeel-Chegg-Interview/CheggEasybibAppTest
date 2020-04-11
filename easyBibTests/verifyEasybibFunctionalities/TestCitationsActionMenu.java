package verifyEasybibFunctionalities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import initialSettings.BrowserSetting;
import objectRepository.CitationPage;

public class TestCitationsActionMenu {
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

		// Clicking on Citations Menu button
		cp.citationMenuButtonElement().click();

		// Verify "Citation Actions Menu" opened after clicking the "Citations Menu" button
		Assert.assertTrue(cp.citationActionsMenuElement().isDisplayed());
	}

	@AfterClass
	public void driverClosure() {
		driver.close();
	}
}
