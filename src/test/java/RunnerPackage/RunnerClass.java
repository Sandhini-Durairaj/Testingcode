package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(
		features = "src/test/java/features",
		glue="steps",
		dryRun = false,
		snippets = SnippetType.CAMELCASE,
		tags = "@book")

public class RunnerClass  extends AbstractTestNGCucumberTests{

}

