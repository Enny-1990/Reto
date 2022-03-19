package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class paginaTransparencia {
	
	@FindBy (xpath = "//a[contains(text(),'5. Presupuesto.​')]" )
	private WebElement btnPresu;
	
	public void irPresupuesto() {
		btnPresu.click();		
	}

	public paginaTransparencia(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	

	
}
