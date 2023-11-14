package patogu_pirkti_lt.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import patogu_pirkti_lt.pages.PatoguApsipirktiIspardavimasCheckBoxesPage;

import java.awt.*;

public class PatoguApsipirktiIspardavimasCheckBoxesTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        PatoguApsipirktiIspardavimasCheckBoxesPage.openChrome("https://www.patogupirkti.lt/");
    }

    @Test
    public static void testSelectCheckBoxes() throws InterruptedException {
        String leidykla = "Alma littera";
        String expectedAmountOfBooks = "Rasta: 14";
        String actualAmountOfBooks;

        PatoguApsipirktiIspardavimasCheckBoxesPage.clickIspardavimasButton();
        PatoguApsipirktiIspardavimasCheckBoxesPage.clickOnCookies();
        PatoguApsipirktiIspardavimasCheckBoxesPage.clickCheckBoxGrozineLiteratura();
        PatoguApsipirktiIspardavimasCheckBoxesPage.clickCheckBoxTurimeSandelyje();
        PatoguApsipirktiIspardavimasCheckBoxesPage.writeTextInCheckBox(leidykla);
        PatoguApsipirktiIspardavimasCheckBoxesPage.selectCheckBoxLeidykla();


        actualAmountOfBooks = PatoguApsipirktiIspardavimasCheckBoxesPage.findAmountOfBooks();

        Assert.assertEquals(
                actualAmountOfBooks, expectedAmountOfBooks);
    }
}


