package patogu_pirkti_lt.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import patogu_pirkti_lt.pages.PatoguApsipirktiManoNoruSarasasPage;

public class PatoguApsipirktiManoNoruSarasasTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        PatoguApsipirktiManoNoruSarasasPage.openChrome("https://www.patogupirkti.lt/");
    }

    @Test
    public static void testNoruSarasas() throws InterruptedException {
        String email = "andruskevic.e@gmail.com";
        String password = "Testing2023QA";
        String autorius = "George Orwell";
        String expectedResult = "Gyvulių ūkis";
        String actualResult;

        PatoguApsipirktiManoNoruSarasasPage.clickOnPrisijungtiButton();
        PatoguApsipirktiManoNoruSarasasPage.waitForCookies();
        PatoguApsipirktiManoNoruSarasasPage.writeEmail(email);
        PatoguApsipirktiManoNoruSarasasPage.writePassword(password);
        PatoguApsipirktiManoNoruSarasasPage.clickOnPrisijungti();
        PatoguApsipirktiManoNoruSarasasPage.writeInSearchBox(autorius);
        PatoguApsipirktiManoNoruSarasasPage.clickOnSearchBox();
        PatoguApsipirktiManoNoruSarasasPage.clickOnBook();
        PatoguApsipirktiManoNoruSarasasPage.addToNoriuSarasas();
        PatoguApsipirktiManoNoruSarasasPage.clickOnMessageNoruSarasa();

        actualResult = PatoguApsipirktiManoNoruSarasasPage.bookIsInManoSarasas();

        PatoguApsipirktiManoNoruSarasasPage.clickPasalintiButton();
        PatoguApsipirktiManoNoruSarasasPage.clickMessagePasalintiIsNoruSaraso();

        Assert.assertEquals(
                actualResult, expectedResult
        );
    }
}

