import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstAutomation {
     public static WebDriver driver;


    public static void main(String[] args) {
        //open Browser
        driver =new ChromeDriver();



        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.manage().window().maximize();

        //type the URL OR Website
        driver.get("https://demo.nopcommerce.com/");
        //click on register button
        driver.findElement(By.className("ico-register")).click();
        //type firstname
        driver.findElement(By.id("FistName")).sendKeys("Bindiya");
        //type lastname
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //enter your email
        driver.findElement(By.id("Email")).sendKeys("bp1234@gmail.com");
        //enter your password
        driver.findElement(By.id("Password")).sendKeys("bpjp1914");
        //enter your Conform password
        driver.findElement(By.id("Confirm Password")).sendKeys("bpjp1914");
        //click on register button
        driver.findElement(By.name("register-button")).click();
        //verify correct registration msg displayed

    }
}