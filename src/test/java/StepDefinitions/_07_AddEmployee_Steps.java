package StepDefinitions;

import Pages.FormContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _07_AddEmployee_Steps {
    FormContent fc=new FormContent();
    @And("Action Escape")
    public void actionEscape() {
        Actions actions=new Actions(GWD.getDriver());
        Action action=actions.keyDown(Keys.ESCAPE).build();
        action.perform();

        Action action1=actions.keyUp(Keys.ESCAPE).build();
        action.perform();

    }

    @And("Already message should be displayed")
    public void alreadyMessageShouldBeDisplayed(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);
        for (int i=0;i< listElements.size();i++) {
            fc.findAndContainsText(listElements.get(i).get(0),listElements.get(i).get(1));
        }
    }

    @And("wait visibil target")
    public void waitVisibilTarget(DataTable elements) {
        List<List<String>> listElements=elements.asLists(String.class);
        for (int i=0;i< listElements.size();i++){
            fc.WaitTextToBePresentInElementForm(listElements.get(i).get(0),listElements.get(i).get(1));
        }



    }
}
