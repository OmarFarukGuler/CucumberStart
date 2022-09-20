package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class _08_ApachePOISteps {
    DialogContent dc=new DialogContent();
    @When("User creat citizenship with apachePOI")
    public void userCreatCitizenshipWithApachePOI() {
        //Excelden oku ve citizenship i creat et
        ArrayList<ArrayList<String>> liste= ExcelUtility.getListData(
                "src/test/java/ApachePOI/_00_ResourceExcel/ApacheExcel2.xlsx",
                "testCitizen",2);
      for (ArrayList<String> a:liste){
          dc.findAndClick("addButton");
          dc.findAndSend("nameInput",a.get(0));
          dc.findAndSend("shortName",a.get(1));
          dc.findAndClick("saveButton");
          dc.findAndContainsText("successMessage","success");
      }
  
    }

    @Then("User Delete citizenship with ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {

       dc.ScrolToElementDialog("searchButton");

        ArrayList<ArrayList<String>> liste = ExcelUtility.getListData(
                "src/test/java/ApachePOI/_00_ResourceExcel/ApacheExcel2.xlsx",
                "testCitizen", 1);
        for (ArrayList<String> a : liste) {
            dc.SearchAndDelete(a.get(0));
            dc.findAndContainsText("successMessage","success");
        }



    }
}

