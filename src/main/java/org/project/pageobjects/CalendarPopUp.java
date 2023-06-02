package org.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalendarPopUp {
    protected final WebDriver driver;
    private final By calendarLocator = By.className("calendar-modal");
    private final By closeButtonLocator = By.className("btn-close-modal");

    public CalendarPopUp(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed() {
        return driver.findElement(calendarLocator).isDisplayed();
    }

    public void close() {
        driver.findElement(closeButtonLocator).click();
    }
}
