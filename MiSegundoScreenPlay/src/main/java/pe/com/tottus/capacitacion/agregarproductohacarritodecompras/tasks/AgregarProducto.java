package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.PaginaDeProductos;

public class AgregarProducto implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(PaginaDeProductos.btnAgregar));//se realiza la accion de agregar al carrito 
		
	}

	public static AgregarProducto alCarrito() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(AgregarProducto.class);//se retorna para realizar la tarea
	}

}
