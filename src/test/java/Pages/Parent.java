package Pages;

import Utilities.GWD;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class Parent {

    public void sendKeysFunction(WebElement element, String value) {//3.Aşama
        waitUntilVisible(element); // gözükene kadar bekle
        scrollToElement(element); // elemente scroll yap
        element.clear();   // temizle
        element.sendKeys(value); // değeri gönder

    }

    public void clickFunction(WebElement element)
    {
        waitUntilVisible(element);
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }
 /*   public void OnlyClickFunctionParent(WebElement element){
        waitUntilVisible(element);
        element.click();

    }*/

   /* public void DoubleClickAndSendParent(WebElement element,String text)
    {
       // waitUntilVisible(element);
        waitUntilClickable(element); // tıklanabilir olana kadar bekle
        //scrollToElement(element); // elemente scroll yap
        Actions ac=new Actions(GWD.getDriver());
        Action action= ac.click().build();
                       ac.sendKeys(text).build();
                       action.perform();

    }*/



    public void verifyContainsText(WebElement element, String text)
    {
        waitUntilVisible(element); // gözükene kadar bekle
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }




    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilStalenessParent(WebElement element){
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.stalenessOf(element));

    }
    public void waitUntilinvisibilityOfElementDialog(String locate){
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locate)));

    }
  public void WaitUntilToBeNullParent(WebElement element){
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.attributeToBe(element,"aria-describedby",""));



    }

    public void waitUntilTobe(WebElement element){
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(element,"aria-invalid"));

    }
    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public List<WebElement> waitUntilVisibleAllElements(List<WebElement> elementList) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
   /* public void SelectParent(String locator,String text){
        WebElement ddmenu=GWD.getDriver().findElement(By.xpath(locator));
        Select menu=new Select(ddmenu);

        menu.selectByVisibleText(text);
    }*/
    public void WaitTextToBePresentInElementParent(WebElement element,String target){
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.visibilityOf(element));
        String target1=" "+target;
        wait.until(ExpectedConditions.textToBePresentInElement(element,target1));


    }
}
