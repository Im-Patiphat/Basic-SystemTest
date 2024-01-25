import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


class UC01 {

    @Test
    void testChrome() throws  InterruptedException {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.coding-midcareer.com/");
        Thread.sleep(1000);

        driver.findElement(By.className("theme-btn")).click();
        Select dropdown = new Select(driver.findElement(By.id("pre_name_th")));
        WebElement search_name = driver.findElement(By.name("name_th"));
        WebElement search_lastname = driver.findElement(By.name("lastname_th"));
        dropdown.selectByValue("¹ÒÂ");
        search_name.sendKeys("»¯Ô¾Ñ·¸ì");
        search_lastname.sendKeys("ÃÑµâ¹Ê¶");

        WebElement search_nameEN = driver.findElement(By.name("name_en"));
        WebElement search_lastnameEN = driver.findElement(By.name("lastname_en"));
        search_nameEN.sendKeys("Patiphat");
        search_lastnameEN.sendKeys("Rattanosot");

        WebElement search_card = driver.findElement(By.name("id_card"));
        WebElement search_birthday = driver.findElement(By.name("birthday"));
        WebElement search_phone = driver.findElement(By.name("phone"));
        WebElement search_email = driver.findElement(By.name("email"));
        search_card.sendKeys("1729800289811");
        search_birthday.sendKeys("05/09/2546");
        search_phone.sendKeys("0838494680");
        search_email.sendKeys("654259017@webmail.npru.ac.th");

        WebElement ageInput = driver.findElement(By.id("age"));
        String ageValue = ageInput.getAttribute("value");
        
        System.out.println("ÍÒÂØ : "+ageValue);
        
        if (ageValue.equals(21)) {
            System.out.println("Age verification successful!");
        } else {
            System.out.println("Age verification failed!");
        }
       
        Thread.sleep(5000);

        driver.quit();
    }

   
}
