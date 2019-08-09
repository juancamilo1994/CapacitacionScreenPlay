package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)//se agrega el Junit


//se ingresa la historia de usuario (feature) y se le dice que lo ejecute con los pasos y se indica que se va trabajar con camelcase (estandar)
@CucumberOptions(features = "src\\test\\resourses\\pe\\com\\tottus\\capacitacion\\"
		+ "agregarproductohacarritodecompras\\features\\"
		+ "agregarproductohacarritodecompras.feature",
		glue="pe.com.tottus.capacitacion.agregarproductohacarritodecompras.stepdefinitions",
		snippets=SnippetType.CAMELCASE)


public class AgregarProductoHaCarritoDeComprasRunner {

}
