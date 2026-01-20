import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchResultElementWaitTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.findElement(By.name("q"))
                .sendKeys("Selenium WebDriver", Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // wait for search results to appear
        WebElement results = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("search"))
        );

        if (results.isDisplayed()) {
            System.out.println("TEST PASSED: Search results are visible");
        }

        driver.quit();
    }
}
