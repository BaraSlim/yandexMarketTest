package steps;

import org.openqa.selenium.WebDriver;
import pages.YaMainPage;
import pages.YaMarketMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YaMarketMainPageSteps {
    WebDriver driver = BaseSteps.getDriver();
YaMarketMainPage yaMarketMainPage = new YaMarketMainPage();


    @Step("Выбрать раздел Электроника")
    public void choosCategory(String categoryItem){
        yaMarketMainPage.selectMarketMenuItem(categoryItem);
    }
}
