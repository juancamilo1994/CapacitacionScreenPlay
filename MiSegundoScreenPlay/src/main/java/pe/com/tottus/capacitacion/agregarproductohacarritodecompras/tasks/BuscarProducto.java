package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.TottusHome;

public class BuscarProducto implements Task{
	
	
	String producto; //crea el objeto que almacenara el nombre del producto enviado por parametro
	public BuscarProducto(String producto) {
		
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//se ingresa el nombre del producto en la caja de texto y se le da click en buscar
		actor.attemptsTo(Enter.theValue(producto).into(TottusHome.txtBuscar),
				Click.on(TottusHome.btnBuscar));
	}

	public static BuscarProducto enLaPagina(String producto) {

		return Tasks.instrumented(BuscarProducto.class, producto);//llamada a la clase con el actor para realizar la tarea
	}
	
	

}
