package samplepages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts extends BaseInitilisation{
	
	public void simpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement s_Alert=driver.findElement(By.xpath("//button[@id='alertButton']"));
		s_Alert.click();
		Alert alert_ref= driver.switchTo().alert();
		alert_ref.accept();
		//driver.close();
	
	}
	public void simpleTimeAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 500).perform();
		WebElement s_Alert=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		s_Alert.click();
		WebDriverWait  wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert_ref1= driver.switchTo().alert();
		alert_ref1.accept();
		//driver.close();
	
	}
	public void confirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 500).perform();
		WebElement confirm_alert=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirm_alert.click();
		Alert alert_ref=driver.switchTo().alert();
		alert_ref.dismiss();
	}
	public void promptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 500).perform();
		WebElement prompt_alert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		prompt_alert.click();
		Alert alert_ref=driver.switchTo().alert();
		alert_ref.sendKeys("Arathy");
		alert_ref.accept();
		
	}
	public static void main(String[] args) {
		Alerts alert= new Alerts();
		alert.initilise();
		//alert.simpleAlert();
		//alert.simpleTimeAlert();
		//alert.confirmAlert();
		alert.promptAlert();
}
}
