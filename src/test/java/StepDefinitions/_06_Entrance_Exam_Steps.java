package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class _06_Entrance_Exam_Steps {

    FormContent fc=new FormContent();

    @When("Click on the element in the FormContent")
    public void clickOnTheElementInTheFormContent(DataTable element) {

        List<String> listElement=element.asList(String.class);
        for (int i=0;i<listElement.size();i++){
            fc.findAndClick(listElement.get(i));

        }
    }

    @And("User sending the keys in FormContetnt")
    public void userSendingTheKeysInFormContetnt(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i=0;i<listElement.size();i++){
            fc.findAndSendFormContetnt(listElement.get(i).get(0), listElement.get(i).get(1));

        }
    }

}

