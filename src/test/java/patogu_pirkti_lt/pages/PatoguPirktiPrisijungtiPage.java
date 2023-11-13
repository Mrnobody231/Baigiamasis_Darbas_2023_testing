package patogu_pirkti_lt.pages;

public class PatoguPirktiPrisijungtiPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnPrisijungtiButton() {
        Common.clickOnElement(Locator.PatoguPirkti.Prisijungti.headerPrisijungtiButton);
    }

    public static void writeEmail(String email) {
        Common.sendKeysToElement(Locator.PatoguPirkti.Prisijungti.writeEmail,email);
    }

    public static void writePassword(String password) {
        Common.sendKeysToElement(Locator.PatoguPirkti.Prisijungti.writePassword,password);
    }

    public static void clickOnPrisijungti() {
        Common.clickOnElement(Locator.PatoguPirkti.Prisijungti.clickOnPrisijungti);
    }
}