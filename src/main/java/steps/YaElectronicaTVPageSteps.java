package steps;

import pages.YaElectronicaTVPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YaElectronicaTVPageSteps {
    YaElectronicaTVPage yaElectronicaTVPage = new YaElectronicaTVPage();

    @Step("Зайти в расширенный поиск")
    public void allFiltersActivate(){
        yaElectronicaTVPage.openAllFilters();
    }

    @Step("Проверить, что элементов на странице 12.")
    public void changeProducerPageSize(int size){
        yaElectronicaTVPage.changeProductPageSize(size);
    }
    @Step("Запомнить первый элемент в списке.")
    public void chooseSomeItem(int itemNumber){
        yaElectronicaTVPage.chooseSomeItem(itemNumber);
    }
    @Step("В поисковую строку ввести запомненное значение.")
    public void searchItemOnMainSearch(){
        yaElectronicaTVPage.searchItemOnMainSearch();
    }
    @Step("Найти и проверить, что наименование товара соответствует запомненному значению.")
    public void compareResults (int itemNumber){
        yaElectronicaTVPage.compareResults(itemNumber);
    }
}
