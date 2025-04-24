package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageHome_Products_Object;
import pageObject.PageSignUp_Login_Object;

public class Ct_Register_User2 {
	
	WebDriver driver = SetUp.driver;
	PageHome_Products_Object home = new PageHome_Products_Object(driver);
	PageSignUp_Login_Object sign = new PageSignUp_Login_Object(driver); 


@Then("Verifier que Login your account {string} est visible")
public void verifier_que_login_your_account_est_visible(String string) {
	Assert.assertEquals(sign.Login_your_account(),string);
   
}

@When("Entrer correctement email address {string} et password {string}")
public void entrer_correctement_email_address_et_password(String string, String string2) {
   sign.Entrer_mail_et_mot_de_passe(string, string2);
}

@When("Cliquer sur boutton login {string}")
public void cliquer_sur_boutton_login(String string) {
	sign.cliquer_sur_boutton_login();
	
  }
}