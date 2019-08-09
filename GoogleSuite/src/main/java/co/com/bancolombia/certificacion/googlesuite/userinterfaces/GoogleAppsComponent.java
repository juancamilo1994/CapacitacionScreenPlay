package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {

	public static final Target GOOGLE_APPS = Target.the("Google apps button").located(By.id("gbwa"));//boton de los cuadritos de google
	
	//son mapeos del app de transalte de google 
	//public static final Target GOOGLE_TRANSLATE = Target.the("Google apps button").
			//locatedBy("//iframe[@id='I0_1565316914256']|//div[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul/li/a/span[contains(text(), 'Traductor')]");
	//public static final Target GOOGLE_TRANSLATE = Target.the("Google apps button").locatedBy("//div[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul/li/a/span[contains(text(), 'Traductor')]");
	public static final Target GOOGLE_TRANSLATE = Target.the("Google apps button").locatedBy("//*[@id='gb51']|//a[@data-pid='51']");//mapea la opcion de google translate
	//public static final Target GOOGLE_TRANSLATE = Target.the("Google translate option").located(By.id("gb51"));//la opcion de google tranlate
	//public static final Target GOOGLE_TRANSLATE = Target.the("Google apps button").locatedBy("//div[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul/li/a[@href=\"https://translate.google.com.co/?hl=es&tab=rT1\"]");
	//public static final Target GOOGLE_TRANSLATE = Target.the("Google apps button").locatedBy("//div[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul/li/a[@href=\"https://translate.google.com.co/?hl=es&tab=rT1\"]|//span[@pid='51']");
	
	
	
}
