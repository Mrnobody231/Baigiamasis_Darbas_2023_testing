package patogu_pirkti_lt.pages;

public class PatoguPirktiRegistracijaPage {
    public static void openChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void waitForCookies() {
        Common.waitForCookiesBeLocated(Locator.PatoguPirkti.Registracija.declineCookies,5);
    }
}
