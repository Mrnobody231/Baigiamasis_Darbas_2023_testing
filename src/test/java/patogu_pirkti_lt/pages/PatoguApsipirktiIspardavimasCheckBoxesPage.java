package patogu_pirkti_lt.pages;

public class PatoguApsipirktiIspardavimasCheckBoxesPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickIspardavimasButton() {
        Common.clickOnElement(Locator.PatoguPirkti.Ispardavimas.clickIspardavimasButton);
    }

    public static void clickCheckBoxGrozineLiteratura() {
        Common.clickWithActions(Locator.PatoguPirkti.Ispardavimas.clickCheckBoxGrozineLiteratura);
    }

    public static void clickCheckBoxTurimeSandelyje() {
        Common.clickWithActions(Locator.PatoguPirkti.Ispardavimas.clickCheckBoxTurimeSandelyje);
    }
}
