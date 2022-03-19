package Prueba;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pageObjectModel.paginaInformancionFinanciera;
import pageObjectModel.paginaPrincipal;
import pageObjectModel.paginaTransparencia;


public class BaseTestSuite {

	protected WebDriver chromeDriver;
    paginaPrincipal PaginaPrincipal;
    paginaTransparencia PaginaTransparencia;
    paginaInformancionFinanciera PaginaInformancionFinanciera;
    
	private void inicializarPagina(WebDriver driver) {
		PaginaPrincipal = new paginaPrincipal(driver);
		PaginaTransparencia =  new paginaTransparencia(driver);
		PaginaInformancionFinanciera =  new paginaInformancionFinanciera(driver);
		
		
	}
	
	@Before
	public void  inicializarDriver() {
		//Encontrar archivo de Chrome Driver
				System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\Chrome\\chromedriver.exe");
				
				//Creamos opciones de nuestro driver
				ChromeOptions options = new ChromeOptions ();
				options.setCapability("marionette", false);
				
				//crear una nueva instancia de nuestro de navegador
				chromeDriver = new ChromeDriver(options);	
				
				//Definimos el tiempo de espera hasta que aceptemos un TimeOut
				chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Inicializando las paginas
				inicializarPagina(chromeDriver);				
	}
	
	@After
	public void cerrarDriver () {
		//chromeDriver.quit();
	}
	
	
	
}
