package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Automtn {

	public static void main(String[] args) {
		
WebDriver driver=new FirefoxDriver();

driver.get("https://www.amazon.in/");
WebDriverWait wait=new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("red dress",Keys.ENTER);
}
	}
