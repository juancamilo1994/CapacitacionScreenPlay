package pe.com.tottus.capacitacion.agregarproductohacarritodecompras.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class PaginaDeProductos extends PageObject{

	//Mapea el boton agregar, el boton de desplegar el carrito de compras y el nombre del producto agregado al carrito
	public static final Target btnAgregar = Target.the("Boton agregar").located(By.id("atg_behavior_addItemToCart_41876670"));
	public static final Target btnCarrito = Target.the("Boton del carrito").located(By.id("atg_store_cart_total"));
	public static final Target nombreProducto = Target.the("Nombre del producto en el carrito").locatedBy("//div[@id='selected-product']/div[@href='/browse/productDetailSingleSku.jsp?atg.multisite.remap=false&productId=41876670']");
	
}
