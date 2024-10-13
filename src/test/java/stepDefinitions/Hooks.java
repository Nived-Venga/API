/*
 * package stepDefinitions;
 * 
 * import java.io.File; import java.io.IOException; import
 * java.time.LocalDateTime; import java.time.format.DateTimeFormatter;
 * 
 * import org.openqa.selenium.OutputType; import
 * org.openqa.selenium.TakesScreenshot; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.io.FileHandler; import org.testng.ITestListener;
 * import org.testng.ITestResult;
 * 
 * import io.cucumber.java.After; import io.cucumber.java.Before; import
 * io.cucumber.java.Scenario; import utilities.TestContextSetup;
 * 
 * public class Hooks implements ITestListener { WebDriver driver; private
 * TestContextSetup context;
 * 
 * public Hooks(TestContextSetup context) { this.context = context; }
 * 
 * @Before() public void TestInitiation() { System.out.println("Test started");
 * }
 * 
 * @After()
 * 
 * public void takeScraenshotOnFailure(Scenario scenario) {
 * 
 * if (scenario.isFailed()) {
 * 
 * TakesScreenshot ts = (TakesScreenshot) context.driver;
 * 
 * byte[] src = ts.getScreenshotAs(OutputType.BYTES); scenario.attach(src,
 * "image/png", "screenshot"); //context.getDriver().quit();
 * System.out.println("Test ended"); } } }
 */