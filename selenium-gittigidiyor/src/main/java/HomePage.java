import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass{
    //private static String url = "http://www.google.com/";

    Locators items = new Locators();
    Users users = new Users();
    String girisButonu = items.loginButtonXpath;
    String uyeKayitButonu = items.signInButtonXpath;
    String mailTextBox = items.mailTextboxId;
    String passTextBox = items.passTextboxId;
    String confirmButton = items.confirmButtonId;

    String loginPage = "https://www.gittigidiyor.com/uye-girisi";

    //Actions action = new Actions(driver);
    //WebElement we = driver.findElement(By.xpath("/html/body/div[2]/header/div[3]/div/div[1]/div/div[3]/div/div[1]"));


    public void getLogin()
    {
        //action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/expression-here"))).click().build().perform();
        //driver.findElement(By.id(girisButonu)).click();
        driver.get(loginPage);
        driver.findElement(By.id(mailTextBox)).sendKeys(users.mailAdress);
        driver.findElement(By.id(passTextBox)).sendKeys(users.password);
        driver.findElement(By.id(confirmButton)).click();
        //wait.until(elementClickableById(btnLogin));
    }
    public HomePage(WebDriver driver){
        super(driver);
    }

//    @FindBy(className = "btnSignIn")
//    private WebElement btnSignIn;
//
//    @FindBy(className = "btnLogin")
//    private WebElement btnLogin;
//




//    public String getUrl(){
//        return url;
//    }




}
