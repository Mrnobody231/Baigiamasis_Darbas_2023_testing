package patogu_pirkti_lt.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import patogu_pirkti_lt.pages.PatoguPirktiPrisijungtiPage;

public class PatoguPirktiPrisijungtiTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        PatoguPirktiPrisijungtiPage.openChrome("https://www.patogupirkti.lt/");
    }

    @Test
    public void testPrisijungtiPositive() {
        String email = "andruskevic.e@gmail.com";
        String password = "Testing2023QA";
        String expectedResult = "Mano paskyra";
        String actualResult;

        PatoguPirktiPrisijungtiPage.waitForCookies();
        PatoguPirktiPrisijungtiPage.clickOnPrisijungtiButton();
        PatoguPirktiPrisijungtiPage.writeEmail(email);
        PatoguPirktiPrisijungtiPage.writePassword(password);
        PatoguPirktiPrisijungtiPage.clickOnPrisijungti();

        actualResult = PatoguPirktiPrisijungtiPage.readMessageCheckedValue();


        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}


