package TestSuit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.PanierX;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PanierXStepDef {
	@Given("utilisateur est sur la page de produit")
	public void utilisateur_est_sur_la_page_de_produit() throws Exception {
	    Config.ConfChrome();
	    Config.driver = new ChromeDriver();
	    Config.MaximasWindow();
	    String url ="https://mistore.com.tn/product/mi-temperature-and-humidity-monitor-pro/";
		Config.driver.get(url);
	    
	}

	@When("utilisateur clique sur le bouton ajouter au panier puis clique sur le panier")
	public void utilisateur_clique_sur_le_bouton_ajouter_au_panier_puis_clique_sur_le_panier() throws Exception {
		PanierX ProduitX =new PanierX ();
		ProduitX.AjoutPanier();
		ProduitX.BtnPanier();
	}

	@Then("le produit est dans le panier et contient le nom de {string}")
	public void le_produit_est_dans_le_panier_et_contient_le_nom_de(String expactedText) throws Exception {
		PanierX ProduitX =new PanierX ();
		String ActualText = ProduitX.NameProduct();
		Assert.assertEquals(expactedText, ActualText);
		Config.driver.quit();
	
	}


}
