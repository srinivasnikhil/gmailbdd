package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\HOME\\eclipse-workspace\\com.gmail.bdd\\src\\test\\resources\\gmailresources\\Feature1.feature"},
                              glue= {"tests"},
                              monochrome=false,
                              plugin= {"pretty","html:target\\result","rerun:target\\failedresult.txt"})
public class Gmailrunner 
{
}
