

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BaseClass {


    private Locators items = new Locators();
    String aramaKutusu = items.searchBarXpath;
    String searchButon = items.searchButtonXpath;


    public void aramaIslemi(String aramaKelimesi){

        driver.findElement(By.xpath(aramaKutusu)).sendKeys(aramaKelimesi);
        //driver.findElement(By.id(mailTextBox)).sendKeys(users.mailAdress);
        driver.findElement(By.xpath(searchButon)).click();

    }







//    @FindBy(id = "searchData")
//    private WebElement searchData;



//    @FindBy(xpath = aramaKutusu )
//    private WebElement searchBar;

    //@FindBy(xpath = "searchButon")


//    public void enterDataForSearch(String data) {
//        this.searchData.clear();
//        this.searchData.sendKeys(data);
//    }











    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
