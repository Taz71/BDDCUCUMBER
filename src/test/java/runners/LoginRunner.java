package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "src\\test\\resources\\features\\TechfiosLogin.feature",
//		features = "src\\test\\resources\\features",
//		features = "classpath:features",
		features = "src\\test\\resource\\features\\Account",
		glue = "steps",
//		tags = "@Regression",
		monochrome = true,
		dryRun = false,
		plugin = {
				"pretty",
				"html:target/reports/cucumber.html",
				"json:target/reports/cucumber.json"
		})

public class LoginRunner {

}
