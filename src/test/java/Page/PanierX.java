package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class PanierX {
	@FindBy (xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
WebElement BtnAjoutPanier;
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/a/span/span")
	WebElement BtnPanier;
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/ul/li/div[2]/a[1]/span")
	WebElement VerifPanier;

public PanierX () {
	PageFactory.initElements(Config.driver,this);
}
public void AjoutPanier () throws Exception {
	Thread.sleep(6000);
	BtnAjoutPanier.click();
}
public void BtnPanier () throws Exception {
	Thread.sleep(10000);
	BtnPanier.click();
}

public String NameProduct () throws Exception {
	Thread.sleep(6000);
	String actualText = VerifPanier.getText();
	 return actualText; }
	
}
