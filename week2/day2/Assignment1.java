package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {

		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		//( A normal click will do for this step) 


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//No Such Element Exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement create = driver.findElement(By.linkText("Create New Account"));
		create.click();		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Manon Raj");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Subramanian");
		WebElement mobilenumber = driver.findElement(By.name("reg_email__"));
		mobilenumber.sendKeys("545878545");
		WebElement newPassword = driver.findElement(By.id("password_step_input"));
		newPassword.sendKeys("Happy@2023");
		//Day Dropdown - using Partial Match Xpath
		WebElement day = driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		Select DOBday = new Select(day);
		List<WebElement> alloption = DOBday.getOptions();
		int value = alloption.size();
		DOBday.selectByIndex(value-4);
		//Month Dropdown - Using Attribute based Xpath
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select DOBMonth = new Select(month);
		DOBMonth.selectByValue("6");		
		WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select DOByear = new Select(Year);
		DOByear.selectByVisibleText("1999");
		//Click Radio Button
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		System.out.println("Assignment1 is completed");

	}

}
