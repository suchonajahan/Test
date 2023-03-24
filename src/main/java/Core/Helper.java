//package Core;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
//import io.appium.java_client.remote.MobileCapabilityType;
//import io.appium.java_client.remote.MobilePlatform;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class Helper {
//    static AndroidDriver driver;
//    DesiredCapabilities dc = new DesiredCapabilities();
//
//
//    public void appSetting() throws InterruptedException, MalformedURLException {
//        //dc.setCapability(MobileCapabilityType.UDID, "a12aa2b2");
//        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Xiaomi Mi Note 10 Lite");
//        dc.setCapability("platformVersion", "11");
//        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
//        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
//        Thread.sleep(6000);
//        driver  = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
//    }
//
//    public AndroidDriver appHandler() throws MalformedURLException, InterruptedException {
//        appSetting();
//        return driver;
//    }
//
//}
