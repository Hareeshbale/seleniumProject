package Training.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.nykaa.com/?root=logo");
		driver.manage().window().maximize();
		boolean  mouse = driver.findElement(By.xpath("(//a[.='makeup'])[2]")).isDisplayed();
	WebElement hovering = driver.findElement(By.xpath("(//a[.='skin'])[2]"));
	Actions act = new Actions(driver);
	act.moveToElement(hovering).click().perform();
	driver.close();
			

	}

}

