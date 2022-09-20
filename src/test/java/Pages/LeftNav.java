package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//fuse-nav-vertical-item//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "//fuse-nav-vertical-collapsable//span[text()='Entrance Exams']")
    private WebElement entranceExam1;

    @FindBy(xpath = "//fuse-nav-vertical-collapsable//span[text()='Entrance Exams']/following::span[2]")
    private WebElement entranceExam2;

    @FindBy(xpath = "//fuse-nav-vertical-collapsable//span[text()='Entrance Exams']/following::span")
    private WebElement setup2;

    //HumanResource
    @FindBy(xpath = "//fuse-nav-vertical-collapsable//span[text()='Human Resources']")
    private WebElement humanResource;

    @FindBy(xpath = "//fuse-nav-vertical-collapsable[6]//span[text()='Employees']")
    private WebElement Employees;




    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "countries" : myElement =countries; break;
            case "citizenShip" : myElement =citizenShip; break;
            case "nationalities" : myElement =nationalities; break;
            case "fees" : myElement =fees; break;
            case "entranceExam1" : myElement =entranceExam1; break;
            case "entranceExam2" : myElement =entranceExam2; break;
            case "setup2" : myElement =setup2; break;
            case "humanResource" : myElement =humanResource; break;
            case "Employees" : myElement =Employees; break;
        }

        clickFunction(myElement);
    }

}
