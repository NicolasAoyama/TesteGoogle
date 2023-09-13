package com.Google.Teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected static WebDriver chrome;
    @BeforeClass
    public static void TesteWebDriver(){
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://google.com");
    }
    @AfterClass
    public static void finalizar(){
        chrome.quit();
    }

}
