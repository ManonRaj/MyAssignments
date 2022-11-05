package week4.day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesfirceCustomerService {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Launch Salesforce url
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Login with given username and password
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#1234");
		driver.findElement(By.id("Login")).click();

		String parentwindow = driver.getWindowHandle();

		// Click on the Learn more option in mobile publisher
		driver.findElement(By.xpath("//*[@id=\"setupHomeCarousel_page1\"]/article[2]/div[2]/div[3]/button/span[1]"))
				.click();

		// Switch to the next window using Windowhandles

		Set<String> windowHandles = driver.getWindowHandles();
		for (String handles : windowHandles) {
			driver.switchTo().window(handles);
		}

		// Click on the confirm button in the redirecting page
		driver.findElement(By.xpath("/html/body/div/button[2]")).click();
		Thread.sleep(5000);

		// Get the title

		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);

		// Back to the parent window

		driver.switchTo().window(parentwindow);

		// Close the browser
		driver.close();

	}

}
