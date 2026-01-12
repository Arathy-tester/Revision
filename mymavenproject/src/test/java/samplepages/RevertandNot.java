package samplepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RevertandNot extends BaseInitilisation {
	
	public void willRevert()
	{
		WebElement revertDrag=driver.findElement(By.xpath("//a[@id='droppableExample-tab-revertable']"));
		revertDrag.click();
		WebElement revert=driver.findElement(By.xpath("//div[@id='revertable']"));
		//WebElement revert= driver.findElement(By.xpath("//div[@id=\"revertable\"]"));
		WebElement drop=driver.findElement(By.xpath("(//div[@id='droppable'])[3]"));
		Actions action= new Actions(driver);
		action.scrollByAmount(0, 500).build().perform();
		action.dragAndDrop(revert, drop).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevertandNot revertNot= new RevertandNot();
		revertNot.initilise();
		revertNot.willRevert();

	}

}
