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

    @FindBy(xpath = "//button[@role='listbox']")
    WebElement setProductPageSize;

    @FindBy(xpath = "//div[@id = 'uniq157606814691810']")
    WebElement show48Item;

    @FindBy(xpath = "//div[@id = 'uniq15760681469189']")
    WebElement show12Item;

    @FindBy(xpath = "//button[@role = 'listbox' and @type = 'button']")
    WebElement showItemSwitchBtn;

    @FindBy(xpath = "//div[@data-id]//a//img[@class='image']")
    WebElement productList;

    public void openAllFilters() {
        actionBuilder.click(allFiltersBtn);
    }

    public void changeProductPageSize(String size) {
        if (!(setProductPageSize.getText().equals("Показывать по " + size + ""))) {
            actionBuilder.click(showItemSwitchBtn);
            //расписать логику переключения кнопки с 48 на 12 мб switch
        }
    }
    public void getProductList(int number){


    }
}