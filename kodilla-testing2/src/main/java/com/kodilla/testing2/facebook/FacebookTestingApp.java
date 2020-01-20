package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_FIRSTNAME = "//input[contains(@name, \"firstname\")]";
    public static final String XPATH_LASTNAME = "//input[contains(@name, \"lastname\")]";
    public static final String XPATH_PHONE = "//input[contains(@name, \"reg_email__\")]";
    public static final String XPATH_PASSWORD = "//input[contains(@name, \"reg_passwd__\")]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String INPUT_SEX = "u_0_7";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement firstnameField = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstnameField.sendKeys("Sebastian");

        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastnameField.sendKeys("Inglot");

        WebElement phoneField = driver.findElement(By.xpath(XPATH_PHONE));
        phoneField.sendKeys("999999999");

        WebElement passField = driver.findElement(By.xpath(XPATH_PASSWORD));
        passField.sendKeys("nowehaslo");

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardDay = new Select(selectComboDay);
        selectBoardDay.selectByIndex(7);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByVisibleText("lis");

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByVisibleText("1994");

        WebElement sexField = driver.findElement(By.id(INPUT_SEX));
        sexField.click();
    }
}
