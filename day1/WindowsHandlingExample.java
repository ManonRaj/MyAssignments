package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlingExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()=\"OK\"]")).click();
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		Set<String> windowSetHandles = driver.getWindowHandles();
		List<String> windowListHandles = new ArrayList<String>(windowSetHandles);
		driver.switchTo().window(windowListHandles.get(1));
		String secondwindowTitle =driver.getTitle(); 
		System.out.println("Curent Window Title is :" + secondwindowTitle);
		driver.close();
		driver.switchTo().window(windowListHandles.get(0));
		//driver.switchTo().window("firstWindow");
		String parentWindowTitle  = driver.getTitle();
		System.out.println("Parent Window Title is :" + parentWindowTitle);
		
		

	}

}
