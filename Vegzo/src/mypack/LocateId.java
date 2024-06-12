package mypack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocateId {

    public static void main(String[] args) throws InterruptedException {

    	  System.setProperty("webdriver.chrome.driver", "G:\\chromedriver-win64\\chromedriver.exe");
    	    


        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://vegzo.trygo.in/");


            driver.manage().window().maximize();

            // Locate the Header logo element
           WebElement headerLogo = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/a/img"));
          headerLogo.click();
            
            //Thread.sleep(8000);
            //headerLogo = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/a/img"));
            //headerLogo.click();
            
            
            // Locate the Location Display element
            WebElement locationDisplay = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/div[1]/div/a/div[2]"));

            // Locate the Search Bar
           WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/div[1]/section/div[1]"));
           //searchBar.click();

            //Locate the Login button
           //WebElement loginButton = driver.findElement(By.linkText("Login"));
            //loginButton.click();
            

            // Locate the Cart button
           WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/div[2]/a[2]"));
           //cartButton.click();
           
           //Thread.sleep(3000);
           //headerLogo = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/a/img"));
           //headerLogo.click();
           
           
           
           
           // Locate the Navigation Menu items
            
			
			
			WebElement homeNav =
			  driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/div/div/ul/li[1]/a"));
			  
			WebElement orgatmaNav =
			  driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/div/div/ul/li[2]/a")); 
			  orgatmaNav.click();
			  
			  Thread.sleep(2000);
			  
			WebElement leafyVegetablesNav =
			  driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/div/div/ul/li[3]/a")); 
			  leafyVegetablesNav.click();
			  
			  Thread.sleep(2000);
			  
			WebElement fruitsNav =
			  driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/div/div/ul/li[4]/a")); 
			  fruitsNav.click();
			  
			  Thread.sleep(2000);
			  
			WebElement aboutUsNav =
			  driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/div/div/ul/li[5]/a")); 
			  aboutUsNav.click();
			  
			  Thread.sleep(2000);
			  
			WebElement contactNav =
			  driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/div/div/ul/li[6]/a")); 
			  contactNav.click();
			  
			  Thread.sleep(2000); headerLogo =
			  driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/a/img"));
			  headerLogo.click();
			 
			 
           
			
			WebElement productcategory = driver.findElement(By.xpath("/html/body/section/div[3]/div/div/div/div/div[2]/div/div[1]/div/div/a/div/img")); 
			  productcategory.click(); 
			  Thread.sleep(2000); 
			  headerLogo =driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/a/img"));
			  headerLogo.click();
			  
			  productcategory = driver.findElement(By.xpath("/html/body/section/div[3]/div/div/div/div/div[2]/div/div[2]/div/div/a/div/img")); 
			  productcategory.click(); Thread.sleep(2000); 
			  headerLogo =driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/a/img"));
			  headerLogo.click();
			  
			  productcategory = driver.findElement(By.xpath("/html/body/section/div[3]/div/div/div/div/div[2]/div/div[3]/div/div/a/div/img")); 
			  productcategory.click(); Thread.sleep(2000); 
			  headerLogo = driver.findElement(By.xpath("//*[@id=\"cus_site_header\"]/nav/a/img"));
			  headerLogo.click();
			 
       
           WebElement seemore = driver.findElement(By.xpath("/html/body/section/div[4]/div/div/div/div/div[1]/a"));
           seemore.click();
           
        

           
           
           
           
			
			  // Printing the elements to verify they are located
			  System.out.println("Header Logo: " + headerLogo);
			  System.out.println("Location Display: " + locationDisplay);
			  System.out.println("Search Bar: " + searchBar);
			  //System.out.println("Login Button: " + loginButton);
			  //System.out.println("Cart Button: " + cartButton);
			  System.out.println("Home Nav: " + homeNav);
			  System.out.println("Orgatma Nav: " + orgatmaNav);
			  System.out.println("Leafy Vegetables Nav: " + leafyVegetablesNav);
			  System.out.println("Fruits Nav: " + fruitsNav);
			  System.out.println("About Us Nav: " + aboutUsNav);
			  System.out.println("Contact Nav: " + contactNav);
			  System.out.println("productcategory:" + productcategory );
			  System.out.println("seemore:" + seemore);
           
        } finally {
            // Close the browser after a delay to see the result
            try {
                Thread.sleep(8000); // Wait for 8 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}


// https://www.awesomescreenshot.com/video/28415472?key=01ba29fb1d1472f9627863594d280d56