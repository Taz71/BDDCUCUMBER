package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage extends TestBase {
	WebDriver driver;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	// WebElement

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/h5")
	WebElement ADD_NEW_ACCOUNT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement ACCOUNT_DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement INTERNET_BANKING_URL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT_BUTTON_ELEMENT;

	// Intractable method

	public void validateAddNewAccountPage() {
		Assert.assertEquals(ADD_NEW_ACCOUNT_ELEMENT.getText(), "AddNewAccount", "AddNewAccount not found!!");
	}

	public void accountTitle(String title) {
		ACCOUNT_TITLE_ELEMENT.sendKeys(title + generateRandomNumber(999));
	}

	public void description(String description) {
		ACCOUNT_DESCRIPTION_ELEMENT.sendKeys(description);
	}

	public void balance(String balance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(balance);
	}

	public void accountNumber(String account) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(account);
	}

	public void contactPerson(String person) {
		CONTACT_PERSON_ELEMENT.sendKeys(person);
	}

	public void phone(String phone) {
		PHONE_ELEMENT.sendKeys(phone);
	}

	public void internetBanking(String url) {
		INTERNET_BANKING_URL_ELEMENT.sendKeys(url);
	}
	public void submit() {
		SUBMIT_BUTTON_ELEMENT.click();
	}

}
