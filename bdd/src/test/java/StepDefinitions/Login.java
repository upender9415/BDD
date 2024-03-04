package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
	WebDriver driver;

	@Given("user navigates to the website javatpoint.com")
	public void user_navigates_to_the_website_javatpoint_com() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.javatpoint.com/");
	}
	@And("there user logs in through Login Window by using Username as {string} and Password as {string}")
	public void there_user_logs_in_through_login_window_by_using_username_as_and_password_as(String string, String string2) {
		 String S=driver.getTitle();
		 System.out.println(S);
	}
	@Then("login must be successful.")
	public void login_must_be_successful() {
		 driver.quit();
	}

	
	
}
