package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(//or olduguunda herhangi biri varsa calistirir and yazarsak her ikisinin oldugu senaryolar calistirilir

        //tags = "@RegresyonTest or @SmokeTest",//hangi senaryolarda bu etiket varsa onlar calistirilacak
        features = {"src/test/java/FeatureFiles/"},     //buraya features larin yolu verilecek
        glue = {"StepDefinitions"}                     //steps lerin kayitli oldugu yer yazilacak

)

public class _05_RegresyonTest extends AbstractTestNGCucumberTests {

}
