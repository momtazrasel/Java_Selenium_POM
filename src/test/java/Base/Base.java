package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {

    public WebDriver driver;
    public HomePage homePage;

    @BeforeMethod
    public void setUP(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        driver = new ChromeDriver(options);
//        driver.get("https://diamondbeta.strategicplanningonline.com/");
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }

    @AfterMethod
    public void down() throws InterruptedException {
        Thread.sleep(2000);

        driver.quit();
    }

}
