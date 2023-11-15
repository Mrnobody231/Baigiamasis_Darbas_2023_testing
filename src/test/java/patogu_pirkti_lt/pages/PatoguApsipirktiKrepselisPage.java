package patogu_pirkti_lt.pages;

public class PatoguApsipirktiKrepselisPage {
    public static void setChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void writeInSearchBox(String autorius) {
        Common.sendKeysToElement(Locator.PatoguPirkti.Krepselis.inputSearchBox, autorius);
    }

    public static void clickOnSearchBox() {
        Common.clickOnElement(Locator.PatoguPirkti.Krepselis.clickSearchBox);
    }

    public static void declineCookies() {
        Common.clickOnElement(Locator.PatoguPirkti.Krepselis.clickDeclineCookies);
    }

    public static void addToKrepselis() {
        Common.clickOnKrepselisWhenAvailable(Locator.PatoguPirkti.Krepselis.clickOnButtonKrepselis, 2);
    }


    public static String checkMessageText() {
        Common.waitElementWhenVisible(Locator.PatoguPirkti.Krepselis.krepselisMessageShow, 6);
        return Common.getTextFromElement(Locator.PatoguPirkti.Krepselis.krepselisMessageShow);
    }

    public static void clickClosePrekeIdetaIKrepseli() {
        Common.clickWithActions(Locator.PatoguPirkti.Krepselis.closePagePrekeIdetaIKrepseli);
    }
}
