package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                   "src/test/java/FeatureFiles/_02_Country.feature"

        },
        glue = {"StepDefinitions"},
       // dryRun = true              //sadece featurelere ait stepsleri varmi yok mu onu kontrol ediyor.run yapmiyor
        dryRun = false         //false de normal run yapar
)

public class _02_TestRunnersBelirliFeatureler extends AbstractTestNGCucumberTests {
}
