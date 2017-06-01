package Com.Project.Tracko;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
features="FeatureFolder",
glue={"Com/Project/Tracko"}
)
public class testngrunner extends AbstractTestNGCucumberTests
{

	@Test
	public void fun()
	{}
}
