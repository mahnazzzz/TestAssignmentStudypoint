import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import org.openqa.selenium.chrome.ChromeDriver;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.openqa.selenium.By;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyObject;
import org.openqa.selenium.WebDriver;


@CucumberOptions(plugin = {"pretty","html:reports"})
@RunWith(MockitoJUnitRunner.class)
public class PizzShopTest {

    WebDriver driver;
    
    @Mock
    ArrayList<Order> orders;
    Admin admin;
    Order order;

       
@Test
    @Given("^user navigates to http://localhost:8080/pizzaMarioTestAssignment_6/index.jsp$")
    public void navigatePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bruger\\Desktop\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("localhost:8080/pizzaMarioTestAssignment_6/");
        orders = new ArrayList<>();
    }
   
    @When("Customer order pizza \"Hawaii\" ")
    public void pickPizza() {
        driver.findElement(By.id("Hawaii")).click();
        order = new Order(1, "Hawaii", "cheese, tomato, Champion", 44);
        admin = mock(Admin.class);
        when(admin.makeOrder()).thenReturn(order);
    }
    @Then("Customer clicks \"order\"")
    public void makeOrder() {
        driver.findElement(By.id("orderB")).click();
        orders.add(admin.makeOrder());
        System.out.println("orders size: " + orders.size());
    }
    

}
