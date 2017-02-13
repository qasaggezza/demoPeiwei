package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Extras extends PeiweiWrappers {

	public Extras() {
		if(!verifyTitle("Extras | Order | Menu | Pei Wei Asian Diner")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public Extras enterLettuce(String data) {
		enterByXpath(prop.getProperty("Extras.Lettuce.XPath"), data);
		return this;	
		
	}
	public Extras clickLettuceAddToOrder() {
		clickByXpath(prop.getProperty("Extras.LettuceAddToOrder.XPath"));
		return this;	
		
	}
	
	public Extras selectRice(String data) {
		selectByXpath(prop.getProperty("Extras.Rice.XPath"), data);
		return this;	
		
	}
	
	public Extras enterQuan(String data) {
		enterByXpath(prop.getProperty("Extras.riceQuantity.XPath"), data);
		return this;	
		
	}
	
	public Extras enterSnicker(String data) {
		enterByXpath(prop.getProperty("Extras.SnickerdoodleQuantity.XPath"), data);
		return this;	
		
	}
	
	public Extras enterChocoChip(String data) {
		enterByXpath(prop.getProperty("Extras.ChocolateChipCookieQuantity.XPath"), data);
		return this;	
		
	}
	
	public Extras enterSteamedVeg(String data) {
		enterByXpath(prop.getProperty("Extras.SteamedVegetableQuantity.XPath"), data);
		return this;	
		
	}
	
	public Extras clickRiceAddToOrder() {
		clickByXpath(prop.getProperty("Extras.riceAddToOrder.XPath"));
		return this;	
		
	}
	
	public Extras clickChocoAddToOrder() {
		clickByXpath(prop.getProperty("Extras.ChocolateChipCookieAddToOrder.XPath"));
		return this;	
		
	}
	
	public Extras clickSteamedVegAddToOrder() {
		clickByXpath(prop.getProperty("Extras.SteamedVegetableAddToOrder.XPath"));
		return this;	
		
	}
	
	public CheckOut clickCheckOut() throws InterruptedException {
		clickByXpath(prop.getProperty("Extras.CheckOut.XPath"));
		//Thread.sleep(3000);
		return new CheckOut();	
		
	}
	
	public Extras clickQuinoaAddToFavorite() {
		clickByXpath(prop.getProperty("Extras.quinoaFavorite.XPath"));
		return this;	

		}
	
	public Extras getTotal() {
		getTextByXpath(prop.getProperty("Extras.Total4.XPath"));
		return new Extras();	
		
	}
	
	
	
}
