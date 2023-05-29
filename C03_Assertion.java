package day06_JUnitFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Assertion {


    WebDriver driver;
    @Test
    public void googleTest(){
        mahserin4Atlisi();
        driver.get("https://www.google.com");
        String expectedIcerik="google";
        String actualIcerik=driver.getCurrentUrl();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));

        driver.close();




    }
    @Test
    public  void wiseTest(){
        mahserin4Atlisi();
        driver.get("https://www.wisequarter.com");
        String expectedIcerik2="wisequarter";
        String actualDeger=driver.getCurrentUrl();

        Assert.assertTrue(actualDeger.contains(expectedIcerik2));
        driver.close();
    }

    @Test
    public void amazonTest(){
        mahserin4Atlisi();

        driver.get("https://www.amazon.com");

        WebElement logo=driver.findElement(By.id("nav-logo-sprites"));

        Assert.assertTrue(logo.isDisplayed());
        driver.close();



    }

    public void  mahserin4Atlisi(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }







}
