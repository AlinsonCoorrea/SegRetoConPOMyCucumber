package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.StepsAvianca;
public class AviacaStepDefinition {

    @Steps
    StepsAvianca aviancaSteps = new StepsAvianca();

    @Given("^que me encuentro en la pagina de avianca con la url (.*)$")
    public void que_me_encuentro_en_la_pagina_de_avianca_con_la_url_https_www_avianca_com_co_es(String url) {

        SeleniumWebDriver.ChromeWebDriver(url);
    }


    @When("^busco el sitio de destino en la pagina de avianca$")
    public void busco_el_sitio_de_destino_en_la_pagina_de_avianca() {

        try {
            Thread.sleep(3000);
            aviancaSteps.buscarVuelo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^podre ver el producto en pantalla$")
    public void podre_ver_el_producto_en_pantalla() {
        SeleniumWebDriver.driver.quit();
    }
}
