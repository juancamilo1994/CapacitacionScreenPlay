package co.com.bancolombia.certificacion.googlesuite.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;

//se implementa la interfas para que sea una tarea (task)
public class OpenTheBrowser implements Task{

	private PageObject page;
	//constructor o setter
	
	public OpenTheBrowser(PageObject page) {
		this.page=page;
	}
	@Override
	@Step("{0} opens the browser on google home page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new GoogleHomePage()));//abrir el navegador
		
		
	}

	public static OpenTheBrowser on(PageObject page) {
		// TODO Auto-generated method stub
		//return new OpenTheBrowser();
		return instrumented(OpenTheBrowser.class, page);//se llama el contructor y se le manda la pagina del navegador
	}

}
