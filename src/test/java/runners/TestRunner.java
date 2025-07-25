package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",        // .feature dosyalarının yolu
        glue = {"stepdefinitions", "hooks"},             // step ve hook klasörleri
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",          // HTML raporu
                "json:target/cucumber.json",                 // JSON raporu (Jenkins için faydalı)
                "junit:target/cucumber.xml"                  // JUnit XML raporu (CI/CD uyumlu)
        },
        monochrome = true,                               // Log çıktısını sadeleştirir
        dryRun = true,                                    // true yapılırsa testler çalışmaz, eksik step'leri gösterir
        tags = "@register_free"
)
public class TestRunner {
}
