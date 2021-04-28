package adactinrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/resources/Adactinwithheader" , glue = "adactin1dwithheader" )

public class OneDwithheader {
	

}
