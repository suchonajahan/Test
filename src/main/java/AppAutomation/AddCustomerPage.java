//package AppAutomation;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class AddCustomerPage {
//
//    public static WebDriver driver;
//    public AddCustomerPage(WebDriver driver) {
//        AddCustomerPage.driver = driver;
//    }
//
//    By fName = By.xpath("//input[@placeholder='First Name']");
//    By lName = By.xpath("//input[@placeholder='Last Name']");
//    By pCode = By.xpath("//input[@placeholder='Post Code']");
//    By button = By.xpath("//button[text()='Add Customer']");
//    By openAcc = By.xpath("//button[@ng-click='openAccount()']");
//
//    public void customerData(String firstName, String lastName, String postCode) {
//        driver.findElement(fName).sendKeys(firstName);
//        driver.findElement(lName).sendKeys(lastName);
//        driver.findElement(pCode).sendKeys(postCode);
//    }
//
//    public void clickButton() {
//        driver.findElement(button).click();
//    }
//
//    public void popUp() {
//        Alert alert = driver.switchTo().alert();
//        String msg = alert.getText();
//        System.out.println("Confirmation message: " + msg);
//        alert.accept();
//    }
//
//    public void openAccount() {
//        driver.findElement(openAcc).click();
//
//    }
//}