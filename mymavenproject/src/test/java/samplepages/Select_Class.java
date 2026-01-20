package samplepages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_Class extends BaseInitilisation {
	public void radiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio=driver.findElement(By.xpath("//form[@id='radio-buttons']//input[@value=\"orange\"]"));
		radio.click();
		boolean value= radio.isSelected();
		System.out.println(value);
		
	}
	public void dropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drpdown=driver.findElement(By.xpath("//select[@id=\"dropdowm-menu-1\"]"));
		Select select=new Select(drpdown);
		select.selectByIndex(2);
	}
	public void unslected()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement unselected=driver.findElement(By.xpath("//form[@id=\"radio-buttons-selected-disabled\"]//input[@value='cabbage']"));
		unselected.click();
		boolean value=unselected.isSelected();
		System.out.println(value);
	}
	public void multiple_checkbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List<WebElement> multi_check=driver.findElements(By.xpath("//div[@id='checkboxes']//input[@type='checkbox']"));
		for(int i=0;i<multi_check.size();i++)
		{
			if (!multi_check.get(i).isSelected()) {
		        multi_check.get(i).click();
		    }
		}
	}
	public static void main(String[] args) {
		Select_Class radio= new Select_Class();
		radio.initilise();
		//radio.radiobutton();
		//radio.dropdown();
		//radio.unslected();
		radio.multiple_checkbox();
	}

}
