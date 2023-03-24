//package StepDefinition;
//
//import AppAutomation.AppAutomationPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import java.net.MalformedURLException;
//
//import static StepDefinition.AppAutomationStepdefs.driver;
//
//public class MakePaymentStepdefs {
//
//
//    AppAutomationPage mp;
//
//    @Given("user click on Make Payment")
//    public void userClickOnMakePayment() throws MalformedURLException, InterruptedException {
//       mp = new AppAutomationPage(driver);
//
//    }
//
//    @When("user enter {string} and  {string} and {string} and {string}")
//    public void userEnterPhoneAndNameAndAmountAndCountry(String phone, String name, String amount, String country) throws InterruptedException {
//        //mp = new AppAutomationPage(driver);
//        mp.sendPayment(phone,name, amount, country );
//    }
//
//    @Then("user will make payment")
//    public void userWillMakePayment() {
//        System.out.println("Payment created");
//    }
//}
