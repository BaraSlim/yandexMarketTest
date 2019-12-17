package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class YaElectronicaTVPage {
    WebDriver driver = BaseSteps.getDriver();
    Actions actionBuilder = new Actions(driver);

    public YaElectronicaTVPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Все фильтры')]")
    WebElement allFiltersBtn;

    @FindBy(xpath = "//div[@id = 'uniq157606814691810']")
    WebElement show48Item;

    @FindBy(xpath = "//div[@id = 'uniq15760681469189']")
    WebElement show12Item;

    @FindBy(xpath = "//button[@role = 'listbox' and @type = 'button']")
    WebElement showItemSwitchBtn;

    @FindBy(xpath = "//div[@data-id]//a//img[@class='image']")
    WebElement productList;

    @FindBy(xpath = "//div[@data-id]")
    WebElement someItem;


    // Развернуть все фильтры
    public void openAllFilters() {
        actionBuilder.click(allFiltersBtn);
    }
    // Изменить кол-во позиций на странице
    public void changeProductPageSize(int size) {
        actionBuilder.click(showItemSwitchBtn);
        switch (size) {
            case (12):
                actionBuilder.click(show12Item);
                break;
            case (48):
                actionBuilder.click(show48Item);
                break;
        }
    }
// Запомнить название первого элемента в списке
    public void chooseSomeItem(int itemNumber){
        String itemName = driver.findElement(By.xpath("//div[@data-id]["+itemNumber+"]"))
                .findElement(By.xpath("//a//img")).getAttribute("title");

    }
}
