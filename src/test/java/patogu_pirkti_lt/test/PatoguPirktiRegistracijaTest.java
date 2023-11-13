package patogu_pirkti_lt.test;

import org.bouncycastle.cms.PasswordRecipient;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import patogu_pirkti_lt.pages.PatoguPirktiRegistracijaPage;

public class PatoguPirktiRegistracijaTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        PatoguPirktiRegistracijaPage.openChrome("https://www.patogupirkti.lt/");
    }

    @Test
    public void testClickOnRegistracijaButton() {
        String email = "andruskevic.e@gmail.com";
        String password = "Testing2023QA";
        String repeatPassword = "Testing2023QA";
        String expectedResult = "Mano paskyra";
        String actualResult;

//        actualResult = PatoguPirktiRegistracijaPage.readMessageCheckedValue();

        PatoguPirktiRegistracijaPage.waitForCookies();
        PatoguPirktiRegistracijaPage.clickOnPrisijungtiButton();
        PatoguPirktiRegistracijaPage.writeEmail(email);
        PatoguPirktiRegistracijaPage.writePassword(password);
        PatoguPirktiRegistracijaPage.repeatPassword(repeatPassword);
//        PatoguPirktiRegistracijaPage.clickOnRegistruotis();
//        PatoguPirktiRegistracijaPage.clickOnRecaptcha();

//        Assert.assertTrue(
//                actualResult.contains(expectedResult),
//                "\nActual: %s, \nExpected: %s".formatted(
//                        actualResult, expectedResult
//                )
//        );
    }
}

