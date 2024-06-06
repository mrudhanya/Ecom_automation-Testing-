package mypack;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class locatefooter {

    public static void main(String[] args) {
        
    	 System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("https://vegzo.trygo.in/");
            driver.manage().window().maximize();
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Function to scroll to footer
            Runnable scrollToFooter = () -> js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

            // Function to click the header home image
            Runnable clickheaderLogo = () -> {
            	 WebElement headerLogo = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/a/img"));
                 headerLogo.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/footer/section[1]")));
            };
            Thread.sleep(3000);
            // Scroll to footer
            scrollToFooter.run();
            Thread.sleep(3000);

          

            // Locate and click "Orgatma" in Category, wait for 2 seconds
            WebElement Category = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[2]/h6"));
            System.out.println("Category"+ Category);
            WebElement orgatma = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[2]/ul/li[1]/a"));
            orgatma.click();
            Thread.sleep(3000);
            clickheaderLogo.run();
            scrollToFooter.run();
            Thread.sleep(3000);
            
            // Locate and click "Leafy Vegetables" in Category, wait for 2 seconds
            WebElement leafyVegetables = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[2]/ul/li[2]/a"));
            leafyVegetables.click();
            Thread.sleep(3000);;
            clickheaderLogo.run();
            scrollToFooter.run();
            Thread.sleep(3000); 
            
            // Locate and click "Fruits" in Category, wait for 2 seconds
            WebElement fruits = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[2]/ul/li[3]/a"));
            fruits.click();
            Thread.sleep(3000);
            clickheaderLogo.run();
            scrollToFooter.run();
            Thread.sleep(3000);
            

            // Locate and click "Terms & Conditions" in Links, wait for 2 seconds
            WebElement Links = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[3]/h6"));
            System.out.println("Links"+ Links);
            WebElement termsConditions = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[3]/ul/li[1]/a"));
            termsConditions.click();
            Thread.sleep(3000);
            clickheaderLogo.run();
            scrollToFooter.run();
            Thread.sleep(3000);
            

            // Locate and click "Privacy" in Links, wait for 2 seconds
            WebElement privacy = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[3]/ul/li[2]/a"));
            privacy.click();
            Thread.sleep(3000);
            clickheaderLogo.run();
            scrollToFooter.run();
            Thread.sleep(3000);

            // Locate and click "Return, Refund and Cancellation" in Links, wait for 2 seconds
            WebElement ReturnRefundCancellation = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[3]/ul/li[3]/a"));
            ReturnRefundCancellation.click();
            Thread.sleep(3000);
            clickheaderLogo.run();
            scrollToFooter.run();
            Thread.sleep(3000);

            // Locate and click "Address" in Contact
            WebElement Contact = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[4]/h6"));
            System.out.println("Contact"+ Contact);
            WebElement address = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[4]/ul/li[1]/a"));
            address.click();
            clickheaderLogo.run();
            scrollToFooter.run();

            // Locate and click "Phone" in Contact, wait for 2 seconds
            WebElement phone = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[4]/ul/li[2]/a"));
            phone.click();
            Thread.sleep(3000);
            clickheaderLogo.run();
            scrollToFooter.run();
            Thread.sleep(3000);
            

            // Locate and click "Email" in Contact, wait for 2 seconds
            WebElement email = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/aside[4]/ul/li[3]/a"));
            email.click();
            Thread.sleep(3000);;
            clickheaderLogo.run();
            Thread.sleep(3000);
            
            System.out.println("Header Logo: " + clickheaderLogo);
            System.out.println("Orgatma " + orgatma );
            System.out.println("Leafy Vegetables" + leafyVegetables);
            System.out.println("Fruits"+ fruits);
            System.out.println("Terms & Conditions"+ termsConditions);
            System.out.println("Privacy"+ privacy);
            System.out.println("Return, Refund and Cancellation"+ ReturnRefundCancellation);
            System.out.println("Address"+ address);
            System.out.println("Phone"+ phone);
            System.out.println("Email"+ email);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Test completed and browser closed");
        }
    }
}
