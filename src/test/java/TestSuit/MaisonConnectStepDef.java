package TestSuit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.MaisonConnect;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnectStepDef {

@Given("utilisateur est sur la page Maison Connect")
public void utilisateur_est_sur_la_page_maison_connect() throws Exception {
		Config.ConfChrome();
		Config.driver = new ChromeDriver () ;
		Config.MaximasWindow();
		String url ="https://mistore.com.tn/product-category/maison-connectee/";
		Config.driver.get(url);
		}

@When("utilisateur clique sur le {string}")
public void utilisateur_clique_sur_le(String Product) throws Exception {
	MaisonConnect Productt = new MaisonConnect ();
		Productt.VerifProdct(Product);
	
}

@Then("la page de produit s affiche qui contient le nom de {string}")
public void la_page_de_produit_s_affiche_qui_contient_le_nom_de(String expactedText) {
	MaisonConnect Productt = new MaisonConnect ();
	String ActualText = Productt.VerifPageProduct();
	Assert.assertEquals(expactedText, ActualText);
	Config.driver.quit();

} }
