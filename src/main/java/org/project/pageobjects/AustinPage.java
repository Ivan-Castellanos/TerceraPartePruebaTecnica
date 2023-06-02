package org.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AustinPage {
    private static final String TITLE = "Austin Web & App Developers | December Labs";
    private static final String URL = "https://inhouse.decemberlabs.com/locations/austin/";
    protected final WebDriver driver;
    private final CalendarPopUp calendarPopUp;
    private final By calendarButtonLocator = By.xpath("//a[contains(text(),\"Schedule free consultation\")]");


    public AustinPage(WebDriver driver) {
        this.driver = driver;
        calendarPopUp = new CalendarPopUp(driver);
    }

    public boolean isTitleCorrect() {
        return driver.getTitle().equals(TITLE);
    }

    public boolean isUrlCorrect() {
        return driver.getCurrentUrl().equals(URL);
    }

    public void calendarClick() {
        driver.findElement(calendarButtonLocator).click();
    }

    public CalendarPopUp getCalendarPopUp() {
        return calendarPopUp;
    }
}
