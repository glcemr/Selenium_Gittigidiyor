

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Configs {

    protected static WebDriver driver;
    private static String url = "http://www.gittigidiyor.com/";

    @BeforeClass
    public static void before() {
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Emre\\Desktop\\SeleniumWebAutomation-master\\SeleniumAppDemo\\geckodriver.exe");
        //WebDriver driver2 = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterClass
    public static void after() throws InterruptedException {
        Thread.sleep(3000);
    }
    public WebDriver getDriver() {
        return driver;
    }

}
