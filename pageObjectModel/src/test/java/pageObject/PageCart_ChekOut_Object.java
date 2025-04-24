package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageCart_ChekOut_Object {
	
	public WebDriver driver;
	
	/*****************creation d'un constructeur*************************************/

	public PageCart_ChekOut_Object(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*****************Identifications des elemets (design pattern)*************************************/

    @FindBy ( how = How.XPATH, using = "//tr[@id='product-1']//td[@class='cart_product']")
    public WebElement prod_1;
    
    @FindBy ( how = How.XPATH, using = "//tr[@id='product-2']//td[@class='cart_product']")
    public WebElement prod_2; 
    
    @FindBy ( how = How.XPATH, using = "//td[@class='cart_price']//p[contains(text(),'Rs. 500')]")
    WebElement prix_prod_1;
    
    @FindBy ( how = How.XPATH, using = "//td[@class='cart_price']//p[contains(text(),'Rs. 400')]")
    WebElement prix_prod_2;
    
    @FindBy ( how = How.XPATH, using = "//button[@class='disabled']")
    WebElement qt_prod_1;
    
    @FindBy ( how = How.XPATH, using = "//button[@class='disabled'][1]")
    WebElement qt_prod_2;
    
    @FindBy ( how = How.XPATH, using = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']")
    WebElement total_prod_1;
    
    @FindBy ( how = How.XPATH, using = "//p[@class='cart_total_price'][normalize-space()='Rs. 400']")
    WebElement total_prod_2;
	
	/*****************creation des methodes*************************************/
    
    public String verif_prix_premier_produit() {
    	String txt_prix_prod1 = prix_prod_1.getText();
		return txt_prix_prod1; 
    }
     
    public String verif_prix_deuxième_produit() {
		String txt_prix_prod2 = prix_prod_2.getText();
		return txt_prix_prod2 ; 
    }
    
    public String verif_quantité_de_premier_produit() {
    	String txt_qt_prod1 = qt_prod_1.getText();
		return txt_qt_prod1; 
    }
    
    public String verif_quantité_de_deuxième_produit() {
    	String txt_qt_prod2 = qt_prod_2.getText();
		return txt_qt_prod2; 
    }
    
    public String verif_total_prix_premier_produit() {
    	String txt_total_prod1 = total_prod_1.getText();
		return txt_total_prod1; 
    }
    
    public String verif_total_prix_deuxième_produit() {
    	String txt_total_prod2 = total_prod_2.getText();
		return txt_total_prod2;  
    }
    
}
