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
            public static By clickRecaptcha = By.xpath("(//iframe[@title='reCAPTCHA'])[1]");
            public static By clickRegistruotisButton = By.xpath("//button[contains(text()," +
                    "'Registruotis')]");
            public static By paragraphCheckedValue = By.xpath("//h1[contains(text(),'Mano paskyra')]");
        }

        public static class Prisijungti {
            public static By headerPrisijungtiButton = By.xpath("//a[contains(text(),'Prisijungti')]");
            public static By writeEmail = By.xpath("//input[@id='email']");
            public static By writePassword = By.xpath("//input[@id='pass']");
            public static By clickOnPrisijungti = By.xpath("//button[@id='send2']");
            public static By paragraphCheckedValue = By.xpath("//h1[contains(text(),'Mano paskyra')]");
        }

        public static class Ispardavimas {

            public static By clickIspardavimasButton = By.xpath("//a[@title='Knygų išpardavimas']");
            public static By clickCheckBoxGrozineLiteratura = By.xpath("//input[@type='checkbox' " +
                    "and @value='42553']");
            public static By clickCheckBoxTurimeSandelyje = By.xpath("//input[@type='checkbox' " +
                    "and @value='41449']");
        }
    }
}
