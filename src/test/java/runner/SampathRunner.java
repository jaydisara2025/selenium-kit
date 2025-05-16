package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.SampathBankEX;

public class SampathRunner {
    public static void main(String[] args) {
        // Make sure your WebDriver setup is correct for your environment
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        WebDriver driver = new FirefoxDriver();

        try {
            SampathBankEX sampath = new SampathBankEX(driver);
            sampath.sampath_bank_uk_gbp_tt_buying_rate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
