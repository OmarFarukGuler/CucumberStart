package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_01_Login.feature"},     //buraya features larin yolu verilecek
        glue = {"StepDefinitions"},                                  //stepsDefinitions larin klasoru yazilacak.
        plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}

)
public class _01_TestRunner extends AbstractTestNGCucumberTests {
//burasi browser tipi vermek icin , rapora ek parametre eklemek icin kullanilacak




}
