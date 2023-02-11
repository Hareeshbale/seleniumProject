package Training.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(10000);
		WebElement drop =driver.findElement(By.id("course"));
  Select dropdown = new Select(drop);
  dropdown.selectByIndex(0);
  Thread.sleep(3000);
  dropdown.selectByValue("net");
  Thread.sleep(5000);
  dropdown.selectByVisibleText("Javascript");
  Thread.sleep(5000);
  dropdown.selectByIndex(1);
  Thread.sleep(5000);
  dropdown.deselectByValue("Javascript");

	}

}
