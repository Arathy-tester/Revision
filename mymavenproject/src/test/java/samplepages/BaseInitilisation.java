
package samplepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseInitilisation
{
	
	public WebDriver driver;

	public static void main(String[] args) {
		BaseInitilisation base= new BaseInitilisation();
		base.initilise();
		//base.dragsandDrops();
	}
	public void initilise() {
		driver= new ChromeDriver();
		//driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		//WebElement login= driver.findElement(By.xpath("//span[text()='Login']"));
		//login.click();
		//WebElement enter= driver.findElement(By.xpath("//input[@class='c3Bd2c yXUQVt']"));
		//enter.sendKeys("arathy.us1@gmail.com");
		//WebElement enterclick= driver.findElement(By.xpath("//button[@class='dSM5Ub Kv3ekh KcXDCU']"));
		//enterclick.click();
	}
	public void dragsandDrops() {
		
		WebElement nextDrag= driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
		nextDrag.click();
		WebElement drag= driver.findElement(By.xpath("//div[@id='acceptable']"));
		WebElement drop= driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
		Actions action= new Actions(driver);
		 //action.clickAndHold(drag)
         //.moveToElement(drop)
        // .release()
         //.build()
         //.perform();
		action.scrollByAmount(0, 500).perform();
		action.dragAndDrop(drag, drop).build().perform();
	}

}
