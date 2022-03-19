package Prueba;

import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class pruebaTest extends BaseTestSuite {
	
	@Test	
	public void prueba() {		
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://www.aerocivil.gov.co/");
		
		//La página carga muy lento y los webelements no cargan a tiempo
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PaginaPrincipal.iniciarPrueba();
		
		//La página carga muy lento y los webelements no cargan a tiempo
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		PaginaTransparencia.irPresupuesto();
		
		//La página carga muy lento y los webelements no cargan a tiemp0	
		
		String originalWindow = chromeDriver.getWindowHandle();
		//Se hace cambio de pestaña.
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for (String windowHandle : chromeDriver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		    	chromeDriver.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		PaginaInformancionFinanciera.irEstadoFinanciero();
		chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		PaginaInformancionFinanciera.irBalance();
		chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		PaginaInformancionFinanciera.descargarPDF();
		
	}
	
		
}
