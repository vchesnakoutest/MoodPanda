package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    public static final String LOGIN = "vchesnokovpanda@mailinator.com";
    public static final String PASSWORD = "123456";

    @Test(description = "What is verified here..")
    public void loginTest() {
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible()
                .clickOnUpdateMoodButton()
                .updateMood(9)
                .clickGoToMyDiaryButton();
//        TODO: To implement assertions
//        Assert.assertEquals(myDiary.getText(), "1");
    }
}
