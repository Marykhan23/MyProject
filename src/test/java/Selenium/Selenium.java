package Selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Selenium {

    private static String url = "https://my.uopeople.edu/login/index.php" ;
    private static String login = "s116885";
    private static String password = "sapmaria1";
   // private static String url = ;

    protected static WebDriver driver;

    @BeforeAll
    public static void initBrowser() {
        System.out.println("Browser initiation");
        System.setProperty("webdriver.chrome.driver","src/chromedriver-0.0.1.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

   @Test
   @DisplayName("Authorisation")
    public void test1(){
       driver.get(url);
       //driver.findElement(By.id("username")).sendKeys(login);
       //driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(login);
       //driver.findElement(By.id("password")).sendKeys(password);
      // driver.findElement(By.id("loginbtn")).click();
        try {Thread.sleep(2000);}
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @AfterAll
    public static void finish(){
        driver.close();
    }
}
