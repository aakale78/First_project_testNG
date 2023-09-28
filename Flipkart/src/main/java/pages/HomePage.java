package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import base.Base;

public class HomePage extends Base {
	
By searchtextbox=By.name("q");
	
	public void search(String input1)
	{
		driver.findElement(searchtextbox).sendKeys(input1);
		driver.findElement(searchtextbox).sendKeys(Keys.ENTER);
	}

}
