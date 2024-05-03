package Tests;

import Pages.DemoQAPage;
import Pages.ReusableMethod;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DemoQATest extends DemoSetubTest{

    @Test
     public void signInTest() {
        DemoQAPage demoQAPage = homePage.demoQAPage();
        demoQAPage.getElementBlock();


    }
}