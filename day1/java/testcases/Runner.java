package testcases;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/java/features",glue="pages",monochrome = true,publish = true)
public class Runner extends BaseClass {

}




