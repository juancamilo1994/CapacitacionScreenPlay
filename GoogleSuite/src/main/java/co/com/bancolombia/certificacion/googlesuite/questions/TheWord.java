package co.com.bancolombia.certificacion.googlesuite.questions;

import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheWord implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		String word = Text.of(GoogleTranslatePage.TARGET_LANGUAGE_RESULT).viewedBy(actor).asString();//se captura el dato mapeado
		StringBuilder sb = new StringBuilder(word);
		//sb.deleteCharAt(5);
		//sb.deleteCharAt(5);
		//sb.deleteCharAt(5);
		System.out.println(sb);
		return sb.toString();//retorna el texto del mapeo
	}//retornar el timpo que va a retornar

	public static TheWord translated() {
		// TODO Auto-generated method stub
		return new TheWord();//constructor
	}





}
