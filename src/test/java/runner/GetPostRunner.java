package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Work\\RestAssuredWithCucumber\\src\\test\\java\\features\\GetPost.feature",
                    glue = "C:\\Work\\RestAssuredWithCucumber\\src\\test\\java\\stepdef\\GetPostStepDef" )
public class GetPostRunner {
}
