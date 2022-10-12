package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
                            //ismi kafana gore yazabilirsin//istedigin feature larda senaryonun ustune yaziyorsun
        tags = "@SmokeTest",//hangi senaryolarda bu etiket varsa onlar calistirilacak
        features = {"src/test/java/FeatureFiles/"},     //buraya features larin yolu verilecek
        glue = {"StepDefinitions"}   ,                                  //stepsDefinitions larin klasoru yazilacak.

       // plugin = {"html:target//cucumber-reports.html"}//jenkins icin ekledik
        plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}

)


public class _04_SmokeTest extends AbstractTestNGCucumberTests {//buradan run yapiyoruz
}
