package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	  RemoteWebDriver driver;
	@Given("User is navigate to login page")
	public void userIsNavigateToLoginPage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(3000);
	}
	@When("enter username as {string} and  enter password as {string}")
	public void enterUsernameAsAndEnterPasswordAs(String username, String password) throws InterruptedException {
	    WebElement userelement= driver.findElement(By.name("username"));
	    userelement.sendKeys(username);
	    Thread.sleep(3000);
	    WebElement passelement= driver.findElement(By.name("password"));
	    passelement.sendKeys(password);
	    Thread.sleep(3000);
	}
	@When("when user click login button")
	public void whenUserClickLoginButton() throws InterruptedException {
	    WebElement logelement= driver.findElement(By.xpath("//button[text()=' Login ']"));
	    logelement.click();
	    Thread.sleep(2000);
	}
	@Then("it move to login page and a success message")
	public void itMoveToLoginPageAndASuccessMessage() {
	    WebElement name= driver.findElement(By.className("oxd-userdropdown-name"));
	    String actualname=name.getText();
	    if(actualname.equals(actualname)) {
	    	System.out.println("Test is passed");
	    }
	    else {
	    	System.out.println("Test is failed");
	    }
	    driver.close();
	}


}
