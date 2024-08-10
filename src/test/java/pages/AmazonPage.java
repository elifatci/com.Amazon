package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class AmazonPage extends Base {

    @FindBy(id = "nav-logo-sprites")
    public WebElement logo;

    @FindBy(id = "sp-cc-accept")
    public WebElement cookie;

    @FindBy(css = "#twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//*[text()='Sonuçlar']")
    public WebElement textSonuclar;

    @FindBy(xpath = "(//*[@class='s-pagination-item s-pagination-button'])[1]")
    public WebElement iconSayfa;

    @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement textIkinciSayfa;

    @FindBy(xpath = "(//*[@data-component-type='s-search-result'])[21]")
    public WebElement product;

    @FindBy(id = "titleSection")
    public WebElement productDetail;

    @FindBy(name = "submit.add-to-cart")
    public WebElement iconSepeteEkle;
}
