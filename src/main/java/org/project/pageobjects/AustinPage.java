package org.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AustinPage {
    WebDriver driver;
    static final String title = "Austin Web & App Developers | December Labs";
    static final String url = "https://inhouse.decemberlabs.com/locations/austin/";
    public CalendarPopUp calendarPopUp;

    By calendarButtonLocator = By.xpath("//a[contains(text(),\"Schedule free consultation\")]");



    public AustinPage(WebDriver driver) {
        this.driver = driver;
        calendarPopUp = new CalendarPopUp(driver);
    }

    public boolean isTitleCorrect(){
        return driver.getTitle().equals(title);
    }

    public boolean isUrlCorrect(){
        return driver.getCurrentUrl().equals(url);
    }

    public void calendarClick(){
        driver.findElement(calendarButtonLocator).click();
    }
}
