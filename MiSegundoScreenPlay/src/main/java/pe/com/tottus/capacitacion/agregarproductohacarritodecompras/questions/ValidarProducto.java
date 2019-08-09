package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.PaginaDeProductos;

public class ValidarProducto implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		
		String quesitoWikipedia = Text.of(PaginaDeProductos.nombreProducto).viewedBy(actor).asString();//se captura el nombre del producto que sale en el carrito de compras
		StringBuilder sb = new StringBuilder(quesitoWikipedia);
		//sb.deleteCharAt(5);
		//sb.deleteCharAt(5);
		//sb.deleteCharAt(5);
		
		System.out.println(sb);// imprime el texto que captura del link
				
		return sb.toString();//retorna el texto del mapeo
	}

	
	public static ValidarProducto enElCarrito() {
		// TODO Auto-generated method stub
		return new ValidarProducto();
	}


}
