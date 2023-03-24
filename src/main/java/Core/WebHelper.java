package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class WebHelper {
    static WebDriver driver;
    public static ChromeDriver  cd;

    public void chrome() {

        Map<String, Integer> contentSettings = new HashMap<String, Integer>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Object> prefs = new HashMap<String, Object>();

        // options : default - 0, allow - 1, block - 2
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");

        //WebDriverManager.chromedriver().setup();
        cd= new ChromeDriver(options);
       // cd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    public void firefox() {

        // disable firefox notification - false:enabled - true:disabled
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(new FirefoxProfile());
        options.addPreference("dom.webnotifications.enabled", false);
        options.addPreference("geo.enabled", true);
        options.addPreference("geo.prompt.testing", true);
        options.addPreference("geo.prompt.testing.allow", true);
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

//    public WebDriver webURLForChrome(String URL){
//        chrome();
//        cd.get(URL);
//        cd.manage().window().maximize();
//        return cd;
//    }
    public WebDriver webURLForFireFox(String URL){
        firefox();
        driver.get(URL);
        driver.manage().window().maximize();
        return driver;
    }

    public void closeTab() {

        driver.close();
    }

    public void closeBrowser() {

        driver.quit();
    }

}
