package co.com.google.capacitacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)//este es el del JUnit

//se ingresa la historia de usuario (feature) y se le dice que lo ejecute con los pasos y se indica que se va trabajar con camelcase (estandar)
@CucumberOptions(features="src\\test\\resources\\co\\com\\google\\"
		+ "capacitacion\\features\\BuscarGoogle.feature", 
		glue="co.com.google.capacitacion.stepdefinitions",
		snippets=SnippetType.CAMELCASE)

public class BuscarGoogleRunner {
	
	

}
 