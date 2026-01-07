
package samplepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseInitilisation
{
	
	public WebDriver driver;

	public static void main(String[] args) {
		BaseInitilisation base= new BaseInitilisation();
		base.initilise();

	}
	public void initilise() {
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		//WebElement login= driver.findElement(By.xpath("//span[text()='Login']"));
		//login.click();
		//WebElement enter= driver.findElement(By.xpath("//input[@class='c3Bd2c yXUQVt']"));
		//enter.sendKeys("arathy.us1@gmail.com");
		//WebElement enterclick= driver.findElement(By.xpath("//button[@class='dSM5Ub Kv3ekh KcXDCU']"));
		//enterclick.click();
	}

}
