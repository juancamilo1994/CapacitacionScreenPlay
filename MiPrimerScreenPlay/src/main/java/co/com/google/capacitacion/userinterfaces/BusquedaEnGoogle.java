package co.com.google.capacitacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedaEnGoogle extends PageObject{

	//se crea el elemento de la pagina de wikipedia obtenido en la busqueda de quesito
	public static final Target link = Target.the("Link de Busqueda").locatedBy("//div[@id=\"rso\"]/div/div/div/div/div/a/h3");
}
