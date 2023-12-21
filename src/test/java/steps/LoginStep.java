package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	RemoteWebDriver driver;
	@Given("the user is on the login page")
	public void theUserIsOnTheLoginPage() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@When("the user enters valid username and password")
	public void theUserEntersValidUsernameAndPassword() {
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("student");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Password123");
	}
	@Then("the user should be logged in successfully")
	public void theUserShouldBeLoggedInSuccessfully() {
	   WebElement submitbtn= driver.findElement(By.className("btn"));
	   submitbtn.click();
	}

}
