package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;



public class LoginStepdefs {

    WebDriver driver;

    @Given("user in the login page")
    public void userInTheLoginPage() {

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

        driver=  new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://chaldal.com/");

    }

    @When("user enter {string} and {string}")
    public void userEnterPasswordAndUsername(String password, String username) {


        System.out.println(password);
        System.out.println(username);


        driver.navigate().to("https://dashboard.xendit.co/login");

    }

    @And("click Button")
    public void clickButton() {

        driver.navigate().to("https://dashboard.xendit.co/login");


    }

    @Then("user will navigate the dashboard button")
    public void userWillNavigateTheDashboardButton() {

        driver.navigate().to("https://dashboard.xendit.co/login");


    }
}
