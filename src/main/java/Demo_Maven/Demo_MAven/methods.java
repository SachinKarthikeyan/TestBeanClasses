package Demo_Maven.Demo_MAven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class methods {
	protected static WebDriver driver;
	//Driver Location
	protected static final String Chromed = "D:\\projects\\seleniumTest\\drivers\\chromedriver.exe"; 
	protected static final String Edged = "D:\\projects\\seleniumTest\\drivers\\msedgedriver.exe";
	protected static final String Foxed = "D:\\projects\\seleniumTest\\drivers\\geckodriver.exe";
	//Site Address
	protected static final String address = "https://sachinkarthikeyan.github.io";
	// Browser Methods
	protected static void Chrome() {
		System.setProperty("webdriver.chrome.driver", Chromed);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(address);
	}

	protected static void Edge() {
		System.setProperty("webdriver.edge.driver",Edged);
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(address);
	}

	protected static void FireFox() {
		System.setProperty("webdriver.firefox.marionette",Foxed);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(address);
	}
	//Input methods
	protected static void input(String locator, String text) {
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}

	protected static void click(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	//Selecting methods
	protected static void selectT(String locator, String text) {
		Select temp = new Select(driver.findElement(By.xpath(locator)));
		temp.selectByVisibleText(text);
	}

	protected static void deselectT(String locator, String text) {
		Select temp = new Select(driver.findElement(By.xpath(locator)));
		temp.deselectByVisibleText(text);
	}

	protected static void selectI(String locator, int index) {
		Select temp = new Select(driver.findElement(By.xpath(locator)));
		temp.selectByIndex(index);
	}

	protected static void deselectI(String locator, int index) {
		Select temp = new Select(driver.findElement(By.xpath(locator)));
		temp.deselectByIndex(index);
	}

}
