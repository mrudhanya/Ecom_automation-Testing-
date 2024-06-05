package mypack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win64\\chromedriver.exe");
    
        WebDriver driver = new ChromeDriver();

        try {
         
            driver.get("https://vegzo.trygo.in/");

            // Maximize the browser window



          
            WebElement loginButton = driver.findElement(By.linkText("Login"));
            loginButton.click();

         
            WebElement mobileNumberField = driver.findElement(By.id("login_mobile_no")); 
            mobileNumberField.sendKeys("7039118641");

      
            WebElement checkbox = driver.findElement(By.id("login_checkbox"));
            checkbox.click();

        
            WebElement requestOtpButton = driver.findElement(By.id("cus-user-login-form-btn")); 
            requestOtpButton.click();
            
            
            String otp = "123456";
            for (int i = 0; i < otp.length(); i++) {
                WebElement otpField = driver.findElement(By.id("login_otp_" + (i + 1)));
                otpField.sendKeys(Character.toString(otp.charAt(i)));
            }
            
        } finally {
        		try {
                Thread.sleep(8000); // Wait for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}