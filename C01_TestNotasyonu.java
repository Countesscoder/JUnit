package day06_JUnitFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.ChoiceFormat;
import java.time.Duration;

public class C01_TestNotasyonu {
    /* Bu class içinde 3 test calıstiralim
    1)google sayfasina gidip,url'nin google icerdigini test edin
    2)wisequarter anasayfasina gidip url'nin wisequarter içerdiğini test edin
    3)amazon sayfasina gidip,amazon logosunun gorundugunu test edin*/

    /* JUnit 'in bize sağladığı ilk ve en önemli özellik test methodlarinin bagimsiz
     olarak calstirilabilmesini saglayan @Test notasyonudur.Bununla istersen yalnızca tek methoduda
     çalıstirabilirsin sayfadaki

     JUnit ile class leveldan birden fazla test methodu calistirirsak
     hamgi siralama ile calistigini ongoremeyiz ve yonetemeyiz
     */
    WebDriver driver;
    @Test @Ignore
    public void googleTest(){
     mahserin4Atlisi();
     driver.get("https://www.google.com");
     String expectedIcerik="google";
     String actualIcerik=driver.getCurrentUrl();

     if (actualIcerik.contains(expectedIcerik)){
         System.out.println("Google test is PASSED.");
     }else {
         System.out.println("Google test is FAILED.");
     }
     driver.close();




    }
    @Test
    public  void wiseTest(){
    mahserin4Atlisi();
    driver.get("https://www.wisequarter.com");
    String expectedIcerik2="wisequarter";
    String actualDeger=driver.getCurrentUrl();
     if (actualDeger.contains(expectedIcerik2)){
         System.out.println("Wisequarter test is PASSED.");
     }else {
         System.out.println("Wisequarter test is FAILED." );
     }
     driver.close();
   }

    @Test
    public void amazonTest(){
     mahserin4Atlisi();

     driver.get("https://www.amazon.com");

     WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
     if (logo.isDisplayed()){
         System.out.println("Logo test is PASSED.");
     }else {
         System.out.println("Logo test is FAILED.");
     }
     driver.close();



   }

  public void  mahserin4Atlisi(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

  }














}
