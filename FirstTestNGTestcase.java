import javafx.beans.property.SetProperty;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static java.time.Duration.ofSeconds;

public class FirstTestNGTestcase {

    WebDriver driver;

   @Test(priority = 1)
   void openbrowser() {
        System.out.println("open browser");
        System.setProperty("webdriver.chrome.driver", "C:\\software\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }

    @Test(priority = 2)
    void registeruser() throws InterruptedException {
      System.out.println("open browser");
       System.setProperty("webdriver.chrome.driver", "C:\\software\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

   }

    @Test(priority = 3)
    void login() {
        System.out.println("login user");
        System.setProperty("webdriver.chrome.driver", "C:\\software\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("hemant4u@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("Abc098£");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }

    @Test(priority = 4)
   void selectandaddtheproduct() {
        System.out.println("open browser");
        System.setProperty("webdriver.chrome.driver", "C:\\software\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/h2/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        driver.findElement(By.className("qty-input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"updatecart\"]")).click();

   }


    @Test(priority = 5)
    void Checkout(){
        System.out.println("Check out");
        System.setProperty("webdriver.chrome.driver", "C:\\software\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/cart");
        driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();


    }
}


