package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageSignUp_Login_Object {
	
	public WebDriver driver;
	
	/*****************creation d'un constructeur*************************************/

	public PageSignUp_Login_Object ( WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);  
      }
	
	/*****************Identifications des elemets (design pattern)*************************************/

	 @FindBy ( how = How.XPATH, using = "//h2[text()='New User Signup!']")
     WebElement New_User;
	 
	 @FindBy ( how = How.XPATH, using = "//input[@placeholder='Name']")
     WebElement txt_Name;
	 
	 @FindBy ( how = How.XPATH, using = "//input[@data-qa='signup-email']")
     public WebElement txt_Email;
	
	 @FindBy ( how = How.XPATH, using = "//button[normalize-space()='Signup']")
	 WebElement bt_Signup;
	 
	 @FindBy ( how = How.XPATH, using ="//h2[@class='title text-center']")
	 WebElement ENTER_ACCOUNT;
	 
	 @FindBy ( how = How.XPATH, using ="//label[@for='id_gender1']")
	 WebElement txt_title_Ms;
	 
	 @FindBy ( how = How.XPATH, using ="//input[@id='id_gender2']")
	 WebElement title_mme;
	 
	 @FindBy ( how = How.XPATH, using ="//input[@id='name']")
	 WebElement txt_name;
	 
	 @FindBy ( how = How.XPATH, using ="//input[@id='email']")
	 public WebElement txt_mail;
	 
	 @FindBy ( how = How.XPATH, using ="//input[@id='password']")
	 WebElement txt_password;
	 
	 @FindBy ( how = How.ID, using ="days")
	 WebElement Days;
	 
	 @FindBy ( how = How.ID, using ="months")
	 WebElement months;
	 
	 @FindBy ( how = How.ID, using ="years")
	 WebElement years;
	 
	 @FindBy ( how = How.XPATH, using ="//input[@type='checkbox']")
	 WebElement Sign_up;
	 
	 @FindBy ( how = How.XPATH, using ="//input[@type='checkbox']")
	 WebElement Receive; 
	 
	 @FindBy ( how = How.ID, using ="first_name")
	 WebElement First_name;
	 
	 @FindBy ( how = How.ID, using ="last_name")
	 WebElement last_name;
	 
	 @FindBy ( how = How.ID, using ="company")
	 WebElement company;

	 @FindBy ( how = How.ID, using ="address1")
	 WebElement adress1;

	 @FindBy ( how = How.ID, using ="address2")
	 WebElement adress2;

	 @FindBy ( how = How.ID, using ="country")
	 WebElement Country;

	 @FindBy ( how = How.ID, using ="state")
	 WebElement State;

	 @FindBy ( how = How.ID, using ="city")
	 WebElement City;

	 @FindBy ( how = How.ID, using ="zipcode")
	 WebElement Zipcode;

	 
	 @FindBy ( how = How.ID, using ="mobile_number")
	 WebElement Mobile_Number;

	 @FindBy ( how = How.XPATH, using ="//button[@class='btn btn-default']")
	 WebElement Bt_Create_Account; 
	 
	 @FindBy ( how = How.XPATH, using ="//h2[@class='title text-center']")
	 WebElement Account; 
	 
	 @FindBy ( how = How.XPATH, using ="//a[@class='btn btn-primary']")
	 WebElement bt_continue; 
	 
	 @FindBy ( how = How.XPATH, using ="//a[i[@class='fa fa-user']]")
	 WebElement User_name; 
	 
	 @FindBy ( how = How.XPATH, using ="//a[normalize-space()='Delete Account']")
	 WebElement bt_Delete_Account; 
	 
		/*****************creation des methodes*************************************/

	public String get_new_user() {
		String var = New_User.getText();
		return var;
	}
	
     public void saisir_un_user_name(String user) {
    	 txt_Name.sendKeys(user);
     }
     
     public void saisir_un_user_mail(String mail) {
 		txt_Email.sendKeys(mail);
     }
     
     public void cliquer_sur_le_bouton_SingnUp() {
    	 bt_Signup.click();
     }
     
     @FindBy ( how = How.XPATH, using = "//h2[normalize-space()='Login to your account']")
     WebElement account_login;
	 
     @FindBy ( how = How.XPATH, using = "//input[@data-qa='login-email']")
     WebElement Enter_mail;
     
     @FindBy ( how = How.XPATH, using = "//input[@placeholder='Password']")
     WebElement Enter_password;
     
     @FindBy ( how = How.XPATH, using = "//button[normalize-space()='Login']")
     WebElement bt_Login;
     
     public String get_ENTER_ACCOUNT() {
 		String ER = ENTER_ACCOUNT.getText();
 		return ER;
 	}
     
     public void remplir_formulaire_part_1(String sexe, String pass) {
    	if (sexe.equals("Ms")) {
    		txt_title_Ms.click();
    	}
    	else {
	    	title_mme.click();
		}
    	txt_password.sendKeys(pass);
     }
     
     public String verif_name() {
 		String N = txt_name.getAttribute("value");
 		return N;
 	}
     
     public String verif_mail() {
  		String M = txt_mail.getAttribute("value");
  		return M;
  	}
     public void selection_day(String day) {
        Select select_Day = new Select(Days);
		select_Day.selectByValue(day);
		
     }
     public void selection_month(String month) {
     Select select_month = new Select(months);
	 select_month.selectByVisibleText(month);
     }
		
     public void selection_year(String year) {
		Select select_year = new Select(years); 
		select_year.selectByValue(year);
     } 
     
     public void cliquer_sur_SingnUp() {
 		Sign_up.click();

     }
     
     public void cliquer_sur_Receive() {
    	 Receive.click();
     }
     
     public void remplir_part1(String F_Name, String L_Name, String comp, String addr1, String addr2 )
     {  First_name.sendKeys(F_Name);
		last_name.sendKeys(L_Name);
		company.sendKeys(comp);
		adress1.sendKeys(addr1);
		adress2.sendKeys(addr2);
     }
     
     public void remplir_part2(String state, String city, String zipcode, String mobile_number)
     {  State.sendKeys(state);
		City.sendKeys(city);
		Zipcode.sendKeys(zipcode);
		Mobile_Number.sendKeys(mobile_number);
     }
     public void Select_country(String country)
     {
     Select select_country = new Select(Country);
	 select_country.selectByVisibleText(country);
     }
     public void creation_account() {
    	 Bt_Create_Account.click(); 
     }
     public String New_ACCOUNT() {
    	String Account_Created = Account.getText();
  		return Account_Created;
  	}
     public void cliquer_sur_boutton_continue() {
 		bt_continue.click();

     }
     
     public String verif_compte() {
    	 String Logged =User_name.getText(); 
   		 return Logged;
   	}
     
   public void delet_account() {
		bt_Delete_Account.click();
   }
    
   public String Login_your_account() {
	   String txt_login = account_login.getText();
	   return txt_login;
   }
    public void Entrer_mail_et_mot_de_passe(String mail, String mot_de_passe) {
    	Enter_mail.sendKeys(mail);
    	Enter_password.sendKeys(mot_de_passe); 
    }
    
    public void cliquer_sur_boutton_login() {
		bt_Login.click(); 
    }      
   
}
     
