import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSubmitTest{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q"))
                .sendKeys("Selenium WebDriver", Keys.ENTER);

        Thread.sleep(10000); // wait 10 seconds to view results

        driver.quit();
    }
}
