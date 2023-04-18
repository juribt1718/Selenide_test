package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SolutionsEnterprise {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
    }

    @Test
   void sollutionsEnterprise(){

        open("https://github.com/");
        $(".HeaderMenu-item:nth-child(2) > .HeaderMenu-link").hover();
        $(byText("Enterprise")).click();
        $(byText("Build like the best")).shouldBe(text("Build like the best"));
    }
}
