package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Login Page
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		Thread.sleep(5000);
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		WebElement clickCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		clickCRMSFA.click();
		WebElement leadButton = driver.findElement(By.linkText("Leads"));
		leadButton.click();
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		WebElement cmpnyName = driver.findElement(By.id("createLeadForm_companyName"));
		cmpnyName.sendKeys("Tata Consultancy Services");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Manon Raj");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Subramanian");
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Manon");
		WebElement deptField = driver.findElement(By.id("createLeadForm_departmentName"));
		deptField.sendKeys("IT Services");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("This is my first company");
		WebElement emailId = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailId.sendKeys("manon@gmail.com");
		WebElement createButton = driver.findElement(By.name("submitButton"));
		createButton.click();
		WebElement editButton = driver.findElement(By.linkText("Edit"));
		editButton.click();
		WebElement clrdescription = driver.findElement(By.name("description"));
		clrdescription.clear();
		WebElement imnote = driver.findElement(By.name("importantNote"));
		imnote.sendKeys("Creating Lead");
		WebElement updateButton = driver.findElement(By.name("submitButton"));
		updateButton.click();
		System.out.println("Result Page Title is : " + driver.getTitle());










	}

}
