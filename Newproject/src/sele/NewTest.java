package sele;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {

	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.in/");
	  WebElement wb =driver.findElement(By.xpath("//span[@class=\"nav-sprite nav-logo-base\"]"));
	  String actual=wb.getAttribute("Mobile Prepaid Recharges");
	  //String expectation="Amazon";
	  System.out.println("the result is");
	  Assert.assertEquals("amazon.in", "amazon.in");
	  System.out.println("title is "+actual);
	  System.out.println("title is "+driver.getTitle());
	List l= driver.findElements(By.xpath("//a"));
	for(Object obj:l)
	{
		  System.out.println(obj.toString());
	}
	  driver.close();
	  
	  
  }
  
  
}
