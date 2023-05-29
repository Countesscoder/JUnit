package day06_JUnitFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Assert {
  // Amazona gidip title'in AMAZON icerdigini test edin.
    WebDriver driver;
    @Test
    public void test01(){
    mahserin4atlisi();
    driver.get("https://www.amazon.com/");

    String expectedIcerik="AMAZON";
    String actualTitle=driver.getTitle();

   /* if (actualTitle.contains(expectedIcerik)){
        System.out.println("Title test is PASSED.");
    }else{
        System.out.println("Actual Title:"+actualTitle);
        System.out.println("Title test is FAILED."); }*/
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
    driver.close();


    }

 public  void mahserin4atlisi(){
     WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

 }























}
