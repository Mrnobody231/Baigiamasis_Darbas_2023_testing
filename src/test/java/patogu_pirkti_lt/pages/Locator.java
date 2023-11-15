package patogu_pirkti_lt.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class PatoguPirkti {

        public static class Prisijungti {
            public static By headerPrisijungtiButton = By.xpath("//a[contains(text(),'Prisijungti')]");
            public static By writeEmail = By.xpath("//input[@id='email']");
            public static By writePassword = By.xpath("//input[@id='pass']");
            public static By clickOnPrisijungti = By.xpath("//button[@id='send2']");
            public static By paragraphCheckedValue = By.xpath("//h1[contains(text(),'Mano paskyra')]");
            public static By declineCookies = By.xpath("//button[@id='CybotCookiebotDialog" +
                    "BodyButtonDecline']");
        }

        public static class Ispardavimas {

            public static By clickIspardavimasButton = By.xpath("//a[@title='Knygų išpardavimas']");
            public static By clickCheckBoxGrozineLiteratura = By.xpath("//input[@type='checkbox' " +
                    "and @value='42553']");
            public static By clickCheckBoxTurimeSandelyje = By.xpath("//input[@type='checkbox' " +
                    "and @value='41449']");
            public static By writeInBoxAlmaLittera = By.xpath("//input[@type='text' " +
                    "and @placeholder='Ieškoti']");
            public static By clickCheckBoxAlmaLittera = By.xpath("//input[@type='checkbox' " +
                    "and @value='33785']");
            public static By readTextOfBooks = By.xpath("(//div[@class='col-md-2 page-counter " +
                    "text-left pull-left'])[1]");

            public static By clickDeclineCookies = By.xpath("//button[@id='CybotCookiebotDialog" +
                    "BodyButtonDecline']");

        }

        public static class Krepselis {
            public static By inputSearchBox = By.xpath("//input[@id='search']");
            public static By clickSearchBox = By.xpath("//button[@type='submit']");
            public static By clickOnButtonKrepselis = By.xpath("(//a[contains(text(),'Į krepšelį')])[2]");
            public static By clickDeclineCookies = By.xpath("//button[@id='CybotCookiebotDialog" +
                    "BodyButtonDecline']");
            public static By krepselisMessageShow = By.xpath("//div[@id='myModalLabel']");
            public static By closePagePrekeIdetaIKrepseli = By.xpath("(//button[@type='button'])[3]");
            public static By clickPirktiOnKrepselioMessage = By.xpath("(//a[contains(text(),'Pirkti')" +
                    "])[2]");
            public static By clickPasalintiIsKrepselio = By.xpath("//a[@onclick='removeFromCart(this, " +
                    "product_tracking_data_remove_19189)']");
            public static By readDeleteMessage = By.xpath("//h1[contains(text(), 'Prekių krepšelis" +
                    " yra tuščias')]");
            public static By clickGriztiButton = By.xpath("//a[contains(text(), 'Grįžti')]");
        }
    }
}
