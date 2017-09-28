package simple;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/teste/Desktop/chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.navigate().to("https://voegol.com.br/pt/a-gol/imprensa");
	
	driver.quit();
	
	
	}

}
