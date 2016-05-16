package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HomePage;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    private final String START = "http://localhost:8080/start";

    HomePage homePage;

    @Given("^User goes to the home page$")
    public void openHomePage() throws Throwable {
        WebDriver webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
        homePage.navigateTo(START);
    }

    @Then("^The message (.*) is displayed$")
    public void theMessageIsDisplayed(String expected) throws Throwable {
        String actual = homePage.result.getText();
        assertEquals(actual, expected);
    }
}
