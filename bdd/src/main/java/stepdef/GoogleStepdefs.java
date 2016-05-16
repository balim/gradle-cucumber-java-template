package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.GooglePage;

public class GoogleStepdefs {

    private final String START = "https://www.google.co.uk";

    GooglePage googlePage;

    @Given("^I go to the google page$")
    public void openGooglePage() throws Throwable {
        WebDriver webDriver = new ChromeDriver();
        googlePage = new GooglePage(webDriver);
        googlePage.navigateTo(START);
    }

    @And("^Searches for (.*)$")
    public void searchForString(String searchText) throws Throwable {
        System.out.println(googlePage.getSource());
        WebElement searchInput = googlePage.searchInput;
        System.out.println(searchInput);
        searchInput.sendKeys((CharSequence) searchText);
    }

    @Then("^I can click on the (.*) link$")
    public void clickOnLink(String linkText) {
        googlePage.clickElementWithText(linkText);
    }

}
