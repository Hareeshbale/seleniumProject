package Training.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.nykaa.com/?root=logo");
		driver.manage().window().maximize();
		boolean  mouse = driver.findElement(By.xpath("(//a[.='makeup'])[2]")).isDisplayed();
		System.out.println(mouse);

	}

}
