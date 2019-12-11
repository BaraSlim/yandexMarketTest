package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class YaMainPage {
    WebDriver driver = BaseSteps.getDriver();
    Actions builder = new Actions(driver);

    public YaMainPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@role = 'navigation']")
    WebElement searchTabs;

    @FindBy(xpath = "//a[contains( text(), 'Маркет')]")
    WebElement marketTab;

    public void selectMainMenuItem(String itemName) {
        builder.click(searchTabs.findElement(By.xpath("//a[contains( text(), '" + itemName + "')]")));
    }
}
