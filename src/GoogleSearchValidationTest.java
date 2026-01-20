import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchValidationTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        driver.findElement(By.name("q"))
                .sendKeys("Selenium WebDriver", Keys.ENTER);

        // wait so results load properly
        Thread.sleep(1000000);

        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Selenium WebDriver")) {
            System.out.println("TEST PASSED: Title validated");
        } else {
            System.out.println("TEST FAILED: Title not as expected");
            System.out.println("Actual title is: " + actualTitle);
        }

        driver.quit();
    }
}
