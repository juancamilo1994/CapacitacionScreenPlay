package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.tottus.com.pe")//se agrega la ruta por defecto de la pagina

public class TottusHome extends PageObject{
	
	//se mapea la caja de texto del buscador de productos y el boton buscar 
	public static final Target txtBuscar = Target.the("Caja de buscar producto").located(By.id("atg_store_searchInput_top"));
	public static final Target btnBuscar = Target.the("Boton de buscar producto").located(By.id("atg_store_searchSubmit_top"));
	

}
