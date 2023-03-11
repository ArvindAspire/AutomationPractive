package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/feature"},
        glue = {"feature"},
        plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json","html:test-output",
                    "junit:junit_xml/cucumber.xml"}
       /* plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/",
                "rerun:target/rerun.txt"


        }*/,
        monochrome = true
)



public class TestNGRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return  super.scenarios();
    }

}
