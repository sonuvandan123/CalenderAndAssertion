package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssertionExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.id("dropdown-class-example")).click();
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(3000);
	/*	boolean result=driver.findElement(By.id("checkBoxOption1")).isSelected();
		try
		{
			Assert.assertEquals(result,false);
		}
		catch(AssertionError e)
		{
			System.out.println("Expected false but returned true");
		}
	*/	
		String name="vandan";
		Assert.assertEquals("bvsdf",name);
		

	}

}
