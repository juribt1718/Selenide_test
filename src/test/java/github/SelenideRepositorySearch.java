package github;

import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {


@Test
void shouldFindSelenideRepositoryAtTheTop(){

    //Открыть главную страницу
    open("https://github.com/");

    //Ввести в поиск selenide и нажать Enter
$("[placeholder ='Search GitHub']").setValue("selenide").pressEnter();

    }
}
