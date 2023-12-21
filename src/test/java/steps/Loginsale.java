package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsale {
	RemoteWebDriver driver;
	@Given("User is on login page")
  public void Userisonloginpage() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://login.salesforce.com/");
	}
	@Given("enter userid as {string}")
	public void enterUseridAs(String string) {
	  WebElement user= driver.findElement(By.xpath("//input[@id='username'][8]"));
	  user.sendKeys("dsandhini@gmail.com");
	}
	@Given("enter password as {string}")
	public void enterPasswordAs(String string) {
	    WebElement pass= driver.findElement(By.xpath("//input[@id='password'][3]"));
	    pass.sendKeys("malar@03");
	}
	@When("i click submit button")
	public void iClickSubmitButton() {
         WebElement button= driver.findElement(By.xpath("//input[@id='Login'][46]"));
         button.click();
	}
	@Then("it move home page and it show login successfully")
	public void itMoveHomePageAndItShowLoginSuccessfully() {
	    
	}

	
	
}

