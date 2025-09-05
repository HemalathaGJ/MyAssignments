package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClassSalesforce;

@CucumberOptions(features = "src/main/java/feature",glue="steps",monochrome = true,publish= true,tags = "@Salesforce")
public class RunnerSalesforce extends BaseClassSalesforce{

}
