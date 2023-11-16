package patogu_pirkti_lt.pages;

public class PatoguApsipirktiManoNoruSarasasPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void waitForCookies() {
        Common.clickWithActions(Locator.PatoguPirkti.NoruSarasas.declineCookiesButton);
    }

    public static void clickOnPrisijungtiButton() {
        Common.clickOnElement(Locator.PatoguPirkti.Prisijungti.headerPrisijungtiButton);
    }

    public static void writeEmail(String email) {
        Common.sendKeysToElement(Locator.PatoguPirkti.Prisijungti.writeEmail, email);
    }

    public static void writePassword(String password) {
        Common.sendKeysToElement(Locator.PatoguPirkti.Prisijungti.writePassword, password);
    }

    public static void clickOnPrisijungti() {
        Common.clickOnElement(Locator.PatoguPirkti.Prisijungti.clickOnPrisijungti);
    }

    public static void writeInSearchBox(String autorius) {
        Common.sendKeysToElement(Locator.PatoguPirkti.NoruSarasas.inputSearchBox, autorius);
    }

    public static void clickOnSearchBox() {
        Common.clickOnElement(Locator.PatoguPirkti.NoruSarasas.clickSearchBox);
    }

    public static void clickOnBook() {
        Common.clickWithActions(Locator.PatoguPirkti.NoruSarasas.clickOnBook);
    }

    public static void addToNoruSarasas() {
        Common.clickWithActions(Locator.PatoguPirkti.NoruSarasas.clickINoruSarasas);
    }

    public static void waitOnMessageNoruSarasa() {
        Common.waitElementWhenVisible(Locator.PatoguPirkti.NoruSarasas.clickMessageNoruSarasas, 8);
    }

    public static void clickOnMessageNoruSarasa()  {
        try {
            Common.waitJavaScriptLoadComplete(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Common.clickWithActions(Locator.PatoguPirkti.NoruSarasas.clickMessageNoruSarasas);
    }

    public static String bookIsInManoSarasas() {
        return Common.getTextFromElement(Locator.PatoguPirkti.NoruSarasas.readTextOfBook);
    }

    public static void waitTillBookLocated() {
        Common.waitElementWhenVisible(Locator.PatoguPirkti.NoruSarasas.clickPasalinti, 4);
    }

    public static void clickPasalintiButton() {
        Common.clickOnElement(Locator.PatoguPirkti.NoruSarasas.clickPasalinti);
    }

    public static void clickMessagePasalintiIsNoruSaraso() {
        Common.acceptAlert();
    }
}
