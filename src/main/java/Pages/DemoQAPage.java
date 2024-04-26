package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class DemoQAPage {
    public WebDriver driver;
    public ReusableMethod method;


    public DemoQAPage(WebDriver driver){
         this.driver = driver;
         this.method = new ReusableMethod(driver);
    }

    public By elementsBlock = By.xpath("(//div[@class='card-body'])[1]");

    public void getElementClick(){
        method.clickElement(elementsBlock);

    }

}
