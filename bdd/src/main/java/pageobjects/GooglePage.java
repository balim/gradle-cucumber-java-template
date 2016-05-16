package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends PageObject {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "lst-ib")
    public WebElement searchInput;

}
