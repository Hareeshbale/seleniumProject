package Training.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html?");
		driver.manage().window().maximize();
		WebElement fristname = driver.findElement(By.xpath("//input[@name ='fname']"));
		fristname.sendKeys("Hello selenium");
		fristname.clear();
		 driver.findElement(By.xpath("//input[contains(@name,'vehicle')]")).click();
		
		 driver.close();		
		
	}

}
