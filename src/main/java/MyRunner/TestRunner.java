package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Softtech\\eclipse-workspace\\POM\\BDD_FreeCRM\\src\\main\\java\\Features\\MapDealContact.feature"
				,glue = {"stepDefinitions"},
		         format = {"pretty","html:test-output", "json:json_output/login.json", "junit:xml_output/login.xml"}
		,dryRun=false,strict=false,monochrome=true
		        		 )
		         


public class TestRunner {

}
