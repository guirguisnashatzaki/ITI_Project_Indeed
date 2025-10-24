package org.itiprojectindeed.Guirguis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {


    //Variables
    private final WebDriver driver;


    //Locators
        private final By username = By.id("user-name");
        private final By password = By.id("password");
        private final By loginButton = By.id("login-button");
    //Constructor
    public Login_Page(WebDriver driver){
        this.driver = driver;
    }


    //Actions (Test Cases)
    public void LoginWithValidCredentials(String user, String pass){
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    public boolean isLoggedIn(String expectedUrl){
        return driver.getCurrentUrl().equals(expectedUrl);
    }


}
