package Tests;

import Base.Base;
import Pages.DemoQAPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DemoQATest extends Base {
    DemoQAPage demoQA;
    private WebDriver driver;
    private ReusableMethod reusableMethod;

    public DemoQATest(WebDriver driver){
        this.reusableMethod = new ReusableMethod(driver);
    }

    @Test
     public void signInTest(){
        reusableMethod.clickElement(demoQA.elementsBlock);
    }




}
