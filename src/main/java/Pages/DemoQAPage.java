package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAPage {
    public WebDriver driver;


    public DemoQAPage(WebDriver driver){
         this.driver = driver;
    }

    public By elementsBlock = By.xpath("(//div[@class='card-body'])[1]");


}
