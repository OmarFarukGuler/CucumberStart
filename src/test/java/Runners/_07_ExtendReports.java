package Runners;



import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

@CucumberOptions(
       // tags = "@Regresyon",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}

)
//@Listeners({ExtentITestListenerClassAdapter.class})

public class _07_ExtendReports extends AbstractTestNGCucumberTests {

}
