import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.javafx.iio.ImageStorage;

public class TestInstructions {

	public static void main(String[] args) {
		// test case setup
		String testCase = "TestCase1,1990,HST WC/PC First Light Image,186.00";
		String[] testCaseArray = testCase.split(",");
		String imagesNum = "Images from " + testCaseArray[1];
		
		// load the webpage
		System.setProperty("webdriver.chrome.driver", "drivers/Chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.softslate.com/demo/page/welcome");
		
		WebElement element = driver.findElement(By.linkText("Images by Year"));
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action mouse = builder.moveToElement(element).click().build();
		mouse.perform();
		WebElement element2 = driver.findElement(By.linkText("Images from 1990"));
		Actions builder2 = new Actions(driver);
		org.openqa.selenium.interactions.Action mouse2 = builder2.moveToElement(element2).click().build();
		mouse2.perform();

	}

}
