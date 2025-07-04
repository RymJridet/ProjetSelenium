package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHome_Products_Object {

    public WebDriver driver;

    /***************** création d'un constructeur *************************************/
    public PageHome_Products_Object(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /***************** Identification des éléments (design pattern) *************************************/
    @FindBy(how = How.XPATH, using = "//a[@href='/']")
    public WebElement Titre;

    @FindBy(how = How.XPATH, using = "//a[@href='/login']")
    WebElement bt_SignupLogin;

    @FindBy(how = How.XPATH, using = "//a[@href='/products']")
    WebElement bt_product;

    @FindBy(how = How.XPATH, using = "//div[@class='productinfo text-center']")
    WebElement bt_prod_1;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Add to cart')])[1]")
    WebElement bt_add1;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue Shopping']")
    WebElement bt_continue_shopping;

    @FindBy(how = How.XPATH, using = "(//div[@class='productinfo text-center'])[2]")
    WebElement bt_prod_2;

    @FindBy(how = How.XPATH, using = "(//a[contains(text(),'Add to cart')])[4]")
    WebElement bt_add2;

    @FindBy(how = How.XPATH, using = "//u[normalize-space()='View Cart']")
    WebElement bt_view_cart;

    /***************** Création des méthodes *************************************/
    public void acceder_a_URL(String Url) {
        driver.get(Url);
    }

    public void cliquer_sur_le_bouton_SingnUpLogin() {
        bt_SignupLogin.click();
    }

    public void cliquer_sur_bouton_products() {
        bt_product.click();
    }

    public void survolez_le_premier_produit() {
        Actions action = new Actions(driver);
        action.moveToElement(bt_prod_1).build().perform();
    }

    public void ajouter_le_premier_produit() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(bt_add1));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public void continue_le_shopping() {
        bt_continue_shopping.click();
    }

    public void survolez_le_deuxième_produit() {
        Actions action = new Actions(driver);
        action.moveToElement(bt_prod_2).build().perform();
    }

    public void ajouter_le_deuxième_produit() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(bt_add2));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public void cliquer_sur_view_cart() {
        bt_view_cart.click();
    }
}
