import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases extends Configs {

    HomePage homePage = new HomePage(driver);
    SearchPage searchPage = new SearchPage(driver);
    ProductPage productPage = new ProductPage(driver);

    @Test // Kullanıcı girişi test
    public void loginTest(){

        homePage.getLogin();

    }

    @Test  // Ürün arama test
    public void searchTest(){

        searchPage.aramaIslemi("bilgisayar");

    }



    @Test  // Ana sayfada ki ürünleri çekme
    public void homePageAdd(){

    }

    @Test  // Ürünü sepete ekleme
    public void addCart (){
        productPage.addBasket();

    }




//    Gittigidiyor web sitesine için Selenium kullanarak aşağıdaki testleri yazmanızı istiyorum.
//
//    Kullanıcı giriş
//    Ürün arama
//    Anasayfadaki ürünleri çekme
//    Ürünü sepete ekleme
//
//    Burada object oriented mantigi bizim icin önemli. BaseTest üzerinden inheritance kullanmaniz gerekiyor.
//    Testlerin hepsinin calisiyor olmasini bekliyoruz. Abstraction kullanabileceğiniz bir ornek bekliyorum yine.



}
