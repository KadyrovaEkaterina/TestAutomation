import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InstagramXpathTest {
            private WebDriver driver;

        @Before

        public void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.get("https://www.instagram.com/");

        }

        @After
        public void tearDown() {
            driver.quit();
        }

        @Test
        public void negativeInstragramXpathTest() throws InterruptedException {
            driver.findElement(By.xpath("//input[starts-with(@aria-label,'Mobile')]")).sendKeys("test@example.com");
            driver.findElement(By.xpath("//input[contains(@aria-required,'false')]")).sendKeys("FirstName LastName");
            driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("someUsername");
            driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("P@sswOrd");
            Assert.assertEquals("Instagram", driver.findElement(By.xpath("//h1[.='Instagram']")).getText());
            driver.findElement(By.xpath("//button[.='Sign up']")).click();

        }
}

