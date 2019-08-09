package co.com.google.capacitacion.tasks;

import co.com.google.capacitacion.userinterfaces.GoogleHome;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaPagina implements Task{

	PageObject page;//se crea el objeto page para almacenar la pagina que es asignada en el constructor
	
	public AbrirLaPagina(PageObject page) {
		
		this.page = page;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(page));///abre la pagina de inicio de google la cual ya fue enviada yalmacenada en pag por el contructor
		
	}

	public static Performable en(PageObject page) {
		
		return Tasks.instrumented(AbrirLaPagina.class, page);//llama al constructor y le manda la pagina
	}
	
}
