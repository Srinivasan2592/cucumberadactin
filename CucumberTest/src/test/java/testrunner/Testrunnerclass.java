package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources" , glue = {"loginstepdefinition"} , monochrome = true , tags = {"@login", "@book_a_hotel","@Select_hotel", "@hotel_search"} ) 

public class Testrunnerclass {

}
 	