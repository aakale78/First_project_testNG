package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base 
{
    public static WebDriver driver;
	
	public void setup()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	    
	}
	
	public void openurl(String url)
	{
		driver.get(url);
	}
	
	public void teardown()
	{
		driver.quit();
	}

}
