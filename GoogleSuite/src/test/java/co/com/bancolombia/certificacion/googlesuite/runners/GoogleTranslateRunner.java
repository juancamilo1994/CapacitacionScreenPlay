package co.com.bancolombia.certificacion.googlesuite.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)//sirve para ejecutar un test con junit
//se define el archivo features, las definiciones(los stepdefinitions) y el patro camelcase
@CucumberOptions(
		features = "src/test/resourses/features/google.translate.feature",
		glue="co.com.bancolombia.certificacion.googlesuite.stepdefinitions",
		snippets=SnippetType.CAMELCASE)


public class GoogleTranslateRunner {

}
