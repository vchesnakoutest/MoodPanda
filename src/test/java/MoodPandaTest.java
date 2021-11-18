import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest{

    @Test
    public void moodTest() {
        loginPage.openPage()
                .login("vchesnokovpanda@mailinator.com", "123456")
                .waitForMoodButtonVisible()
                .clickUpdateMoodButton()
                .updateMood(9);
        //TODO: Implement assert
        //Assert.assertEquals();
    }
}
