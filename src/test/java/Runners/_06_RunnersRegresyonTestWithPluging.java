package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;

@CucumberOptions(//or olduguunda herhangi biri varsa calistirir and yazarsak her ikisinin oldugu senaryolar calistirilir

       // tags = "@Regresyon",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}

       // plugin = { "html:target\\cucumber-reports.html" }
)

public class _06_RunnersRegresyonTestWithPluging extends AbstractTestNGCucumberTests {



}

