package Page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageX {
	@FindBy (xpath ="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> Menus; 
	
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[2]/h4")
	List<WebElement> SubMenus;
	
	@FindBy (xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement VerifsubMenu;
	
	public HomePageX () { 
		PageFactory.initElements(Config.driver, this);
	}
	
	public void  ClikSubMenu ( String MenuName ,String SubMenuName) throws Exception {
		Thread.sleep(8000);
		try {
	for (WebElement Menu:Menus) {
		if (Menu.getText().contains(MenuName)) {
			Config.attente(10);
			Config.action  = new Actions (Config.driver);
			Config.action.moveToElement(Menu).perform();

			for (WebElement Submenu:SubMenus) {
				if (Submenu.getText().contains(SubMenuName)) {
					Config.attente(10);
				
					Submenu.click();
				}	}
		}
} 
		}catch (Exception e) { 
	}}
	public String VerifPageSubMenu () {
		String ActualText = VerifsubMenu.getText();
				return ActualText ;
	}
}