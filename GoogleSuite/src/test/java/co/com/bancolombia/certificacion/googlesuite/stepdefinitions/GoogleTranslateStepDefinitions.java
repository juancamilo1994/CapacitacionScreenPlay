package co.com.bancolombia.certificacion.googlesuite.stepdefinitions;

import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;//importar para el seethat
import co.com.bancolombia.certificacion.googlesuite.questions.TheWord;
import co.com.bancolombia.certificacion.googlesuite.task.GoTo;
import co.com.bancolombia.certificacion.googlesuite.task.OpenTheBrowser;
import co.com.bancolombia.certificacion.googlesuite.task.Translate;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;


public class GoogleTranslateStepDefinitions {

	@Managed(driver = "chrome")//inyeccion de dependiencias, inidializa el driver de chrome
	private WebDriver herBrowser;//crear el objeto web driver
	
	
	private Actor susan = Actor.named("Susan");//se crea el actor para el informe y se hace de esta manera para usar el metodo y no el constructor, se vuelve mas generico y sin dependencias
	
	
	private GoogleHomePage googleHomePage;
	
	//esto se crea para conectar el driver con el actor, este metodo se ejecutara antes que todos los demas
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));//se dice que susan puede navegar en la web con su navegador 
		herBrowser.manage().window().maximize();//se maximiza la ventana del navegador
	}
	
	//se pegan el given when y then que genera la ejecucion
	@Given("^that susan want to translate a word$")
	public void thatSusanWantToTranslateAWord() throws Exception {
		//precondiciones
		//Estar en google translate
		
		//susan.wasAbleTo(todos); susan fue capaz de
		//susan.attemptsTo(tasks); susan intenta hacer se usa en el then
		
		//se crea el objeto d ela clase OpenTheBrowser(task) por que los metodos no reciben clases solo objetos o instancias
		
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
						GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));//ese openthebrowser se crea como tarea(task)

	}

	
	@When("^she tranlate the word \"([^\"]*)\" from english to spanish$")
	public void sheTranlateTheWordFromEnglishToSpanish(String arg1) throws Exception {
		//condiciones (las acciones)
		//traducir una palabra de ingles a español
		
		susan.wasAbleTo(Translate.the(arg1));//se le envia a la tarea la palabra a traducir, esta se trae desde el Feature
	}


	@Then("^she should see the word \"([^\"]*)\" in the screen$")
	public void sheShouldSeeTheWordInTheScreen(String arg1) throws Exception {
		   //consecuencias (resultados esperados)
			//aparece la palabra traducida
			
			susan.should(seeThat(TheWord.translated(),equalTo(arg1)));//se le envia a la tarea la palabra a comparar con el resultado obtenido en la traduccion
			//susan.asksFor(clase.metodo);
	}
}
