package co.com.google.capacitacion.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl ("https://www.google.com")//se define la ruta en la cual quiero abrir 


//hereda de la clase PageObjects
public class GoogleHome extends PageObject{

	//define todos los elementos con el cual se interactua (caja de texto es el nombre en el reporte )
	//se define el elemento de la caja de bsuqueda y el boton para buscar
	public static final Target txtBuscar = Target.the("Caja de texto").located(By.name("q"));
	public static final Target btnBuscar = Target.the("Boton de buscar").located(By.name("btnK"));
	
}
