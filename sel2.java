package selenium;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(plugin="json:target\\Jsonreport.json")
public class sel2 {

}
