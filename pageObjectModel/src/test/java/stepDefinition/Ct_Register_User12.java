package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import hooks.SetUp;
import io.cucumber.java.en.*;
import pageObject.PageCart_ChekOut_Object;
import pageObject.PageHome_Products_Object;

public class Ct_Register_User12 {
	
	WebDriver driver = SetUp.driver;
	PageHome_Products_Object home = new PageHome_Products_Object(driver);
	PageCart_ChekOut_Object  cart = new PageCart_ChekOut_Object(driver);
	
	@When("Cliquer sur boutton Products")
	public void cliquer_sur_boutton_products() {
	   home.cliquer_sur_bouton_products();
	}

	@When("Survolez le premier produit")
	public void survolez_le_premier_produit() {
	    home.survolez_le_premier_produit();
	}

	@When("Cliquer sur Add to cart pour le premier produit")
	public void cliquer_sur_add_to_cart_pour_le_premier_produit() {
         home.ajouter_le_premier_produit();
	}

	@When("Cliquer sur boutton Continue Shopping")
	public void cliquer_sur_boutton_continue_shopping() {
	    home.continue_le_shopping();
	}

	@When("Survolez le deuxième produit")
	public void survolez_le_deuxième_produit() {
	   home.survolez_le_deuxième_produit();
	}

	@When("Cliquer sur Add to cart le deuxième produit")
	public void cliquer_sur_add_to_cart_le_deuxième_produit() {
        home.ajouter_le_deuxième_produit();
	}

	@When("Cliquer sur boutton View Cart")
	public void cliquer_sur_boutton_view_cart() {
	    home.cliquer_sur_view_cart();
	}

	@Then("Verifier que les deux produits sont ajoutés à la carte")
	public void verifier_que_les_deux_produits_sont_ajoutés_à_la_carte() {
		Assert.assertTrue(cart.prod_1.isDisplayed());
		Assert.assertTrue(cart.prod_2.isDisplayed());
	}

	@Then("Verifier leur prix {string}, {string}")
	public void verifier_leur_prix(String string, String string2) {
		Assert.assertEquals(cart.verif_prix_premier_produit(), string);
		Assert.assertEquals(cart.verif_prix_deuxième_produit(), string2);

	}

	@Then("Verifier leur quantites {string}")
	public void verifier_leur_quantites(String string) {
		Assert.assertEquals(cart.verif_quantité_de_premier_produit(), string);
		Assert.assertEquals(cart.verif_quantité_de_deuxième_produit(), string);

	}

	@Then("Verifier leur total prix {string}, {string}")
	public void verifier_leur_total_prix(String string, String string2) {
		Assert.assertEquals(cart.verif_total_prix_premier_produit(), string);
		Assert.assertEquals(cart.verif_total_prix_deuxième_produit(), string2);

	}


}
