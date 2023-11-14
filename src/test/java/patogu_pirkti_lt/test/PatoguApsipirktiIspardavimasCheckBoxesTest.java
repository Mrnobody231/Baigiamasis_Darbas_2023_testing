package patogu_pirkti_lt.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import patogu_pirkti_lt.pages.PatoguApsipirktiIspardavimasCheckBoxesPage;

import java.awt.*;

public class PatoguApsipirktiIspardavimasCheckBoxesTest extends TestBase{
    @BeforeMethod
    @Override
    public void setUp() {
        PatoguApsipirktiIspardavimasCheckBoxesPage.openChrome("https://www.patogupirkti.lt/");
    }

    @Test
    public static void testSelectCheckBoxes(){
        String expectecAmountOfBooks = "Rasta: 14";

        PatoguApsipirktiIspardavimasCheckBoxesPage.clickIspardavimasButton();
        PatoguApsipirktiIspardavimasCheckBoxesPage.clickCheckBoxGrozineLiteratura();
        PatoguApsipirktiIspardavimasCheckBoxesPage.clickCheckBoxTurimeSandelyje();

    }
}
