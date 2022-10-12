package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(
            publish = false,
            snippets = CucumberOptions.SnippetType.CAMELCASE,
            features = "src/test/resources/features",
            glue = "steps",
            dryRun = false,
            tags = "@smoke",
            monochrome = true
    )


public class RunnerTest {

}