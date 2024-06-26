package mypack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExeLoginPageTest {
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win64\\chromedriver.exe");
    
        WebDriver driver = new ChromeDriver();

        try {
         
            driver.get("https://vegzo.trygo.in/");

            System.out.println("Opened website");

            WebElement loginButton = driver.findElement(By.linkText("Login"));
            loginButton.click();

            System.out.println("Clicked Login button");

            WebElement mobileNumberField = driver.findElement(By.id("login_mobile_no")); 
            mobileNumberField.sendKeys("7039118641");

            System.out.println("Entered mobile number");

            WebElement checkbox = driver.findElement(By.id("login_checkbox"));
            checkbox.click();

            System.out.println("Clicked checkbox");

            WebElement requestOtpButton = driver.findElement(By.id("cus-user-login-form-btn")); 
            requestOtpButton.click();
            
            System.out.println("Clicked Request OTP button");
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait until the OTP form is visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cus-form-otp-field-area\"]")));

            System.out.println("OTP form is visible");

            // Locate the OTP input boxes
            WebElement otpBox1 = driver.findElement(By.id("login_otp_1"));
            WebElement otpBox2 = driver.findElement(By.id("login_otp_2"));
            WebElement otpBox3 = driver.findElement(By.id("login_otp_3"));
            WebElement otpBox4 = driver.findElement(By.id("login_otp_4"));
            WebElement otpBox5 = driver.findElement(By.id("login_otp_5"));
            WebElement otpBox6 = driver.findElement(By.id("login_otp_6"));

            // Enter the OTP (replace "1", "2", "3", "4", "5", "6" with actual OTP digits)
            otpBox1.sendKeys("1");
            otpBox2.sendKeys("2");
            otpBox3.sendKeys("3");
            otpBox4.sendKeys("4");
            otpBox5.sendKeys("5");
            otpBox6.sendKeys("6");
            System.out.println("Entered OTP");
            
            Thread.sleep(2000);

            // Submit the OTP form
            WebElement submitButton = driver.findElement(By.id("cus-user-login-form-btn"));
            submitButton.click();
            System.out.println("Clicked Submit button");
            
            Thread.sleep(2000);
            
            // Assuming there is some success message element, wait until it's visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='success-message']")));
            System.out.println("Successfully logged in");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Test completed and browser closed");
        }
    }

}

