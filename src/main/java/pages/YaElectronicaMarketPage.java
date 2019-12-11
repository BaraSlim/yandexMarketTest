package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class YaElectronicaMarketPage {
    WebDriver driver = BaseSteps.getDriver();
    Actions actionBuilder = new Actions(driver);
    public YaElectronicaMarketPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(), 'Умный дом')]")
    WebElement selectItemTab;

    @FindBy(xpath = "//div[@data-apiary-widget-name ='@MarketNode/NavigationTree']")
    WebElement stuffNavBar;

    public void selectElectronicaMenuItem(String itemName){
     actionBuilder.click(selectItemTab.findElement(By.xpath("//a[contains(text(), '"+itemName+"')]")));
    }
}

