package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class YaMarketMainPage {
    WebDriver driver = BaseSteps.getDriver();
    Actions actionBuilder = new Actions(driver);

    public YaMarketMainPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class = 'n-w-tabs__horizontal-tabs']")
    WebElement chooseBar;

    @FindBy(xpath = "//span[contains(text(), 'Электроника')]")
    WebElement electronicaTab;

    public void selectMarketMenuItem(String itemName) {
        actionBuilder.click(chooseBar.findElement(By.xpath("//span[contains(text(), '" + itemName + "')]")));

    }
}
