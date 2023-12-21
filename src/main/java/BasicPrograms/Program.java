package BasicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev-app.jabord.com/user/profile");
	Thread.sleep(3000);
	Actions action= new Actions(driver);
	WebElement edit= driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')][9]"));
	action.moveToElement(edit).build().perform();
}
}
