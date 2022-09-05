package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ingen\\Desktop\\pruebas_rest_assure\\EjemploSelenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }


}
