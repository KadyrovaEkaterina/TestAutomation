import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InstagramTest {
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
    public void negativeInstragramTest() throws InterruptedException {
        driver.findElement(By.name("emailOrPhone")).sendKeys("test@example.com");
        driver.findElement(By.name("fullName")).sendKeys("FirstName LastName");
        driver.findElement(By.name("username")).sendKeys("someUsername");
        driver.findElement(By.name("password")).sendKeys("P@sswOrd");
        Assert.assertEquals("Instagram", driver.findElement(By.tagName("h1")).getText());
        driver.findElement(By.className("y3zKF")).click();

    }
}
