package sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Multipldropdown {
@Test
public void dropdown()
{
	WebDriver driver=new FirefoxDriver();
	FluentWait wait=new FluentWait(driver);
	driver.get("https://www.amazon.in/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=mobile");
	wait.pollingEvery(4, TimeUnit.SECONDS);
	wait.withTimeout(20, TimeUnit.SECONDS);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("pdagDesktopSparkleDescription1")));
	driver.findElement(By.id("pdagDesktopSparkleDescription1")).click();
	Actions act=new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN);
	driver.close();
	}
}
