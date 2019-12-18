package steps;

import org.openqa.selenium.WebDriver;
import pages.YaMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YaMainPageSteps {
    WebDriver driver = BaseSteps.getDriver();
    YaMainPage yaMainPage = new YaMainPage();

    @Step("Перейти в яндекс маркет")
    public void yaMarketChoose(String menuItem){
        yaMainPage.selectMainMenuItem(menuItem);
    }
}
