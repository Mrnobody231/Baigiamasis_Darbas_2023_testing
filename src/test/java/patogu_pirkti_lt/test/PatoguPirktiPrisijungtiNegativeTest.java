package patogu_pirkti_lt.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import patogu_pirkti_lt.pages.PatoguPirktiPrisijungtiNegativePage;
import patogu_pirkti_lt.pages.PatoguPirktiPrisijungtiPositivePage;

public class PatoguPirktiPrisijungtiNegativeTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        PatoguPirktiPrisijungtiNegativePage.openChrome("https://www.patogupirkti.lt/");
    }

    @Test
    public void testPrisijungtiNegative() {
        String email = "andruskevic.e@gmail.com";
        String password = "Testing2023";
        String expectedResult = "Mano paskyra";
        String actualResult;

        PatoguPirktiPrisijungtiNegativePage.waitForCookies();
        PatoguPirktiPrisijungtiNegativePage.clickOnPrisijungtiButton();
        PatoguPirktiPrisijungtiNegativePage.writeEmail(email);
        PatoguPirktiPrisijungtiNegativePage.writePassword(password);
        PatoguPirktiPrisijungtiNegativePage.clickOnPrisijungti();
        PatoguPirktiPrisijungtiNegativePage.readMessageCheckedValue();

        actualResult = PatoguPirktiPrisijungtiPositivePage.readMessageCheckedValue();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nActual: %s, \nExpected: %s".formatted(
                        actualResult, expectedResult
                )
        );
    }
}
