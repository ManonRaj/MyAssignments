package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3InputComponents {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter Name
		WebElement Typename = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		Typename.sendKeys("Manon Raj Subramanian");
		//Append Country to the City
		WebElement ApendCountry = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		ApendCountry.sendKeys("India");
		//Check whether the testbox is disabled or not
		WebElement DisabledTextBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		System.out.println("Text Box is Disabled :"+DisabledTextBox.isEnabled());
		//Clear the content
		WebElement ClearContent = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		ClearContent.clear();		
		//Retrieve the typed text
		WebElement Retrievecontent = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		System.out.println("Typed Text is :" + Retrievecontent.getAttribute("Value"));		
		//Type about yourself
		WebElement TypeDescription = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]"));
		TypeDescription.sendKeys("Working in TCS since 2020. I have overall 2.5 years of experience in testing as SQA");	
		//TextEditor - Bold
		WebElement TextBold = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_toolbar\"]/span[2]/button[1]"));
		TextBold.click();		
		WebElement EnterTextBold = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]/p"));
		EnterTextBold.sendKeys("Manon Raj Subramanian");
		System.out.println();
		//TextEditor - Italic
		WebElement TextItalic = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_toolbar\"]/span[2]/button[2]"));
		TextItalic.click();		
		WebElement EnterTextItalic = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]/p"));
		EnterTextItalic.sendKeys("Manon Raj Subramanian");
		System.out.println();
		//TextEditor - Underline
		WebElement TextUnderline = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_toolbar\"]/span[2]/button[2]"));
		TextUnderline.click();		
		WebElement EnterTextUnderline = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]/p"));
		EnterTextUnderline.sendKeys("Manon Raj Subramanian");
		System.out.println();
		//Click and confirm label position changes - Button Position before click
		WebElement LabelPosition = driver.findElement(By.xpath("//*[@id=\"j_idt106:float-input\"]"));
		int Beforeheight = LabelPosition.getLocation().getX();
		int Beforewidth = LabelPosition.getLocation().getY();
		System.out.println("Before Click Button Hieght is :"+Beforeheight+"Buttton Width is "+""+Beforewidth);
		LabelPosition.click();
		//Click and confirm label position changes - Button Position After click
		WebElement LabelPosition1 = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt113\"]"));
		int Afterheight = LabelPosition1.getLocation().getX();
		int Afterwidth = LabelPosition1.getLocation().getY();
		System.out.println("Before Click Button Hieght is :"+Afterheight+"/n"+"Buttton Width is "+""+Afterwidth);
		//EnterName and select third option
		WebElement EnterName = driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_input\"]"));
		EnterName.sendKeys("Manon");
		WebElement ClickThirdName = driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li[3]"));
		ClickThirdName.click();
		//Select DOB
		WebElement ConfirmDOB = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt116_input\"]"));
		ConfirmDOB.sendKeys("06261999");
		//Press enter and confirm error message
		WebElement ConfirmError = driver.findElement(By.xpath("//*[@id=\"j_idt106:thisform:age\"]"));
		ConfirmError.sendKeys(Keys.ENTER);
		


	}

}
