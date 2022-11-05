package week4.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Open url
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String ParentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Title is:" + ParentWindow);

		// 1. Click and Confirm new Window Opens
		WebElement click = driver.findElement(By.xpath("//button[@name=\"j_idt88:new\"]/span"));
		click.click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handles : windowHandles) {
			driver.switchTo().window(handles);
		}
		System.out.println("Child Window Title is:" + windowHandles);
		driver.close();
		driver.switchTo().window(ParentWindow);

		// 2. Find the number of opened tabs

		WebElement OpenMultipleTabs = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt91']/span"));
		OpenMultipleTabs.click();
		Thread.sleep(5000);

		int WindowSize = driver.getWindowHandles().size();
		System.out.println("Number of Windows:" + WindowSize);

		// 3.Close all windows except Primary

		WebElement CloseWindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		CloseWindow.click();
		Thread.sleep(5000);
		Set<String> CloseChildWindows = driver.getWindowHandles();
		for (String openWindows : CloseChildWindows) {
			if (!openWindows.equals(ParentWindow)) {
				driver.switchTo().window(openWindows);
				driver.close();
				System.out.println("Child Window closed");
			}
		}

	}
}
