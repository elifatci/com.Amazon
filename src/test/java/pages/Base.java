package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public abstract class Base {

    public Base() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static AmazonPage amazonPage;
    public static Actions actions;
     public static JavascriptExecutor js ;


    public static void initialize() {
        amazonPage = new AmazonPage();
        actions=new Actions(Driver.getDriver());
        js= (JavascriptExecutor) Driver.getDriver();
    }
}
