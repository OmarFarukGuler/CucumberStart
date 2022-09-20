package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent  extends Parent {

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //newExam
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement gradeLevel2;

    @FindBy(xpath = "//ms-save-button")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text()=' New Exam ']")
    private WebElement newExamBack;

    //human Resource
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//fee-type-dialog[@class='ng-star-inserted']//mat-form-field[3]//input")
    private WebElement priority;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstName;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']/*")
    private WebElement lastName;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='middleName']//input")
    private WebElement middleName;
    @FindBy(xpath = "//ms-date[@formcontrolname='dateOfBirth']/*/*/*/*/*")
    private WebElement dateofBirth;
    @FindBy(xpath = "//mat-select[@formcontrolname='gender']")
    private WebElement gender;
    @FindBy(xpath = "//span[@class='mat-option-text']/following::span")
    private WebElement male;
    @FindBy(xpath = "//mat-form-field[2]//mat-select//div[2]")
    private WebElement employeeType1;
    @FindBy(xpath = "//span[contains(text(),'Other')]")
    private WebElement employeeTypeOther;
    @FindBy(xpath = "//mat-tab-group//div[text()='General Info']")
    private WebElement generalinfo;
    @FindBy(xpath = "//mat-form-field//input[@formcontrolname='employeeId']")
    private WebElement EmployeeId;
    @FindBy(xpath = "//mat-select//span[text()='Qualification']")
    private WebElement qualification;
    @FindBy(xpath = "//mat-option//span[text()=' Master ']")
    private WebElement master;
    @FindBy(xpath = "//div[@class='mat-tab-body-wrapper']//mat-select")
    private WebElement dokumanType;
    @FindBy(xpath = "//span[contains(text(),' Personal ID ')]")
    private WebElement dokumanType2;
    @FindBy(xpath = "//span[contains(text(),' Personal ID ')]")
    private WebElement personalId;
    @FindBy(xpath = "//mat-form-field//input[@formcontrolname='documentNumber']")
    private WebElement dokumanNumber;
    @FindBy(xpath = "//div[text()='Contact & Address']")
    private WebElement contactAddress;
    @FindBy(xpath = "//mat-form-field//input[@formcontrolname='country']")
    private WebElement contactAddress2;
    @FindBy(xpath = "//span[text()='Turkiye']")
    private WebElement contactAddress3;
    @FindBy(xpath = "//ms-save-button//span[text()='Save']")
    private WebElement SAVE;
    @FindBy(xpath = "//div/button[text()='button']")
    private WebElement closeDialogcarpi;
    @FindBy(xpath = "//div[contains(text(),'already')]")
    private WebElement verifyAlready;
    @FindBy(xpath = "//div[contains(text(),'Employee successfully updated')]")
    private WebElement verifyUpDated;

    @FindBy(xpath = "//div[@id='container-2']//*[@class='svg-inline--fa fa-arrow-left']")
    private WebElement backButton;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.FIRST_NAME']/*")
    private WebElement firstNameEmployee;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.LAST_NAME']/*")
    private WebElement lastNameEmployee;
    @FindBy(xpath = "//span[text()='Gender']")
    private WebElement genderSearch;
    @FindBy(xpath = "//span[text()=' Male ']")
    private WebElement maleSearch;
    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteButton2;
    @FindBy(xpath = "//div[contains(text(),'successfully deleted')]")
    private WebElement verifyDelete;
    @FindBy(xpath = "//div[contains(text(),'Employee successfully created')]")
    private WebElement verifySuccessfullyCreated;
    @FindBy(xpath = "//employee-image//span")
    private WebElement waitTargetEnployee;













    WebElement myElement;

    public void findAndSendFormContetnt(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "nameInput": myElement = nameInput;break;
            case "priority": myElement = priority;break;
            case "firstName": myElement = firstName;break;
            case "lastName": myElement = lastName;break;
            case "middleName": myElement = middleName;break;
            case "dateofBirth": myElement = dateofBirth;break;
            case "dokumanNumber": myElement = dokumanNumber;break;
            case "EmployeeId": myElement = EmployeeId;break;
            case "contactAddress2": myElement = contactAddress2;break;
            case "firstNameEmployee": myElement = firstNameEmployee;break;
            case "lastNameEmployee": myElement = lastNameEmployee;break;

        }
        sendKeysFunction(myElement, value);

    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "academicPeriod": myElement = academicPeriod;break;
            case "academicPeriod1": myElement = academicPeriod1;break;
            case "gradeLevel": myElement = gradeLevel;break;
            case "gradeLevel2": myElement = gradeLevel2;break;
            case "saveButton": myElement = saveButton;break;
            case "closeDialogcarpi": myElement = closeDialogcarpi;break;
            case "gender": myElement = gender;break;
            case "male": myElement = male;break;
            case "employeeType1": myElement = employeeType1;break;
            case "employeeTypeOther": myElement = employeeTypeOther;break;
            case "EmployeeId": myElement = EmployeeId;break;
            case "qualification": myElement = qualification;break;
            case "generalinfo": myElement = generalinfo;break;
            case "master": myElement = master;break;
            case "dokumanType": myElement = dokumanType;break;
            case "dokumanType2": myElement = dokumanType2;break;
            case "personalId": myElement = personalId;break;
            case "contactAddress": myElement = contactAddress;break;
            case "contactAddress3": myElement = contactAddress3;break;
            case "SAVE": myElement = SAVE;break;
            case "addButton": myElement = addButton;break;
            case "backButton": myElement = backButton;break;
            case "genderSearch": myElement = genderSearch;break;
            case "maleSearch": myElement = maleSearch;break;
            case "deleteButton": myElement = deleteButton;break;
            case "deleteButton2": myElement = deleteButton2;break;

        }
        clickFunction(myElement);
    }


   /* public void SelectFormContent(String strElement) {

        String locator = "";
        switch (strElement) {
            case "academicYil": locator = "//span[text()='2021-2022']";break;


        }
            SelectParent(locator);

    }*/

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "verifyAlready": myElement = verifyAlready;break;
            case "verifyDelete": myElement = verifyDelete;break;
            case "verifyUpDated": myElement = verifyUpDated;break;
            case "verifySuccessfullyCreated": myElement = verifySuccessfullyCreated;break;

        }

        verifyContainsText(myElement, text);
    }


    public void SearchAndDelete(String searchText) {
        // findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder

    }


    public void waitUntilStalenessDialog(String strElement) {
        switch (strElement) {
            // case "closeDialog": myElement = closeDialog;break;

        }
        waitUntilStalenessParent(myElement);


    }

    public void waitUntilInvisibilityOfElementDialog(String strElement) {
        String locater = "";
        switch (strElement) {

            // case "alreadyExist": locater = "//div[contains(text(),'already exists')]";break;
        }
        waitUntilinvisibilityOfElementDialog(locater);

    }

  /*  public void waitClicableFormContent(String strElement) {
        switch (strElement) {
            case "academicPeriod":
                myElement = academicPeriod;
                break;
            case "academicYil":
                myElement = academicYil;
                break;
            case "gradeLevel":
                myElement = gradeLevel;
                break;
            case "grade1":
                myElement = grade1;
                break;
            case "regStartCalender":
                myElement = regStartCalender;
                break;
            case "regStartCalenderDate1":
                myElement = regStartCalenderDate1;
                break;
            case "regStartCalenderDate2":
                myElement = regStartCalenderDate2;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
        }
        waitUntilClickable(myElement);


    }*/

 /*   public void WaitUntilToBeNullFormContent(String strElement) {
        String locater = "";
        switch (strElement) {

            case "nameInput": myElement = nameInput;break;
        }
        WaitUntilToBeNullParent(myElement);

    }
*/
    public void WaitTextToBePresentInElementForm(String strElement,String target){
        switch (strElement) {

            case "waitTargetEnployee": myElement = nameInput;break;
        }
        WaitTextToBePresentInElementParent(myElement,target);

    }

}
