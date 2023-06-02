package org.project.austintest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.project.BaseTest;
import org.project.pageobjects.AustinPage;
import org.project.pageobjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AustinCalendarTest extends BaseTest {
    private static final Logger logger = LogManager.getLogger(AustinCalendarTest.class);

    @Test
    public void Test() {
        HomePage homePage = new HomePage(driver).goTo();
        Assert.assertTrue(homePage.isTitleCorrect());
        Assert.assertTrue(homePage.isNavBarDisplayed(), "Navigation Bar not found.");
        logger.info("Home page is correctly displayed.");

        AustinPage austinPage = homePage.austinClick();
        Assert.assertTrue(austinPage.isTitleCorrect());
        Assert.assertTrue(austinPage.isUrlCorrect());
        logger.info("Austin page is correctly displayed.");

        austinPage.calendarClick();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(austinPage.getCalendarPopUp().isDisplayed());
        austinPage.getCalendarPopUp().close();
        Assert.assertFalse(austinPage.getCalendarPopUp().isDisplayed());
        logger.info("Calendar is able to be found and closed.");
    }
}
