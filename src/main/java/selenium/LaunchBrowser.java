package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.google.com/");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
