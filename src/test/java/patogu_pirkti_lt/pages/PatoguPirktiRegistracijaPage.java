package patogu_pirkti_lt.pages;

public class PatoguPirktiRegistracijaPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void waitForCookies() {
        Common.waitElementWhenVisible(Locator.PatoguPirkti.Registracija.declineCookies,5);
    }

    public static void clickOnPrisijungtiButton() {
        Common.clickOnElement(Locator.PatoguPirkti.Registracija.headerPrisijungtiButton);
    }

    public static void writeEmail(String email) {
        Common.sendKeysToElement(Locator.PatoguPirkti.Registracija.writeEmail,email);
        Common.waitElementWhenVisible(Locator.PatoguPirkti.Registracija.writeEmail, 5);
    }

    public static void writePassword(String password) {
        Common.sendKeysToElement(Locator.PatoguPirkti.Registracija.writePassword,password);
    }

    public static void repeatPassword(String repeatPassword) {
        Common.sendKeysToElement(Locator.PatoguPirkti.Registracija.repeatPassword,repeatPassword);
    }
}
