package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2DeleteLead {

	public static void main(String[] args) {
		/* Delete Lead:
			1	Launch the browser
			2	Enter the username
			3	Enter the password
			4	Click Login
			5	Click crm/sfa link
			6	Click Leads link
			7	Click Find leads
			8	Click on Phone
			9	Enter phone number
			10	Click find leads button
			11	Capture lead ID of First Resulting lead
			12	Click First Resulting lead
			13	Click Delete
			14	Click Find leads
			15	Enter captured lead ID
			16	Click find leads button
			17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			18	Close the browser (Do not log out) */
		WebDriverManager.chromedriver().setup();
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
		WebElement clickCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		clickCRMSFA.click();
		WebElement leadButton = driver.findElement(By.linkText("Leads"));
		leadButton.click();
		WebElement findLeadsButton =driver.findElement(By.linkText("Find Leads"));
		findLeadsButton.click();
		WebElement Phone = driver.findElement(By.xpath("//span[text()=\"Phone\"]"));
		Phone.click();
		WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
		phoneNumber.sendKeys("7654938749");
		WebElement findleads = driver.findElement(By.linkText("Find Leads"));
		findleads.click();
		WebElement firstLeadValue = driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/div/a"));
		//*[@id="ext-gen862"]
		String value = firstLeadValue.getText();
		System.out.println(value);
		firstLeadValue.click(); 	
		WebElement deleteLead = driver.findElement(By.linkText("Delete"));
		deleteLead.click();
		WebElement returnfindelement = driver.findElement(By.linkText("Find Leads"));
		returnfindelement.click();
		//findleads.click();
		WebElement CapturedLeadID = driver.findElement(By.name("id"));
		CapturedLeadID.sendKeys(value);
		WebElement findLeadSubmitButton = driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]"));
		findLeadSubmitButton.click();
		//WebElement NoRecords = driver.findElement(By.xpath("//*[@id=\"ext-gen437\"]"));
		String str = "No records to display";
		//String str1=NoRecords.getAttribute("No records to display");
		if ( driver.getPageSource().contains("No records")){
			System.out.println("Text: " + str + " is present. ");
		}
		else{
			System.out.println("Text: " + str + " is not present. ");
		}

		driver.close();

	}

}
