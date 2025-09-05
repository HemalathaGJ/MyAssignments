package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = "src/main/java/feature",glue={"steps","hooks"},monochrome = true,publish = true,tags = "@Leaftaps")
public class Runner extends BaseClass {

}
