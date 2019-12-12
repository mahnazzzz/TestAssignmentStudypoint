package junit;
import static org.junit.Assert.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import database.StudentMapper;
import database.TestDataSource;
import Testdatabase.TestDatabaseMapper;
import java.sql.SQLException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(JUnitPlatform.class)
@CucumberOptions(plugin = {"pretty"},
        features = {"src/test/resources/junit"})
public class RunCucumberJunit {

    private String today;
    private String actualAnswer;
    
    private TestDatabaseMapper tdm = new TestDatabaseMapper();
    

    @Given("^i START getting data from  $")
    public void startApplication(TestDatabaseMapper d) {
      d.createTestDatabase();
     
    }

    @When("^I browser \"([^\"]*)\" $")
    public void i_ask_whether_it_s_Friday_yet() {
       // actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should se selection of product $")
    public void i_should_be_told(String expectedAnswer) {
       // assertEquals(expectedAnswer, actualAnswer);
    }
}
