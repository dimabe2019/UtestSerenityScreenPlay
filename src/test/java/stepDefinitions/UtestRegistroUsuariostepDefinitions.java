package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import driver.SeleniumWebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.procesoRegistro;

import javax.sql.rowset.BaseRowSet;

public class UtestRegistroUsuariostepDefinitions {

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que me encuentro en la pagina de Utest con la url (.*)$")
    public void queMeEncuentroEnLaPaginaDeUtestConLaUrlHttpsWwwUtestCom(String url) {
      OnStage.theActorCalled("Diego").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
    }

    @When("^realizo el registro en la pagina$")
    public void realizoElRegistroEnLaPagina() {
      OnStage.theActorInTheSpotlight().attemptsTo(procesoRegistro.on());
    }

    @Then("^podre ver el contenido de la pagina$")
    public void podreVerElContenidoDeLaPagina() {

    }
}
