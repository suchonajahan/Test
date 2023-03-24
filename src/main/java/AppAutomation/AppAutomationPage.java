//package AppAutomation;
//
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//
//public class AppAutomationPage {
//    public static AndroidDriver driver;
//
//    public AppAutomationPage(AndroidDriver driver){
//        this.driver = driver;
//
//    }
//
//    public void login(String userName, String pass) throws InterruptedException {
//        Thread.sleep(7000);
//        By click = By.xpath("//*[@text='OK']");;
//        driver.findElement(click).click();
//        Thread.sleep(2000);
//        By uName = By.xpath("//*[@text='Username']");;
//        driver.findElement(uName).sendKeys(userName);
//        Thread.sleep(2000);
//        By password = By.xpath("//*[@text='Password']");;
//        driver.findElement(password).sendKeys(pass);
//        Thread.sleep(2000);
//        By loginButton = By.xpath("//*[@text='Login']");
//        driver.findElement(loginButton).click();
//    }
//
//    public void sendPayment(String phone, String name, String amount, String country) throws InterruptedException {
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
//        Thread.sleep(8000);
//        driver.findElement(By.xpath("//*[@text='Phone']")).sendKeys(phone);
//
//        Thread.sleep(2000);
////        phn.click();
////        phn.sendKeys(phone);
//
//        //driver.findElement(By.xpath("//*[@id='phoneTextField']")).sendKeys(phone);
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//*[@text='Name']")).sendKeys(name);
//        Thread.sleep(7000);
//        driver.findElement(By.xpath("//*[@text='Amount']")).sendKeys(amount);
//        Thread.sleep(7000);
//        WebElement testDropDown = driver.findElement(By.xpath("//*[@text='Select']"));
//        testDropDown.click();
//        //WebElement testDropDown = driver.findElement(By.id("countryButton"));
//
//        Thread.sleep(3000);
//        WebElement testDropDown2 = driver.findElement(By.xpath("//*[@text='USA']"));
//        testDropDown2.click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@text='Send Payment']")).click();
////        Alert alert = driver.switchTo().alert();
////        alert.accept();
//        Thread.sleep(3000);
//
//
//        driver.findElement(By.xpath("//*[@text='Yes']")).click();
//        //alertHandle.click();
//        //*[@id='button1']    /*[@text='Yes']
//    }
//}
