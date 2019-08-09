package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.questions.ValidarProducto;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks.AbrirElCarrito;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks.AbrirLaPagina;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks.AgregarProducto;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.tasks.BuscarProducto;
import pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces.TottusHome;

public class AgregarProductoHaCarritoDeComprasStepDefinitions {

	//se referencia el driver a utilizar
	@Managed(driver = "chrome")
	private WebDriver suDriver;//este va primero que el de arriba sino tira error
	
	TottusHome tottusHome;//se crea el objeto para cargar la pagina inicial

	
	Actor juancamilo = Actor.named("Juan Camilo");//se crea el actor
	
	@Before//antes de toda la ejecucion se indica que se abre el navegador con el driver previamente instanciado 
	public void SetUp() {
		
		juancamilo.can(BrowseTheWeb.with(suDriver));//abre el navegador
		suDriver.manage().window().maximize();//maximiza la ventana del navegador
	}
	
	@Given("^Que Juan Camilo este en la pagina de tottus peru$")
	public void queJuanCamiloEsteEnLaPaginaDeTottusPeru() throws Exception {
		//se indica que se va abrir la pagina de inicio de tottus
		juancamilo.wasAbleTo(AbrirLaPagina.en(tottusHome));
	}

	
	@When("^Agregar el pruducto \"([^\"]*)\" al carrito de compras$")
	public void agregarElPruductoAlCarritoDeCompras(String arg1) throws Exception {
		//Se busca el producto y se agrega al carrito
		juancamilo.wasAbleTo(BuscarProducto.enLaPagina(arg1),
				AgregarProducto.alCarrito(),
				AbrirElCarrito.enElCarrito());
	}
	
	/*@Then("^Deberia ver el pruducto agregado en el carrito de compras$")
	public void deberiaVerElPruductoAgregadoEnElCarritoDeCompras() throws Exception {
		//Se valida que el producto este en el carrito comparando el texto
		//System.out.println(arg1);

		juancamilo.should(seeThat(ValidarProducto.enElCarrito(),equalTo("Led 43\" Ultra HD Ai Smart TV - 43UK6200PSA")));
	}*/
	
	@Then("^Deberia ver el pruducto '(.*)' agregado en el carrito de compras$")
	public void deberiaVerElPruductoAgregadoEnElCarritoDeCompras(String arg1) throws Exception {
		//Se valida que el producto este en el carrito comparando el texto
		System.out.println(arg1);//se imprime el parametro que se evia desde elFeature para validar que si se este generando corrcetamente
		
		//se llama al metodo enElCarrito, el cual extrae el nombre del producto agregado al carrito
		//se compara con el nombre que se le envia desde el Feature validando asi que el producto si este en el carrito de compras
		juancamilo.should(seeThat(ValidarProducto.enElCarrito(),equalTo(arg1)));
	}
	

	
}
