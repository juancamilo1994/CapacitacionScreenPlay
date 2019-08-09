package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.TottusHome;

public class AbrirLaPagina implements Task{

	PageObject page;
	
	public AbrirLaPagina(PageObject page) {
		this.page = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(page));//indica que se va abrir la pagina en tottus 
		
	}


	public static Performable en(PageObject page) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(AbrirLaPagina.class, page);//llama al constructor y le manda la pagina
	}

}
