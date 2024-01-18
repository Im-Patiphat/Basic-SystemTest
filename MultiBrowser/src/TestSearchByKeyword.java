import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class TestSearchByKeyword {

	@Test
	void testChorme() {
		 WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        
	        WebElement search_box = driver.findElement(By.name("q"));
	        search_box.sendKeys("NPRU");
	        search_box.sendKeys(Keys.ENTER);
	        
	        String title = driver.getTitle();
	        //System.out.println("result : " +title);
	        //assertEquals("Google",title);
	        driver.close();
	}
	
	@Test
	void testFirefox() {
		 WebDriver driver = null;
	        System.setProperty("webdriver.gecko.driver", "D:\\webdriver\\chromedriver-win64\\geckodriver.exe");
	        driver = new FirefoxDriver();
	        driver.get("https://www.google.com/?hl=th");
	        
	        WebElement search_box = driver.findElement(By.name("q"));
	        search_box.sendKeys("NPRU");
	        search_box.sendKeys(Keys.ENTER);
	        
	        String title = driver.getTitle();
	        //System.out.println("result : " +title);
	        assertEquals("Google",title);

	        driver.close();
	}
	
	@Test
	void testEdge() {
		WebDriver driver = null;
	       System.setProperty("webdriver.edge.driver", "D:\\webdriver\\chromedriver-win64\\msedgedriver.exe");
	       driver = new EdgeDriver();
	       driver.get("https://www.google.com/");
	        
	       WebElement search_box = driver.findElement(By.name("q"));
	       search_box.sendKeys("NPRU");
	       search_box.sendKeys(Keys.ENTER);
	        
	       String title = driver.getTitle();
	       System.out.println("result : " +title);
	       assertEquals("NPRU - ค้นหาด้วย Google",title);

	       driver.close();
	}
}