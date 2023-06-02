package org.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;

    @BeforeTest
    public void SetUp() {
        System.setProperty("Webdriver.Chrome.Driver", "resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void AfterTest() {
        driver.close();
    }
}
