package TestSuit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.HomePageX;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageXStepDef {
	@Given("utilisateur sur la page Home Page")
	public void utilisateur_sur_la_page_home_page() throws Exception {
		Config.ConfChrome();
		Config.driver = new ChromeDriver ();
		Config.MaximasWindow();
		Config.driver.get(Utils.getproprety("Web_Portail_Link"));
	}

	@When("utilisateur survole sur {string} puis clique sur {string}")
	public void utilisateur_survole_sur_puis_clique_sur(String menu, String sousMenu) throws Exception {
		HomePageX Home = new HomePageX ();
		Home.ClikSubMenu(menu, sousMenu);
	}

	@Then("la page de sous menu s affiche et qui contient le nom de sous menu {string}")
	public void la_page_de_sous_menu_s_affiche_et_qui_contient_le_nom_de_sous_menu(String ExpactedText) {
		HomePageX Home = new HomePageX ();
		String ActualText = Home.VerifPageSubMenu();
		Assert.assertEquals(ExpactedText, ActualText);
	    	}

}
