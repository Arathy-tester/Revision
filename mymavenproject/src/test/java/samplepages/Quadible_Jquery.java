package samplepages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Quadible_Jquery extends BaseInitilisation{
	public void dropdown() {
		driver.navigate().to("https://selenium.qabible.in/jquery-select.php");
		WebElement dropselect= driver.findElement(By.xpath("(//span[@class='select2-selection__arrow'])[1]"));
		dropselect.click();
		WebElement searchbox=driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]"));
		searchbox.sendKeys("Oregon");
		//searchbox.click();
		searchbox.sendKeys(Keys.ENTER);
		WebElement multiselect=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		multiselect.click();
		WebElement multioption=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']"));
		multioption.sendKeys("Alaska");
		multioption.sendKeys(Keys.ENTER);
		multioption.click();
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 500).perform();
		WebElement multioptions=driver.findElement(By.xpath("(//div[@class=\"card-body\"])[3]"));
		multioptions.click();
		WebElement selectoption=driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]"));
		selectoption.sendKeys("California");
		selectoption.sendKeys(Keys.ENTER);
		
	}
	
	public static void main(String[] args) {
		Quadible_Jquery selectandclass=new Quadible_Jquery();
		selectandclass.initilise();
		selectandclass.dropdown();
	}

}
