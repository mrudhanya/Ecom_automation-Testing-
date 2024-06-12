package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Navigate to the homepage
            driver.get("https://vegzo.trygo.in/");
            System.out.println("Navigated to the homepage");

            // Step 2: Wait until the homepage is fully loaded
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cus_site_header")));
            System.out.println("Homepage is loaded properly");

            // Step 3: Enter a search query in the search bar
            WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/div[1]/section/div[1]/input"));
            searchBar.sendKeys("papaya");
            System.out.println("Entered search query: papaya");

            // Step 4: Click on the search button
            searchBar.sendKeys(Keys.ENTER);
            System.out.println("Pressed Enter to perform the search");

            // Verify search results are displayed (dummy verification)
            // Replace with actual verification logic as needed
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'product-listing')]")));
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                Thread.sleep(5000); // Wait for 5 seconds to see the result
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
            System.out.println("Closed the browser");
        }
    }
}