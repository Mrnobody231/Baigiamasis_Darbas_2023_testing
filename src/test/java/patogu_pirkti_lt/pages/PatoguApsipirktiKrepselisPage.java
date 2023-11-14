package patogu_pirkti_lt.pages;

public class PatoguApsipirktiKrepselisPage {
    public static void setChrome(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void writeInSearchBox(String autorius) {
        Common.sendKeysToElement(Locator.PatoguPirkti.Krepselis.inputSearchBox,autorius);
    }
}
