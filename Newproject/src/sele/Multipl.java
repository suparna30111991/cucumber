package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Multipl {
@Test
public void multipledropdowntes()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/gp/site-directory?ref_=shopall_btn");
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy (By.xpath("//div[@id=\"nav-shop\"]//span[@class=\"nav-line-2\"]")));
	WebElement we=driver.findElement(By.xpath("//div[@id=\"nav-shop\"]//span[@class=\"nav-line-2\"]"));
	Select set=new Select(we);
	/*Boolean stat=set.isMultiple();
	if(stat)
	{
		for(int i=0;i<8;i++)
		{
			set.selectByIndex(i);
		}
	}else {
		System.out.println("its not a dropdown");
	}set.deselectAll();*/
	set.selectByIndex(3);
	driver.close();
	}
}
