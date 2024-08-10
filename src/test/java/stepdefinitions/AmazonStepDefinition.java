package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.Base;
import utils.ConfigReader;
import utils.Driver;

import static org.junit.Assert.*;

public class AmazonStepDefinition extends Base {

    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Anasayfanin acildigi dogrulanir")
    public void anasayfanin_acildigi_dogrulanir() throws InterruptedException {
        amazonPage.cookie.click();
        Thread.sleep(2000);
        assertTrue(amazonPage.logo.isDisplayed());
    }

    @When("Searchboxa {string} yazilarak aratilir")
    public void searchboxa_yazilarak_aratilir(String text) {
        amazonPage.searchBox.sendKeys(ConfigReader.getProperty(text), Keys.ENTER);
    }

    @When("Acilan sayfada samsung icin sonuc bulundugu dogrulanir")
    public void acilan_sayfada_samsung_icin_sonuc_bulundugu_dogrulanir() {
        assertTrue(amazonPage.textSonuclar.isDisplayed());
    }

    @Then("İkinci sayfa ikonuna tiklanir")
    public void ikinci_sayfa_ikonuna_tiklanir() {
        js.executeScript("arguments[0].scrollIntoView(true);", amazonPage.iconSayfa);
        amazonPage.iconSayfa.click();
    }

    @Then("Acilan sayfanin ilgili sayfa oldugu dogrulanir")
    public void acilan_sayfanin_ilgili_sayfa_oldugu_dogrulanir() {
        assertTrue(amazonPage.textIkinciSayfa.isDisplayed());
    }

    @Then("Ustten besinci satir birinci sutundaki urune tiklanir")
    public void ustten_besinci_satir_birinci_sutundaki_urune_tiklanir() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(true);", amazonPage.product);
        amazonPage.product.click();
        Thread.sleep(1000);
    }

    @Then("Urun detay sayfasinin acildigi dogrulanir")
    public void urun_detay_sayfasinin_acildigi_dogrulanir() {
        assertTrue(amazonPage.productDetail.isDisplayed());
    }

    @Then("Urun sepete eklenir")
    public void urun_sepete_eklenir() {
        amazonPage.iconSepeteEkle.click();
    }

    @Then("Sepet sayfasinin acildigi dogrulanir")
    public void sepet_sayfasinin_acildigi_dogrulanir() {
        String expectedTitle="Amazon.com.tr Alışveriş Sepeti";
        String actualTitle=Driver.getDriver().getTitle();
        assertEquals(expectedTitle,actualTitle);
    }

    @Then("Logoya tiklanarak ana sayfaya geri donulur")
    public void logoya_tiklanarak_ana_sayfaya_geri_donulur() {
        amazonPage.logo.click();
    }

}
