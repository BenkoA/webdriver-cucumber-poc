package test;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"pretty", "html:target/cucumber"},
        features = {"classpath=/src/test/resources/features}"})

public class runTests {

}