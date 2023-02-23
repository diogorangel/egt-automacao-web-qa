package runners;

import br.com.bb.ath.ftabb.runner.FTABBCucumberRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(FTABBCucumberRunner.class)
@CucumberOptions(plugin = {"pretty",
							"html:target/cucumber-report",
					        "junit:target/cucumber-report/junitResult.xml",
					        "json:target/cucumber-report/jsonResult.json"},
               features = "classpath:features/000_EGT_Login.feature",
               snippets = SnippetType.CAMELCASE,
             monochrome = true,
             glue = {"steps","br.com.bb.egt.web_qa.utilitarios"},
             tags = {"@001_EGT_Login_Teste"}
				)

public class EGTLogin {

	
}
