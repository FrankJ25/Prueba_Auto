package facetest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;


public class Hooks {

    private  static WebDriver driver;
    private static int numerOfCase = 0;

    private DriverManager driverManager;

    @Before
    public void Setup(){
        numerOfCase++;
        System.out.println("se esta ejecutando el escenario nro " + numerOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://es-la.facebook.com/");
        driver.manage().window().maximize();
    }

    @After
    public void TearDown(){
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
