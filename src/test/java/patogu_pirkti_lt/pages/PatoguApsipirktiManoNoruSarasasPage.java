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

    public static void addToNoriuSarasas() {
        Common.clickWithActions(Locator.PatoguPirkti.NoruSarasas.clickINoriuSarasas);
    }

    public static void clickOnMessageNoruSarasa() throws InterruptedException {
        try {
            Common.waitJavaScriptLoadComplete(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Common.clickWithActions(Locator.PatoguPirkti.NoruSarasas.clickMessageNoruSarasas);
    }
}
