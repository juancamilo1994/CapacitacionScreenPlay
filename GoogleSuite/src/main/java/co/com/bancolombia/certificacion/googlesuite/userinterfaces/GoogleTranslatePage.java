package co.com.bancolombia.certificacion.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {

	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button").locatedBy("//div[@class='sl-more tlid-open-source-language-list']");//selecciona el idioma origen
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("target language button").locatedBy("//div[@class='tl-more tlid-open-target-language-list']");//selecciona el idioma origen
	
	
	public static final Target SOURCE_LANGUAGE = Target.the("source language").locatedBy("//div[@class='language_list_item_icon sl_list_en_checkmark']");//selecciona el idioma ingles
	public static final Target TARGET_LANGUAGE = Target.the("target language").locatedBy("//div[@class='language_list_item_icon tl_list_es_checkmark']");//selecciona el idioma español
	
	
	public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("source language textarea").located(By.id("source"));//caja de texto de ingreso
	public static final Target TARGET_LANGUAGE_RESULT = Target.the("target language result").locatedBy("//span[@class='tlid-translation translation']");//caja de texto resultado
	//public static final Target TARGET_LANGUAGE_RESULT = Target.the("target language result").located(By.id("gt-res-dir-ctr"));
	
	
}
