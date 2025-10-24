package Guirguis;

import org.itiprojectindeed.Guirguis.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test {


    //Variables
    WebDriver driver;

    //Configuration
    @BeforeTest
    public void setup(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        driver = new EdgeDriver(options);
        driver.get("https://www.saucedemo.com/v1/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    //Test Cases

    @Test
    public void validLoginTest(){
        Login_Page login_page = new Login_Page(driver);
        login_page.LoginWithValidCredentials("standard_user","secret_sauce");
        Assert.assertTrue(login_page.isLoggedIn("https://www.saucedemo.com/v1/inventory.html"));
    }



}
