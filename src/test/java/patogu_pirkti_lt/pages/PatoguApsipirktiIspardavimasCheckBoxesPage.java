package patogu_pirkti_lt.pages;

public class PatoguApsipirktiIspardavimasCheckBoxesPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickIspardavimasButton() {
        Common.clickOnElement(Locator.PatoguPirkti.Ispardavimas.clickIspardavimasButton);
    }
}
