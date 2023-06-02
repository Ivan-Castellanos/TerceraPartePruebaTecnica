package org.project;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class AustinCalendarTest extends BaseTest{
    @Test
    public void Test(){
        HomePage homePage = new HomePage(driver).goTo();
        Assert.assertTrue(homePage.isTitleCorrect());
        Assert.assertTrue(homePage.isNavBarDisplayed(), "Navigation Bar not found.");
        AustinPage austinPage = homePage.austinClick();
        Assert.assertTrue(austinPage.isTitleCorrect());
        Assert.assertTrue(austinPage.isUrlCorrect());
        austinPage.calendarClick();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(austinPage.calendarPopUp.isDisplayed());
        austinPage.calendarPopUp.close();
        Assert.assertFalse(austinPage.calendarPopUp.isDisplayed());
    }
}
