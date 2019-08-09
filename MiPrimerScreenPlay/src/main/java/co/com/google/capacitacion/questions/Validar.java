package co.com.google.capacitacion.questions;


import co.com.google.capacitacion.userinterfaces.BusquedaEnGoogle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		// TODO Auto-generated method stub
		//se extrae el nombre de la página a comparar dado el resultado de la búsqueda 
		String quesitoWikipedia = Text.of(BusquedaEnGoogle.link).viewedBy(actor).asString();
		StringBuilder sb = new StringBuilder(quesitoWikipedia);
		//sb.deleteCharAt(5);
		//sb.deleteCharAt(5);
		//sb.deleteCharAt(5);
		
		System.out.println(sb);// imprime el texto que captura del link
				
		return sb.toString();//retorna el texto del mapeo
	}

	public static Validar quesitoEnWikipedia() {
		// TODO Auto-generated method stub
		return new Validar();
	}
}
