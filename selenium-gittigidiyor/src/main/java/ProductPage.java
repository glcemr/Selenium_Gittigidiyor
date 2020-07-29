import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BaseClass{

    Locators items = new Locators();

    String sepeteEkleButonuId = items.addBasketButtonId;
    String SepeteEkleButonuXpath = items.addBasketButtonXpath;

    String productPage = "https://www.gittigidiyor.com/beyaz-esya/camasir-makinesi/vestel-cmi-9812_spp_757143?id=404312665";

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addBasket(){
        driver.get(productPage);
        driver.findElement(By.id(sepeteEkleButonuId)).click();

    }
}
