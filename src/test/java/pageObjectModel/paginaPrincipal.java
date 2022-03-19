package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class paginaPrincipal {
	@FindBy (xpath = "//body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']/div[2]/div[4]/nav[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]" )
	private WebElement btnTrans;
	
	public void iniciarPrueba()  {	
		btnTrans.click();	
	}
		
	public paginaPrincipal(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
}
