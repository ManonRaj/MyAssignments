package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2EditLead {

	public static void main(String[] args) {
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out) */
		WebDriverManager.chromedriver().setup();
		//Login Page
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");		
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		//Click CRMSFA
		WebElement clickCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		clickCRMSFA.click();
		//Click on Leads Button
		WebElement leadButton = driver.findElement(By.linkText("Leads"));
		leadButton.click();
		WebElement findLeadsButton =driver.findElement(By.linkText("Find Leads"));
		findLeadsButton.click();
		WebElement firstLead = driver.findElement(By.linkText("Karthikeyan Solarajan (sa…"));
		firstLead.click();
		System.out.println("Title of the page is :" + driver.getTitle());
		WebElement editlead = driver.findElement(By.linkText("Edit"));
		editlead.click();
	
		WebElement cmpnyName = driver.findElement(By.xpath("//*[@id=\"updateLeadForm_companyName\"]"));
		//cmpnyName.clear();
		cmpnyName.sendKeys("TCS");
		WebElement updateButton = driver.findElement(By.name("submitButton"));
		updateButton.click();
		//WebElement updateName = driver.findElement(By.xpath("//*[@id=\"ext-gen598\"]"));
		//Boolean isPresent = driver.findElements(By.xpath("//*[@id=\"viewLead_companyName_sp\"]")).size() > 0;
		//System.out.println("Company Name is updated :"+isPresent);
		boolean value = driver.findElement(By.xpath("//*[@id=\"viewLead_companyName_sp\"]")).isDisplayed();
		System.out.println("Company Name is Displayed :" + value);
		driver.close();

	}

}
