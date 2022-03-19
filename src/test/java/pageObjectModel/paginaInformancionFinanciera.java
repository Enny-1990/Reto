package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paginaInformancionFinanciera {
	@FindBy (xpath = "//body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']/div[@id='contentRow']/div[@id='contentBox']/div[@id='DeltaPlaceHolderMain']/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]" )
	private WebElement btnEstFinan;
	
	@FindBy (xpath = "//body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']/div[@id='contentRow']/div[@id='contentBox']/div[@id='DeltaPlaceHolderMain']/div[@id='historicos']/div[2]/div[2]/div[2]/div[2]/div[2]/h3[1]" )
	private WebElement btnbalance;
	
	@FindBy (xpath = "//body/form[@id='aspnetForm']/div[@id='s4-workspace']/div[@id='s4-bodyContainer']/div[@id='contentRow']/div[@id='contentBox']/div[@id='DeltaPlaceHolderMain']/div[@id='historicos']/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[2]/img[1]" )
	private WebElement btnDescargar;
	
	
	public void irEstadoFinanciero() {
		btnEstFinan.click();
	}
	
	public void irBalance() {
		btnbalance.click();
	}
	
	public void descargarPDF() {
		btnDescargar.click();
	}
	
	public paginaInformancionFinanciera(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
