package Page;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class MaisonConnect {
	@FindBy (xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> ListProcuct;
	@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement VerifProduct;
	
	public MaisonConnect (){
		PageFactory.initElements(Config.driver, this);
	}
	
	public void VerifProdct (String NameProduct) throws Exception {
		Thread.sleep(10000);
		try {
		for (WebElement Product:ListProcuct) {
			Config.attente(10);
			if(Product.getText().contains(NameProduct)) {
				Product.click();
			}
		}
		}catch (Exception e) { 
		}
	}
public String VerifPageProduct () {
	String ActualText = VerifProduct.getText();
			return ActualText;
}
}