
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class pandora {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//sude//selenium//selenium jars and drivers//drivers//chromedrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

////   ANA SAYFAYI ACMA
        //siteye git
        driver.get("https://tr.pandora.net/");
        //tam ekran yap
        driver.manage().window().maximize();
        //cookie leri kabul et
        WebElement accept = driver.findElement(By.id("onetrust-accept-btn-handler"));
        accept.click();
        //hesaba giriş yapa bas
        WebElement login=driver.findElement(By.cssSelector(".user"));
        login.click();

////   HESABA GIRIS YAPMA
        // e posta gir
        WebElement enterEmail=driver.findElement(By.id("login-form-email"));
        enterEmail.click();
        enterEmail.sendKeys("sudesaffak@hotmail.com");
        //sifre gir
        WebElement password= driver.findElement(By.id("login-form-password"));
        password.click();
        password.sendKeys("I50h45nS913.");
        // oturum aca bas
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement loginButton= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'btn-block btn-secondary')]")));
        loginButton.click();


////   URUN ARAMASI YAPMA
        //küpelere git
        WebElement earings=wait.until(ExpectedConditions.elementToBeClickable(By.id("earrings-main")));
        earings.click();
        //ürün ara
        WebElement search =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-field")));
        search.click();
        search.sendKeys("küpe");
        //ilk çıkan ürüne git
        WebElement urunSec = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/span[contains(@class,'name')]")));
        urunSec.click();



////   ALISVERIS YAPMA
        //ürünü favorile
        WebElement favorite=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/a[contains(@class,'wishlist-icon js-wishlist-icon')]")));
        favorite.click();
        // ürünü sepete ekle
        WebElement addCart = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".add-to-cart-btn-text")));
        addCart.click();
        //sepete git
        WebElement goCart = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".minicart-link")));
        goCart.click();
        driver.quit();



    }
}