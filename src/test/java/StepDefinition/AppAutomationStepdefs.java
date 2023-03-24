//package StepDefinition;
//
//import AppAutomation.AppAutomationPage;
//import Core.Helper;
//import io.appium.java_client.android.AndroidDriver;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import java.net.MalformedURLException;
//
//
//public class AppAutomationStepdefs {
//
//    AppAutomationPage ap;
//    public static AndroidDriver driver;
//   // DesiredCapabilities dc = new DesiredCapabilities();
//
//
//
//    @Given("user is in the app")
//    public void userIsInTheApp() throws InterruptedException, MalformedURLException {
//        //dc.setCapability(MobileCapabilityType.UDID, "a12aa2b2");
////        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
////        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Xiaomi Mi Note 10 Lite");
////        dc.setCapability("platformVersion", "11");
////        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
////        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
////        Thread.sleep(6000);
////        driver  = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
//
//          Helper helper = new Helper();
//          driver = helper.appHandler();
//
//    }
//
//    @When("user enter {string} and {string} in the app")
//    public void userEnterUserNameAndPasswordInTheApp(String userName, String pass) throws InterruptedException {
////        Thread.sleep(2000);
////        driver.findElement(By.xpath("//*[@text='OK']")).click();
////        Thread.sleep(7000);
////        driver.findElement(By.xpath("//*[@text='Username']"));
////        Thread.sleep(7000);
////        driver.findElement(By.xpath("//*[@text='Username']")).sendKeys(userName);
////        Thread.sleep(7000);
////        driver.findElement(By.xpath("//*[@text='Password']")).sendKeys(password);
////        Thread.sleep(7000);
////        driver.findElement(By.xpath("//*[@text='Login']")).click();
//
//        ap = new AppAutomationPage(driver);
//        ap.login(userName, pass);
//    }
//
//
//
//    @Then("user will login to the system")
//    public void userWillLoginToTheSystem() {
//        System.out.println("test");
//    }
//}
