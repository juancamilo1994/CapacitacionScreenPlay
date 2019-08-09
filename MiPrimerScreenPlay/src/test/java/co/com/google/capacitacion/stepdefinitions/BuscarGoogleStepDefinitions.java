package co.com.google.capacitacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.google.capacitacion.questions.Validar;
import co.com.google.capacitacion.tasks.AbrirLaPagina;
import co.com.google.capacitacion.tasks.BuscarEnPagina;
import co.com.google.capacitacion.userinterfaces.GoogleHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuscarGoogleStepDefinitions {
	@Managed(driver="chrome")
	WebDriver suDriver;
	
	Actor juancamilo=Actor.named("JUANCAMILO");
	
	GoogleHome googleHome;
	
	@Before
	public void setUp() {
		juancamilo.can(BrowseTheWeb.with(suDriver));
	}
	
	@Given("^que Juan Camilo esta la pagina de google$")
	public void queJuanCamiloEstaLaPaginaDeGoogle() throws Exception {
		//se indica que se va abrir la pagina de inicio de google
	    juancamilo.wasAbleTo(AbrirLaPagina.en(googleHome));//abre el navegador
	    suDriver.manage().window().maximize();//maximiza la ventana del navegador
	   
	}


	@When("^busca la palabra \"([^\"]*)\"$")
	public void buscaLaPalabra(String arg1) throws Exception {
		//se indica que se va a realizar la busqueda de la palabra quesito
		juancamilo.wasAbleTo(BuscarEnPagina.laPalagbra(arg1));
	   
	}

	@Then("^deberia ver el resultado \"([^\"]*)\" de wikipedia$")
	public void deberiaVerElResultadoDeWikipedia(String arg1) throws Exception {
		//se valida que la busqueda fue exitosa, obteniendo el titulo de la pagina de wikipedia en la lista de resultados
		juancamilo.should(seeThat(Validar.quesitoEnWikipedia(),equalTo(arg1)));
		
	}
}
