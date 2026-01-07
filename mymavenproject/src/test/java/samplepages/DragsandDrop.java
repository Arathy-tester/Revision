package samplepages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DragsandDrop extends BaseInitilisation {
	public void dragDrop()
	{
		//driver.navigate().to("https://demoqa.com/droppable");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement drag = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		//WebElement drop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));

		
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
		 action.clickAndHold(drag)
         .moveToElement(drop)
         .release()
         .build()
         .perform();
		//action.dragAndDrop(drag, drop).build().perform();
	}
	public static void main(String[] args) {
		DragsandDrop dragandDrop=new DragsandDrop();
		//dragandDrop.dragsDrop();
		dragandDrop.initilise();
		dragandDrop.dragDrop();
	}
}
