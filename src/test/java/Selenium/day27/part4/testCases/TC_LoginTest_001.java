package Selenium.day27.part4.testCases;

import Selenium.day27.part1.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() throws InterruptedException {

        driver.get(baseURL);
        driver.manage().window().maximize();

        LoginPage lp = new LoginPage(driver);

        // lp.setUserName(username);
        logger.info("User provided"); //logger msg

        // lp.setPassword(password);
        logger.info("Password provided");//logger msg

        lp.clickLogin();
        logger.info("Login in Clicked");//logger msg

        Thread.sleep(2000);

        if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
            lp.clickLogout();
            Assert.assertTrue(true);
            logger.info("Login Passed");//logger msg

        } else {
            Assert.assertTrue(false);
            logger.info("Login Failed");//logger msg
        }

    }

}