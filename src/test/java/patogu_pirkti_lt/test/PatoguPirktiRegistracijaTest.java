package patogu_pirkti_lt.test;

import org.bouncycastle.cms.PasswordRecipient;
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
        String actualResult;

        PatoguPirktiRegistracijaPage.waitForCookies();
        PatoguPirktiRegistracijaPage.clickOnPrisijungtiButton();
        PatoguPirktiRegistracijaPage.writeEmail(email);
        PatoguPirktiRegistracijaPage.writePassword(password);
        PatoguPirktiRegistracijaPage.repeatPassword(repeatPassword);
    }
}
