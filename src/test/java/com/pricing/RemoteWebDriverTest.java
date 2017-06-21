package com.pricing;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static com.steadystate.css.parser.SACParserCSSmobileOKBasic1Constants.URL;
import static org.testng.Assert.assertEquals;

public class RemoteWebDriverTest {
    public static WebDriver driver;

    @BeforeClass
    public static void conectarDriver() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    }

    @Test
    public void elTituloDeGoogleEsGoogle(){
        driver.get("http://www.google.es");
        assertEquals(driver.getTitle(), "Google");
    }

    @AfterClass
    public static void cerrarDriver(){
        driver.close();
    }
}