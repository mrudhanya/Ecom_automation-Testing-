package mypack

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver (ChromeDriver in this case)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode if you do not need a browser UI
        driver = new ChromeDriver(options);
        
        // Initialize WebDriverWait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void loginTest() {
        try {
            // Navigate to the login page
            driver.get("https://vegzo.trygo.in/panel/admin/login");

            // Locate the username field and enter the username
            WebElement usernameField = driver.findElement(By.name("username"));
            usernameField.sendKeys("9082737832");

            // Locate the password field and enter the password
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("Password");

            // Locate the login button and click it
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

            // Wait for some time to let the login process complete
            wait.until(ExpectedConditions.urlToBe("https://vegzo.trygo.in/panel/admin/"));

            // Verify if login was successful
            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals(currentUrl, "https://vegzo.trygo.in/panel/admin/", "Login test failed.");
            System.out.println("Login test passed.");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Exception occurred during login test: " + e.getMessage());
        }
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
