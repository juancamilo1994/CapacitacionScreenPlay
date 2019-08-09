package co.com.google.capacitacion.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReservaVuelo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Chrome\\chromedriver.exe"); // se especifica la propiedad y el valor del driver
		WebDriver juanCamilo = new ChromeDriver(); //creacion del objeto de tipo de WebDriver y con el constructor del chrome se inicializa
		juanCamilo.manage().window().maximize();//maximizar pantalla
		WebDriverWait wait=new WebDriverWait(juanCamilo, 50);//tiempo de espera explicito
		juanCamilo.get("http://newtours.demoaut.com/mercurywelcome.php");//Abre el navegador en la ruta especifica
		
		
		juanCamilo.findElement(By.name("userName")).sendKeys("juancamilo");//ingresar el nombre de usuario
		juanCamilo.findElement(By.name("password")).sendKeys("123456789");//ingresar contraseña
		
		juanCamilo.findElement(By.name("login")).click();
		
		//elemento paa esperar hasta que cargue el formulario
		WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table//form[@name='findflight']/table/tbody/tr[2]/td[2]//font/input[2]")));
		radio.click();
		
		//juanCamilo.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table//form[@name='findflight']/table/tbody/tr[2]/td[2]//font/input[2]")).click();;
		
		
		Select pasajeros = new Select (juanCamilo.findElement(By.name("passCount")));//almacena los datos que tiene la lista
		pasajeros.selectByVisibleText("2");//escoger el dato de la lista
		
	
		Select origen = new Select (juanCamilo.findElement(By.name("fromPort")));//almacena los datos que tiene la lista
		origen.selectByVisibleText("New York");//escoger el dato de la lista
		
		Select origenMes = new Select (juanCamilo.findElement(By.name("fromMonth")));//almacena los datos que tiene la lista
		origenMes.selectByVisibleText("November");//escoger el dato de la lista
		
		Select origenDia = new Select (juanCamilo.findElement(By.name("fromDay")));//almacena los datos que tiene la lista
		origenDia.selectByVisibleText("24");//escoger el dato de la lista
		
		
		Select destino = new Select (juanCamilo.findElement(By.name("toPort")));//almacena los datos que tiene la lista
		destino.selectByVisibleText("Paris");//escoger el dato de la lista
		
		Select destinoMes = new Select (juanCamilo.findElement(By.name("toMonth")));//almacena los datos que tiene la lista
		destinoMes.selectByVisibleText("December");//escoger el dato de la lista
		
		Select destinoDia = new Select (juanCamilo.findElement(By.name("toDay")));//almacena los datos que tiene la lista
		destinoDia.selectByVisibleText("11");//escoger el dato de la lista
		
		juanCamilo.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table//form[@name='findflight']/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();// selecciona el servicio
		
		
		Select aerolinea = new Select (juanCamilo.findElement(By.name("airline")));//almacena los datos que tiene la lista
		aerolinea.selectByVisibleText("Unified Airlines");//escoger el dato de la lista
		
		juanCamilo.findElement(By.name("findFlights")).click();//Clic en el boton continuar
		
		
		juanCamilo.findElement(By.name("outFlight")).click();// selecciona el vuelo ida
		juanCamilo.findElement(By.name("inFlight")).click();// selecciona el vuelo vuelta
		
		
		
		juanCamilo.findElement(By.name("reserveFlights")).click();//Clic en el boton continuar
		
		
		//Formulario
		
		juanCamilo.findElement(By.name("passFirst0")).sendKeys("Juan");//nombre
		juanCamilo.findElement(By.name("passLast0")).sendKeys("Martinez");//apellido		
		Select primerComida = new Select (juanCamilo.findElement(By.name("pass.0.meal")));//almacena los datos que tiene la lista
		primerComida.selectByVisibleText("Low Calorie");//escoger el dato de la lista
		
		
		juanCamilo.findElement(By.name("passFirst1")).sendKeys("Juan");//nombre
		juanCamilo.findElement(By.name("passLast1")).sendKeys("Martinez");//apellido		
		Select segundaComida = new Select (juanCamilo.findElement(By.name("pass.1.meal")));//almacena los datos que tiene la lista
		segundaComida.selectByVisibleText("Muslim");//escoger el dato de la lista
		
		Select card = new Select (juanCamilo.findElement(By.name("creditCard")));//almacena los datos que tiene la lista
		card.selectByVisibleText("Visa");//escoger el dato de la lista
		
		juanCamilo.findElement(By.name("creditnumber")).sendKeys("135792468");//numero de carta
		
		
		Select mesExpedicion = new Select (juanCamilo.findElement(By.name("cc_exp_dt_mn")));//almacena los datos que tiene la lista
		mesExpedicion.selectByVisibleText("06");//escoger el dato de la lista
		
		Select diaExpedicion = new Select (juanCamilo.findElement(By.name("cc_exp_dt_yr")));//almacena los datos que tiene la lista
		diaExpedicion.selectByVisibleText("2007");//escoger el dato de la lista	
		
		juanCamilo.findElement(By.name("ticketLess")).click();
		
		
		
		juanCamilo.findElement(By.name("buyFlights")).click();//Clic en el boton continuar
		
		
		
		
		juanCamilo.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")).click();//Clic en el boton continuar
	}

}
