import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ParallelTest {

    //public static WebDriver driver;

    @Test
    public void fireFoxTest(){


            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(new FirefoxProfile());
            options.addPreference("dom.webnotifications.enabled", false);
            options.addPreference("geo.enabled", true);
            options.addPreference("geo.prompt.testing",true);
            options.addPreference("geo.prompt.testing.allow",true);
            WebDriverManager.firefoxdriver().setup();
             WebDriver driver = new FirefoxDriver(options);
            driver.get("https://chaldal.com/");
            driver.manage().window().maximize();
        }

        @Test
        public void chromeTest(){

            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<String, Object>();
            Map<String, Object> profile = new HashMap<String, Object>();
            Map<String, Integer> contentSettings = new HashMap<String, Integer>();

            //SET CHROME OPTIONS
            //0 - Default, 1 - Allow, 2 - Block

            contentSettings.put("notifications", 2);
            contentSettings.put("geolocation", 2);
            profile.put("managed_default_content_settings", contentSettings);
            prefs.put("profile", profile);
            options.setExperimentalOption("prefs", prefs);
            WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver(options);
            driver.get("https://chaldal.com/");
            driver.manage().window().maximize();

        }
    }



