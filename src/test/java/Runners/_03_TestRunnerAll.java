package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/"},//sadece featureFiles klasorune kadar yazarsak tum testleri calistirir.
        glue = {"StepDefinitions"}

)





public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {

}
