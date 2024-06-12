package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class ProductDetailsPageTest {
    public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
         //Navigate to the homepage
            driver.get("https://vegzo.trygo.in/");
            System.out.println("Navigated to the homepage");

            //  Wait until the homepage is fully loaded
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cus_site_header")));
            System.out.println("Homepage is loaded properly");

            //  navigate to its details page
          
            WebElement firstProduct = driver.findElement(By.xpath("/html/body/section/div[4]/div/div/div/div/div[6]/div/div/div[3]/div/div/div/a"));
            firstProduct.click();
            System.out.println("Clicked on the first product");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]")));
            System.out.println("Product details page is loaded");

            //  all necessary product details are displayed
         
            WebElement productName = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[1]/div[1]/h2"));
            assert productName.isDisplayed() : "Product name is not displayed";
            System.out.println("Product name: " + productName.getText());

            // Verify product price
            WebElement productPrice = driver.findElement(By.xpath("//*[@id=\"cus-product-price-container\"]/b"));
            assert productPrice.isDisplayed() : "Product price is not displayed";
            System.out.println("Product price: " + productPrice.getText());


            // Verify product images
            List<WebElement> productImages = driver.findElements(By.xpath("//*[@id=\"slick-slide00\"]/img"));
            assert productImages.size() > 0 : "Product images are not displayed";
            System.out.println("Number of product images: " + productImages.size());

            System.out.println("All necessary product details are displayed correctly");

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
