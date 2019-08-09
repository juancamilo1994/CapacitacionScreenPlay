package co.com.bancolombia.certificacion.googlesuite.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


public class GoTo implements Task{
	
	private Target googleApp;
	public GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS),
				Click.on(googleApp));//se abre el menu de google apps
		
		
		
	}

	public static GoTo theApp(Target googleApp) {
		
		return instrumented(GoTo.class, googleApp);//se llama al contructor
	}

}
