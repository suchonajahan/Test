import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    By search = By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input");

    public void search(String product){
        driver.findElement(search).sendKeys(product);
        driver.findElement(search).sendKeys(Keys.ENTER);
    }


    By add = By.xpath("(//p[@class='buyText'])[1]");

    public void addCart() {
        driver.findElement(add).click();
    }
}