package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {

	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElement

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard ')]")
	WebElement DashBoard_Header_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[1]/nav/div/a")
	WebElement DASHBOARD_SIDE_MENU_BUTTON; // extra
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BANK_AND_CASH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NEW_ACCOUNT_ELEMENT;

	// Intractable method

	public void validateDashboardPage() {
		Assert.assertEquals(DashBoard_Header_ELEMENT.getText(), "Dashboard", "Dashboard not found!!");

	} 

	public void clickSideMenu() {
		DASHBOARD_SIDE_MENU_BUTTON.click(); // Extra
	}

	public void clickBankAndCashMenu() {
		BANK_AND_CASH_ELEMENT.click();
	}

	public void clickNewAccount() {
		NEW_ACCOUNT_ELEMENT.click();
	}

}
