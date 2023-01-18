package com.gunce.step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseStep {
    WebDriver driver;

    public BaseStep() {

    }

    @Before
    public void before() {
        System.out.println("Browser ayağa kaldırıldı.");
        driver = new ChromeDriver();
    }

    @Given("^(.*) adresine gidilir.$")
    public void navigateToURL(String url) {
        driver.navigate().to(url);
        System.out.println(url + " adresine gidildi.");
    }

    @Given("^(.*) saniye beklenir.$")
    public void waitSecond(Long seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }

}
