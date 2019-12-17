package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ConfigureFilterPage {
    WebDriver driver = BaseSteps.getDriver();
    Actions actionBuilder = new Actions(driver);

    public ConfigureFilterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class = 'title__content']")
    WebElement filterBlock;

    @FindBy(xpath = "//input[@id= 'glf-pricefrom-var']")
    WebElement priceFrom;

    @FindBy(xpath = "//input[@id= 'glf-priceto-var']")
    WebElement priceTo;

    @FindBy(xpath = "//label[@class = 'checkbox__label']")
    WebElement producerListItem;

    @FindBy(xpath = "//div[@data-filter-id='7893318']//span[contains(text(),'Показать всё')]")
    WebElement openAllProducerBtn;

    @FindBy(xpath = "//a[@role = 'button' and @type = 'button']//span[contains(text(), 'Показать подходящие')]")
    WebElement filterApplyBtn;

    // Установка курсора на интересующий блок (цена, производитель..)
    public void chooseFilterBlock(String blockName) {
        actionBuilder.click(filterBlock.findElement(By.xpath("[contains(text(), '" + blockName + "')]")));
    }

    // Выбор ранга стоимости
    public void setPriceRange(String from, String to) {
        actionBuilder.click(priceFrom).sendKeys(from);
        actionBuilder.click(priceTo).sendKeys(to);
    }

    // Выбор производителей
    public void chooseAllProducer(String[] producerNames) {
        actionBuilder.click(openAllProducerBtn);
        for (int i = 0; i < producerNames.length; i++) {
            actionBuilder.click(producerListItem.findElement(By.xpath("[contains(text(), '" + producerNames[i] + "')]")));
        }
    }

    // Подтверждение применения фильтра
    public void applyingFilters() {
        actionBuilder.click(filterApplyBtn);
    }

}


