package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Homework_15 {
   // @Test
  // public static void main(String[] args) throws Throwable {
      // homework15();
   //}
   //@Test

    public static void homework15() throws Throwable{
        WebDriverManager.chromedriver().setup();
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get("https://qa.koel.app/");
        Thread.sleep(2000);
        Driver.get("https://testpro.io");
        Driver.quit();
    }

}

