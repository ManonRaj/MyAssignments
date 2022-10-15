package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Confirm if the button is disabled. 
		WebElement disablebutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt92\"]"));
		boolean isdisable = disablebutton.isEnabled();
		System.out.println("Button Disable :" + " " + isdisable);
		//Find the position of the Submit button
	    WebElement	buttonposition = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
	    Point xyPoint = buttonposition.getLocation();
	    int xvalue=xyPoint.getX();
	    int yvalue=xyPoint.getY();
	    System.out.println("X Value is :"+xvalue+" "+"Y Value is :"+yvalue);
	    //Find the Save button color
	    WebElement	ButtonColor = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]"));
	    String color=ButtonColor.getCssValue("background");
	    System.out.println("Save Button Color is :"+""+color);
	    //Find the height and width of this button
	    WebElement ButtonSize = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		int Height = ButtonSize.getSize().getHeight();
		int Width = ButtonSize.getSize().getWidth();
		System.out.println("Button Hieght is :"+Height+" "+"Buttton Width is "+""+Width);
		//Mouse over and confirm the color changed
		Actions e = new Actions(driver);
		WebElement buttonHome = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span"));
		String BeforehoverButtoncolor = buttonHome.getCssValue("background-color");
		System.out.println("Before Mouse Hover Button color is :" + " " + BeforehoverButtoncolor);

		e.moveToElement(buttonHome).build().perform();
		String AfterhoverButtoncolor = buttonHome.getCssValue("background-color");
		System.out.println("Before Mouse Hover Button color is :" + " " + AfterhoverButtoncolor);
		//Click Image Button and Click on any hidden button
		Actions clickImage = new Actions(driver);
		WebElement ButtonSuccess = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span"));
		clickImage.moveToElement(ButtonSuccess).click();
		

		
		//*[@id="j_idt88:j_idt102:imageBtn"]/span
	    
	  

	}

}
