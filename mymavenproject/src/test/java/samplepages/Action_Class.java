package samplepages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Action_Class extends BaseInitilisation {
	public void dragDrop()
	{
		//driver.navigate().to("https://demoqa.com/droppable");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement drag = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		//WebElement drop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));

		
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
		 //action.clickAndHold(drag)
         //.moveToElement(drop)
        // .release()
         //.build()
         //.perform();
		action.scrollByAmount(0, 500).perform();
		action.dragAndDrop(drag, drop).build().perform();
	}
	
	public void rightclick()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement rclick=driver.findElement(By.xpath("//div[@id='message-one']"));
		Actions action=new Actions(driver);
		action.contextClick().build().perform();
	}
	public void mousehover()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement mhover=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		Actions action=new Actions(driver);
		action.moveToElement(mhover).build().perform();
		mhover.click();
		
	}
	
	public static void main(String[] args) {
		Action_Class dragandDrop=new Action_Class();
		//dragandDrop.dragsDrop();
		dragandDrop.initilise();
		//dragandDrop.dragDrop();
		//dragandDrop.rightclick();
		dragandDrop.mousehover();
	}
}
