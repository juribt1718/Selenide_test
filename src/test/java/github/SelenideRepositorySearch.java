package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.builder.ToStringExclude;
//import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        // Configuration.baseUrl = "https://demoqa.com";
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
    }

@Test
void shouldFindSelenideRepositoryAtTheTop(){


    //Открыть главную страницу
    open("https://github.com/");

    //Ввести в поиск selenide и нажать Enter
$("[placeholder ='Search GitHub']").setValue("selenide").pressEnter();

sleep(5000);

    }
}
