package co.com.google.capacitacion.tasks;

import co.com.google.capacitacion.userinterfaces.GoogleHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarEnPagina implements Task{

	String quesito;
	
	public BuscarEnPagina(String quesito) {
		this.quesito=quesito;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(quesito).into(GoogleHome.txtBuscar),
						Click.on(GoogleHome.btnBuscar));//se asigna a la caja de texto la palabra quesito y se da clcik en el boton buscar
		
	}

	public static BuscarEnPagina laPalagbra(String quesito) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(BuscarEnPagina.class, quesito);//se le manda por parametro el nombre de quesito que se obtiene en el feature
	}
	
	

}
