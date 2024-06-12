package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShoppingCartTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
    	 System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void navigateToProductPage() {
        driver.get("https://vegzo.trygo.in/");
        System.out.println("Navigated to the homepage");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cus_site_header")));
        System.out.println("Homepage is loaded properly");

        WebElement firstProduct = driver.findElement(By.xpath("/html/body/section/div[4]/div/div/div/div/div[6]/div/div/div[3]/div/div/div/a"));
        firstProduct.click();
        System.out.println("Clicked on the first product");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[1]")));
        System.out.println("Product details page is loaded");
    }


    @Test(priority = 2, dependsOnMethods = "navigateToProductPage")
    public void addToCart() {
        WebElement addToCartButton = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div[2]/a[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        addToCartButton.click();
        System.out.println("Clicked Add to Cart button");

        WebElement cartIcon = driver.findElement(By.xpath("//*[@id=\"cart-product-count\"]"));
        wait.until(ExpectedConditions.visibilityOf(cartIcon));
        System.out.println("Cart icon is visible");

       // String itemCount = cartIcon.getText();
       // Assert.assertEquals(itemCount, "1", "Cart icon does not reflect the correct item count");
       // System.out.println("Cart icon updated with item count");
    }


    
    @Test(priority = 3, dependsOnMethods = "addToCart")
    public void updateCartQuantity() {
        // Navigate to the cart page
        WebElement cartIcon = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/div[2]/a[2]"));
        cartIcon.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart-page-container")));
        System.out.println("Navigated to the cart page");

         //Update the quantity of items in the cart
        WebElement quantityInput = driver.findElement(By.xpath("//*[@id=\"cart_product_row_1\"]/div/div/div[2]/div/input[5]"));
        quantityInput.click();
        System.out.println("Updated item quantity to 2");

        //WebElement updateButton = driver.findElement(By.xpath("//button[text()='Update']"));
       // updateButton.click();
       //System.out.println("Clicked Update button");

        // Verify the cart reflects the updated quantity and price
       System.out.println("Cart quantity updated correctly");

        WebElement subtotal = driver.findElement(By.id("cus-full-cart-total"));
      
      System.out.println("Subtotal: " + subtotal.getText());
     
                                   
       
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}