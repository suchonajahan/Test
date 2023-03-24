//package StepDefinition;
//
//import AppAutomation.AddCustomerPage;
//import Core.WebHelper;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.WebDriver;
//
//public class AddCustomerStepdefs {
//    public static WebDriver driver;
//
//    AddCustomerPage cp;
//
//    @Given("user in add customer page")
//    public void userInAddCustomerPage() {
//        WebHelper helper = new WebHelper();
//        driver = helper.webURLForFireFox("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust");
//    }
//
//    @When("user enters {string} and {string} and {string}")
//    public void userEntersFirstNameAndLastNameAndPostCode(String firstName, String lastName, String postCode) {
//        cp = new AddCustomerPage(driver);
//        cp.customerData(firstName,lastName,postCode);
//    }
//
//    @And("click add customer button")
//    public void clickAddCustomerButton() {
//
//        cp.clickButton();
//    }
//
//    @Then("manager will navigate to successful popup page")
//    public void managerWillNavigateToSuccessfulPopupPage() {
//
//        cp.popUp();
//
//    }
//
//    @When("user in open account page")
//    public void userInOpenAccountPage() {
//
//        cp.openAccount(); //problem.........
//        System.out.println("hello");
//    }
//
//    @When("select customer name and currency")
//    public void selectCustomerNameAndCurrency() {
//        System.out.println("hello");
//
//    }
//
//    @And("click process button")
//    public void clickProcessButton() {
//
//        System.out.println("hello");
//    }
//
//    @Then("navigate the successful popup page")
//    public void navigateTheSuccessfulPopupPage() {
//
//        System.out.println("hello");
//    }
//
//
//}
