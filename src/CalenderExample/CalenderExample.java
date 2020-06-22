package CalenderExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderExample 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		int size=driver.findElements(By.cssSelector("a[class='ui-state-default']")).size();
		
		/*
		 * while(!driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")
		 * ) .getText().contains("August")) { driver.findElement(By.
		 * cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")) .click(); }
		 */	

		for (int i=0;i<size;i++) { if(
		  driver.findElements(By.cssSelector("a[class='ui-state-default']")).
		  get(i).getText().contains("23")) {
		  driver.findElements(By.cssSelector("a[class='ui-state-default']")).
		  get(i).click(); break; } }
		 
		
	}
}
