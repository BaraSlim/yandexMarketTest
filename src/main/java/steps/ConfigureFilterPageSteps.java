package steps;

import pages.ConfigureFilterPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ConfigureFilterPageSteps {

    ConfigureFilterPage configureFilterPage = new ConfigureFilterPage();

    @Step("Задать параметр поиска от 20000 рублей.")
    public void moneyFilter(String from, String to) {
        configureFilterPage.chooseFilterBlock("Цена");
        configureFilterPage.choosePrice(from, to);
    }

    @Step("Выбрать производителей Samsung и LG")
    public void producerFilter(String[] producerNames) {
        configureFilterPage.chooseFilterBlock("Производитель");
        configureFilterPage.chooseProducer(producerNames);
    }
    @Step("Нажать кнопку Применить.")
    public void submitFilters(){
        configureFilterPage.submitFilters();
    }
}
