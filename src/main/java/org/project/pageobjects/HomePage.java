package org.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    static String url = "https://inhouse.decemberlabs.com";
    
    By navigationBarLocator = By.id("menu-header-main-menu");
    By austinButtonLocator = By.className("city");
    static final String title = "December Labs: UX/UI Design and Mobile App & Web Development";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage goTo(){
        driver.get(url);
        return this;
    }

    public boolean isTitleCorrect(){
        return driver.getTitle().equals(title);
    }

    public boolean isNavBarDisplayed(){
        return driver.findElement(navigationBarLocator).isDisplayed();
    }

    public AustinPage austinClick(){
        driver.findElement(austinButtonLocator).click();
        return new AustinPage(driver);
    }
}
