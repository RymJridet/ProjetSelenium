package stepDefinition;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;
import pageObject.PageHome_Products_Object;
import pageObject.PageSignUp_Login_Object;

public class Ct_Register_User {
	
	// Modification légère pour test webhook GitHub avec Jenkins - 2025-06-07

	  WebDriver driver = SetUp.driver;
	  PageHome_Products_Object home = new PageHome_Products_Object(driver);
	  PageSignUp_Login_Object sign = new PageSignUp_Login_Object (driver);
	
	@Given("saisir url d automation exercice {string}")
	public void saisir_url_d_automation_exercice(String string) {
	  home.acceder_a_URL(string);
	}

	@Then("Verifier que Home page est visible et le couleur orange {string}")
	public void verifier_que_home_page_est_visible_et_le_couleur_orange(String string) {
		Assert.assertTrue(home.Titre.isDisplayed());
	}

	@When("Cliquer sur Signup \\/ Login boutton")
	public void cliquer_sur_signup_login_boutton() {
	  home.cliquer_sur_le_bouton_SingnUpLogin();
	}

	@Then("Verifier que New User Signup {string} est visible")
	public void verifier_que_new_user_signup_est_visible(String string) {
		Assert.assertEquals(sign.get_new_user(), string);  
	}

	@When("Entrer Name {string} and email address {string}")
	public void entrer_name_and_email_address(String string, String string2) {
	   sign.saisir_un_user_name(string);
	   sign.saisir_un_user_mail(string2);
	}

	@When("Cliquer Signup boutton")
	public void cliquer_signup_boutton() {
		sign.cliquer_sur_le_bouton_SingnUp();
	   
	}

	@Then("Verifier que ENTER ACCOUNT INFORMATION {string} est visible")
	public void verifier_que_enter_account_information_est_visible(String string) {
		Assert.assertEquals(sign.get_ENTER_ACCOUNT(), string); 
	}

	@When("Remplir de details: Title {string},Name {string},  email address {string}, Password {string}, Date of birth : date = {string}, month = {string}, year = {string}")
	public void remplir_de_details_title_name_email_address_password_date_of_birth_date_month_year(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	    sign.remplir_formulaire_part_1(string, string4);
		Assert.assertEquals(sign.verif_name(),string2);
		Assert.assertEquals(sign.verif_mail(),string3);
		
		Assert.assertFalse(sign.txt_mail.isEnabled());
	    
		sign.selection_day(string5);
	    sign.selection_month(string6);
	    sign.selection_year(string7);
	} 
	
	@When("Select checkbox Sign up for our newsletter! and Select checkbox Receive special offers from our partners!")
	public void select_checkbox_sign_up_for_our_newsletter_and_select_checkbox_receive_special_offers_from_our_partners() {
	    sign.cliquer_sur_SingnUp();
	    sign.cliquer_sur_Receive();
	}

	@When("Remplir de details: First name {string}, Last name {string}, Company {string}, Address {string}, Address2 {string}, Country {string}, State {string}, City {string}, Zipcode {string}, Mobile Number {string}")
	public void remplir_de_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
	   sign.remplir_part1(string, string2, string3, string4, string5);
	   sign.Select_country(string6);
	   sign.remplir_part2(string7, string8, string9, string10);
	}

	@When("Cliquer sur Create Account boutton")
	public void cliquer_sur_create_account_boutton() {
		sign.creation_account();  
	}

	@Then("Verifier que {string} est visible")
	public void verifier_que_est_visible(String string) {
		Assert.assertEquals(sign.New_ACCOUNT(), string);
	}

	@When("Cliquer sur Continue button")
	public void cliquer_sur_continue_button() {
	    sign.cliquer_sur_boutton_continue();
	}

	@Then("Verifier que Logged in as Rima {string} est visible")
	public void verifier_que_logged_in_as_rima_est_visible(String string) {
		Assert.assertEquals(sign.verif_compte(),string); 

	}

	@When("Cliquer sur Delete Account boutton")
	public void cliquer_sur_delete_account_boutton() {
	  sign.delet_account();  
	}


}
