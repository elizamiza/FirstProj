import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * Created by elizamae on 11/15/16.
 */

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/resources/belly.feature")
public class BellyRunner {
}
