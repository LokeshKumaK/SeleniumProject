import DriverFactory.DriverFactory;
import org.openqa.selenium.Keys;

public class Test {
    @org.testng.annotations.Test
    public static void test() throws Exception {
        DriverFactory driver = new DriverFactory();
        driver.goToUrl("url_Google");
        driver.enterText("txt_Search", "HomePage", "Lokesh Kumar K");
        driver.enterText("txt_Search", "HomePage", Keys.ENTER);
        driver.click("lnk_Images", "ResultsPage");

    }
}
