package steps;

import org.openqa.selenium.WebDriver;
import pages.YaElectronicaMarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YaElectronicaMarketPageSteps {
    WebDriver driver = BaseSteps.getDriver();
    YaElectronicaMarketPage yaElectronicaMarketPage = new YaElectronicaMarketPage();

    @Step("Выбрать раздел Телевизоры")
    public void chooseMenuItem(String menuItem){
     yaElectronicaMarketPage.selectElectronicaMenuItem(menuItem);
    }
}
