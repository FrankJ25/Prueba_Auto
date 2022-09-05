package facetest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    private WebDriver driver = Hooks.getDriver();
    @Given("^quiero ingresar al login de facebook,$")
    public void quiero_ingresar_al_login_de_facebook() throws Throwable {
        String FaceTitle = "Facebook - Inicia sesión o regístrate";
        Assert.assertEquals(FaceTitle,driver.getTitle());


    }

    @When("^hago click y ingreso al formulario de registro$")
    public void hago_click_y_ingreso_al_formulario_de_registro() throws Throwable {
        WebElement titleFacebook = driver.findElement(By.linkText("Crear cuenta nueva"));
        titleFacebook.click();
    }

    @Then("^me bota un resultado$")
    public void me_bota_un_resultado() throws Throwable {
        Thread.sleep(2000);
        WebElement titulos = driver.findElement(By.name("websubmit"));
        Assert.assertEquals("Registrarte",titulos.getText());


    }



}
