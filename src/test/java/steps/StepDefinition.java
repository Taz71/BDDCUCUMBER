package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.DashBoardPage;
import pages.LoginPage;
import pages.NewAccountPage;
import pages.TestBase;

public class StepDefinition extends TestBase {
	
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	NewAccountPage newAccountPage;

	@Before
	public void beforeRun() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashBoardPage = PageFactory.initElements(driver, DashBoardPage.class);
		newAccountPage = PageFactory.initElements(driver,NewAccountPage.class);
	}
	@Given("User is on the Techfios login page")
	public void user_is_on_the_Techfios_login_page() {
		driver.get("http://www.techfios.com/billing/?ng=admin/");
	}

	@After
	public void afterRun() {
		tearDown();
	}
}
