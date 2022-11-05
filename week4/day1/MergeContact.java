package week4.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 2. Enter UserName and Password Using Id Locator
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("demosalesmanager");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.xpath("//*[@id=\"login\"]/p[3]/input")).click();

		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// * 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		// driver.switchTo().window(Window1.get(3));

		// 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()=\"Merge Contacts\"]")).click();

		String parentWindow = driver.getWindowHandle();
		System.out.println("Current window title is:" + parentWindow);

		// 7. Click on Widget of From Contact
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/form/table/tbody/tr[1]/td[2]/a")).click();
		Set<String> firstWindowHandles = driver.getWindowHandles();
		for (String handles : firstWindowHandles) {
			driver.switchTo().window(handles);
		}

		// 8. Click on First Resulting Contact
		driver.findElement(By.xpath("//table/tbody/tr/td/div/a")).click();
		driver.switchTo().window(parentWindow);

		// 9. Click on Widget of To Contact
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/a")).click();
		Set<String> secondWindowHandles = driver.getWindowHandles();
		for (String handles : secondWindowHandles) {
			driver.switchTo().window(handles);
		}

		// 10. Click on First Resulting Contact
		driver.findElement(By.xpath("//table/tbody/tr/td/div/a")).click();
		driver.switchTo().window(parentWindow);

		// 11. Click on Merge button using Xpath Locator
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
		String Title = driver.getTitle();
		System.out.println("Page Title is :" + Title);

	}

}
