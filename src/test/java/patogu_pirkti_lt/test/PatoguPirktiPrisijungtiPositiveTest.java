package patogu_pirkti_lt.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import patogu_pirkti_lt.pages.PatoguPirktiPrisijungtiPositivePage;

public class PatoguPirktiPrisijungtiPositiveTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        PatoguPirktiPrisijungtiPositivePage.openChrome("https://www.patogupirkti.lt/");
    }

    @Test
    public void testPrisijungtiPositive() {
        String email = "andruskevic.e@gmail.com";
        String password = "Testing2023QA";
        String expectedResult = "Mano paskyra";
        String actualResult;

        PatoguPirktiPrisijungtiPositivePage.waitForCookies();
        PatoguPirktiPrisijungtiPositivePage.clickOnPrisijungtiButton();
        PatoguPirktiPrisijungtiPositivePage.writeEmail(email);
        PatoguPirktiPrisijungtiPositivePage.writePassword(password);
        PatoguPirktiPrisijungtiPositivePage.clickOnPrisijungti();

        actualResult = PatoguPirktiPrisijungtiPositivePage.readMessageCheckedValue();


        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}


