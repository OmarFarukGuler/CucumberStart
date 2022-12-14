package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id='cconsent-bar']//button")
    private WebElement acceptCookies;


    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    //Fees

    @FindBy(xpath = "//fee-type-dialog[@class='ng-star-inserted']//mat-form-field[2]//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//fee-type-dialog[@class='ng-star-inserted']//mat-form-field[3]//input")
    private WebElement priority;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']//fa-icon/*")//button[@aria-label='Close dialog']
    private WebElement closeDialog;

    @FindBy(xpath = "//div/button[text()='button']")
    private WebElement closeDialogcarpi;


    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> nameList;

    //Human resource to add an employee


    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.a??ama
        // burda string isimden weblemente ula????cam
        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;


        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.a??ama
        // burda string isimden weblemente ula????cam
        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "deleteDialogBtn":
                myElement = deleteDialogBtn;
                break;
            case "acceptCookies":
                myElement = acceptCookies;
                break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.a??ama
        // burda string isimden weblemente ula????cam
        switch (strElement) {
            case "dashboard":
                myElement = dashboard;
                break;
            case "successMessage":
                myElement = successMessage;
                break;
            case "alreadyExist":
                myElement = alreadyExist;
                break;
        }

        verifyContainsText(myElement, text);
    }


    public void SearchAndDelete(String searchText) {

        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
        waitClicableDialog("searchButton");
        // GWD.Bekle(2); // TODO: incelenecek
        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }

    public void waitUntilStalenessDialog(String strElement) {
        switch (strElement) {
            case "closeDialog":
                myElement = closeDialog;
                break;
        }
        waitUntilStalenessParent(myElement);
    }

    public void waitUntilInvisibilityOfElementDialog(String strElement) {
        String locater = "";
        switch (strElement) {
            case "alreadyExist":
                locater = "//div[contains(text(),'already exists')]";
                break;
            case "successMessage":
                locater = "//div[contains(text(),'successfully')]";
                break;
        }
        waitUntilinvisibilityOfElementDialog(locater);
    }

    public void waitClicableDialog(String strElement) {
        switch (strElement) {
            case "searchButton":
                myElement = searchButton;
                break;
        }
        waitUntilClickable(myElement);


    }

    public void isDisplayedDialog(String strElement) {
        switch (strElement) {
            case "acceptCookies":
                myElement = acceptCookies;
                break;
        }

        if (myElement.isDisplayed()) {
            clickFunction(myElement);
        }


    }

  /*  public void OnlyClickFunctionDialog(String strElement) {

        switch (strElement) {
            case "NewEmployeeBack": myElement = NewEmployeeBack;break;
        }

        OnlyClickFunctionParent(myElement);

    }*/


   /* public void SelecyDialog(String strElement,String text){

        String locater = "";
        switch (strElement) {
            case "alreadyExist":
                locater = "//div[contains(text(),'already exists')]";
                break;
            case "successMessage":
                locater = "//div[contains(text(),'successfully')]";
                break;
        }

    SelectParent(locater,text);

    }*/

    public void ScrolToElementDialog(String strElement) {
        switch (strElement) {
            case "searchButton":
                myElement = searchButton;
                break;
        }

       scrollToElement(myElement);
        }



}