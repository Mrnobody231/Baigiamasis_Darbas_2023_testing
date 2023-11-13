package patogu_pirkti_lt.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class PatoguPirkti {
        public static class Registracija {
            public static By declineCookies = By.xpath("//button[@id='CybotCookiebotDialog" +
                    "BodyButtonDecline']");

            public static By headerPrisijungtiButton = By.xpath("//a[contains(text(),'Prisijungti')]");
            public static By writeEmail = By.xpath("//input[@id='email_address']");
            public static By writePassword = By.xpath("//input[@id='password']");
            public static By repeatPassword = By.xpath("//input[@id='confirmation']");
        }
    }
}
