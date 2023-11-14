package patogu_pirkti_lt.test;

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

        PatoguApsipirktiKrepselisPage.writeInSearchBox(autorius);
    }
}
