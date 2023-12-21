package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bookcart {
	RemoteWebDriver driver;
	int count;
	@Given("I want to Login")
	public void iWantToLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://bookcart.azurewebsites.net/login");
	    Thread.sleep(3000);
	}

	
	@When("I want to enter user and pass")
	public void iWantToEnterUserAndPass() throws InterruptedException {
	    WebElement user= driver.findElement(By.id("mat-input-0"));
	    user.sendKeys("ortoni");
	    Thread.sleep(3000);
	    WebElement pass= driver.findElement(By.id("mat-input-1"));
	    pass.sendKeys("Pass1234");
	    Thread.sleep(3000);
	}
	@Then("I validate logged success")
	public void iValidateLoggedSuccess() throws InterruptedException {
         WebElement button= driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']"));
         button.click();
        
         WebElement cartindex= driver.findElement(By.id("mat-badge-content-0"));
         System.out.println(cartindex.getText());
         count= Integer.valueOf(cartindex.getText());


         Thread.sleep(3000);
         WebElement search= driver.findElement(By.cssSelector("input[placeholder='Search books or authors']"));
         search.sendKeys("Red Rising");
         Thread.sleep(3000);
         WebElement show= driver.findElement(By.xpath("//span[contains(@class,'mat-option-text')]"));
         show.click();
         WebElement add= driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-raised-button mat-button-base mat-primary')]"));
         add.click();
         Thread.sleep(3000);
         int addcount= Integer.valueOf(cartindex.getText());
         System.out.println(cartindex.getText());
         if(addcount>count) {
        	 System.out.println("passed");
         }
         else {
        	 System.out.println("failed");
         }
         
	}
}
