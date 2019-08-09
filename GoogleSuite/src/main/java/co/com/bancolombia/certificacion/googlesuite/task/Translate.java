package co.com.bancolombia.certificacion.googlesuite.task;

import org.openqa.selenium.By;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Translate implements Task{

	String cheese;
	
	public Translate(String cheese) {
		this.cheese = cheese;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//Se despliega el idioma origen y se selecciona el idioma inglés, luego se selecciona 
		//el idioma destino y se selecciona español, y posterior a esto se le envia la palabra cheese 
		//en el cuadro de traducción 
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION),
				Click.on(GoogleTranslatePage.SOURCE_LANGUAGE),
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION),
				Click.on(GoogleTranslatePage.TARGET_LANGUAGE),
				Enter.theValue(cheese).into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXTAREA));
		
	}

	public static Translate the(String cheese) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Translate.class, cheese);
	}

}
