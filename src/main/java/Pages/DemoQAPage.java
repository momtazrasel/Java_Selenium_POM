package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

<<<<<<< HEAD
public class DemoQAPage{
=======
import java.sql.Driver;

public class DemoQAPage {
>>>>>>> 3b186801fe71812dbfdf0edefd5f7e34f4efe2dd
    public WebDriver driver;
    public ReusableMethod method;


    public DemoQAPage(WebDriver driver){
         this.driver = driver;
         this.method = new ReusableMethod(driver);
    }

    public By elementsBlock = By.xpath("(//div[@class='card-body'])[1]");

<<<<<<< HEAD
    public void getElementBlock(){
        ReusableMethod.clickElement(elementsBlock);
    }

=======
    public void getElementClick(){
        method.clickElement(elementsBlock);

    }
>>>>>>> 3b186801fe71812dbfdf0edefd5f7e34f4efe2dd

}
