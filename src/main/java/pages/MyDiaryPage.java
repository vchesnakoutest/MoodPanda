package pages;

import static com.codeborne.selenide.Selenide.$$;

public class MyDiaryPage {

    //TODO: To implement this logic
    public String getText() {
        return $$(".badge.pull-right").get(0).getText();
    }
}
