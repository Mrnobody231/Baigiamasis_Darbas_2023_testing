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

    public static void clickCheckBoxTurimeSandelyje() throws InterruptedException {
        Common.clickOnCheckBoxWhenAvailable(Locator.PatoguPirkti.Ispardavimas.clickCheckBoxTurimeSandelyje, 10);

    }

    public static void writeTextInCheckBox(String leidykla) {
        try {
            Common.waitJavaScriptLoadComplete(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Common.sendKeysToElement(Locator.PatoguPirkti.Ispardavimas.writeInBoxAlmaLittera, leidykla);
    }

    public static void selectCheckBoxLeidykla() {
        Common.clickWithActions(Locator.PatoguPirkti.Ispardavimas.clickCheckBoxAlmaLittera);
    }

    public static String findAmountOfBooks() {
        try {
            Common.waitJavaScriptLoadComplete(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Common.getTextFromElement(Locator.PatoguPirkti.Ispardavimas.readTextOfBooks);
    }

    public static void clickOnCookies() {
        Common.clickOnElement(Locator.PatoguPirkti.Ispardavimas.clickDeclineCookies);
    }
}
