package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtilities;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class _11_JDBCSteps {
    @Then("Send The query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu) {
        //DB den gerekli listeyi alacaz
        //Webden gerekli isimleiri alacaz ve karsilastiracaz
        ArrayList<ArrayList<String>> dbList= DBUtilities.getListData(sorgu);
        System.out.println("dbList = " + dbList);

        DialogContent dc=new DialogContent();
        List<WebElement> UIList =dc.waitUntilVisibleAllElements(dc.nameList);
        for (WebElement e:UIList){
            System.out.println("e.getText() = " + e.getText());
        }
        for (int i = 0; i < dbList.size(); i++) {
            Assert.assertEquals("Hatali durum",dbList.get(i).get(1), UIList.get(i).getText());
        }

    }
}
