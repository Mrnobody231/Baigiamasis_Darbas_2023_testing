package patogu_pirkti_lt.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import patogu_pirkti_lt.pages.PatoguApsipirktiKrepselisPage;

public class PatoguApsipirktiKrepselisTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        PatoguApsipirktiKrepselisPage.setChrome("https://www.patogupirkti.lt/");
    }

    @Test
    public static void testIdetiIKrepseli() {
        String autorius = "George Orwell";
        String expectedResult = "Prekė įdėta į krepšelį";
        String actualResult;

        PatoguApsipirktiKrepselisPage.writeInSearchBox(autorius);
        PatoguApsipirktiKrepselisPage.clickOnSearchBox();
        PatoguApsipirktiKrepselisPage.declineCookies();
        PatoguApsipirktiKrepselisPage.addToKrepselis();

        actualResult = PatoguApsipirktiKrepselisPage.checkMessageText();

        PatoguApsipirktiKrepselisPage.clickClosePrekeIdetaIKrepseli();


        Assert.assertEquals(
                actualResult, expectedResult
        );
    }
}


