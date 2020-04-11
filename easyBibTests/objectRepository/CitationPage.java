package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CitationPage {
	WebDriver driver;

	@FindBy(xpath = "//*[@data-test-id='copy-all-btn']")
	WebElement copyAllButton;

	@FindBy(xpath = "//*[@data-test-id='export-btn']")
	WebElement exportButton;
	
	@FindBy(xpath = "//*[@data-test-id='save-btn']")
	WebElement saveButton;
	
	@FindBy(xpath = "//div[contains(@class,'sc-frDJqD')]")
	WebElement exportModal;
	
	@FindBy(xpath = "//button[@data-test-id='citations-more-menu']")
	WebElement citationMenuButton;
	
	@FindBy(xpath = "//div[contains(@class,'sc-cmjSyW')]")
	WebElement citationActionsMenu;
	
	@FindBy(xpath = "//div[@data-test-id='dropdown-copy-citation']")
	WebElement copyCitationButton;
	
	@FindBy(xpath = "//div[contains(@class,'sc-fOICqy')]//child::div[text()='Citation copied']")
	WebElement copySuccessfulModal;
	
	// Constructor to initialize driver and load web element using PageFactory
	public CitationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement copyAllButtonElement() {
		return copyAllButton;
	}

	public WebElement exportButtonElement() {
		return exportButton;
	}

	public WebElement saveButtonElement() {
		return saveButton;
	}
	
	public WebElement exportModalElement() {
		return exportModal;
	}
	
	public WebElement citationMenuButtonElement() {
		return citationMenuButton;
	}
	
	public WebElement citationActionsMenuElement() {
		return citationActionsMenu;
	}
	
	public WebElement copyCitationButtonElement() {
		return copyCitationButton;
	}
	
	public WebElement copySuccessfulModalElement() {
		return copySuccessfulModal;
	}
}
