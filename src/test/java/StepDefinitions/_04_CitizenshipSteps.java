package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class _04_CitizenshipSteps {
    DialogContent dc=new DialogContent();
    @And("Navigate to Citizenship page")
    public void navigateToCitizenshipPage() {
        LeftNav ln=new LeftNav();
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("citizenShip");
    }

    @When("User a Citizenship name as {string} short name as {string}")
    public void userACitizenshipNameAsShortNameAs(String name, String shortName) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("shortName",shortName);
        dc.findAndClick("saveButton");
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.findAndContainsText("alreadyExist","already exists"); // loc tan
    }

    @And("Click on close button")
    public void clickOnCloseButton() {
        dc.findAndClick("closeDialog");
    }

    @And("Wait until invisibility element")
    public void waitUntilInvisibilityElement(DataTable element) {
        List<String> listElement=element.asList((Type) String.class);

        for (int i=0;i<listElement.size();i++){
            dc.waitUntilInvisibilityOfElementDialog(listElement.get(i));
        }

    }

    @And("User delete {string} from Dialog")
    public void userDeleteFromDialog(String CitizenshipName) {
        dc.SearchAndDelete(CitizenshipName);

    }

    @And("Wait until element clicable")
    public void waitUntilElementClicable(DataTable element) {
        List<String> listElement=element.asList((Type) String.class);

        for (int i=0;i<listElement.size();i++){
            dc.waitUntilInvisibilityOfElementDialog(listElement.get(i));
        }

    }

  /*  @Then("Cookies isDisplayed")
    public void cookiesIsDisplayed() {
        dc.isDisplayedDialog("acceptCookies");
    }*/
}
