/*
 * package runner;
 * 
 * import java.io.File; import java.io.IOException; import
 * java.time.LocalDateTime; import java.time.format.DateTimeFormatter; import
 * java.util.Random;
 * 
 * import org.openqa.selenium.OutputType; import
 * org.openqa.selenium.TakesScreenshot; import
 * org.openqa.selenium.io.FileHandler; import org.testng.ITestContext; import
 * org.testng.ITestListener; import org.testng.ITestResult;
 * 
 * import utilities.TestContextSetup;
 * 
 * public class TestNGListeners implements ITestListener{ //private
 * TestContextSetup context;
 * 
 * // public TestNGListeners(TestContextSetup context) { // this.context =
 * context; //}
 * 
 * @Override public void onTestStart(ITestResult result) {
 * System.out.println("On Test start listener"); }
 * 
 * @Override public void onFinish(ITestContext context1) {
 * TestContextSetup.driver.quit(); }
 * 
 * @Override public void onTestFailure(ITestResult result) { //TestContextSetup
 * context = new TestContextSetup(); System.out.println("Im in Failure");
 * //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss"); //
 * LocalDateTime now = LocalDateTime.now(); // dtf.format(now); //
 * dtf.toString(); //File file
 * =((TakesScreenshot)context.driver).getScreenshotAs(OutputType.FILE);
 * TakesScreenshot scrShot =((TakesScreenshot)TestContextSetup.driver); //Call
 * getScreenshotAs method to create image file File
 * SrcFile=scrShot.getScreenshotAs(OutputType.FILE); //Move image file to new
 * destination String failedTestCaseName = result.getName(); String filepath =
 * "D:\\Screenshots\\" + failedTestCaseName  + ".png" ; File DestFile=new
 * File(filepath); //Copy file at destination // FileUtils.copyFile(SrcFile,
 * DestFile);
 * 
 * 
 * 
 * System.out.println("Failed Name : " + failedTestCaseName + "filepath: " +
 * filepath); //file = new File (filepath); try { FileHandler.copy(SrcFile,
 * DestFile); System.out.println("File Copied"); } catch (IOException e) { //
 * TODO Auto-generated catch block System.out.println("Im in IO Exception");
 * e.printStackTrace(); } } }
 */