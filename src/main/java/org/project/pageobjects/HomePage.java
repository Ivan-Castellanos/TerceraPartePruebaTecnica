package org.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static final String TITLE = "December Labs: UX/UI Design and Mobile App & Web Development";
    private static final String URL = "https://inhouse.decemberlabs.com";
    protected final WebDriver driver;
    private final By navigationBarLocator = By.id("menu-header-main-menu");
    private final By austinButtonLocator = By.className("city");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage goTo() {
        driver.get(URL);
        return this;
    }

    public boolean isTitleCorrect() {
        return driver.getTitle().equals(TITLE);
    }

    public boolean isNavBarDisplayed() {
        return driver.findElement(navigationBarLocator).isDisplayed();
    }

    public AustinPage austinClick() {
        driver.findElement(austinButtonLocator).click();
        return new AustinPage(driver);
    }
}
