package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
				plugin = {
						"html:CucumberReports/HTML", 
						"json:CucumberReports/Jason/MyJasonReport.json",
						"junit:CucumberReports/Junit/MyJunitReport.xml",
						"pretty:CucumberReports/Pretty/MyPretty.txt",
						"usage:CucumberReports/Usage/UsageReport.xml"
				},
				
		features = "MyFeatures"
		,glue = "stepdefination",
		dryRun = false,
		//tags = {"@Test05","@Test06","@Test07"}
		tags = {"@Test01"}
		
		)

public class TestRunner {

}
