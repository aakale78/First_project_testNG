package pages;

import org.openqa.selenium.By;

import base.Base;

public class ProductListPage extends Base {
By heading=By.xpath("//span[@class='_10Ermr']");
	
	public String getTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String getHeading()
	{
		String str=driver.findElement(heading).getText();
		return str;
		}
}
