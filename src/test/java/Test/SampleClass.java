package Test;

import API.APIClass;
import Base.BaseMethod;
import Utils.Utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SampleClass {
    @Test
    public void sampletest(){
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Report/API_"+BaseMethod.getCurrentDateTime()+".html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        ExtentTest logger = extent.createTest("ApiTest");
        logger.log(Status.INFO,"GET METHOD");
        logger.log(Status.PASS,"GET METHOD");
        logger.log(Status.INFO,"POST METHOD");
        logger.log(Status.PASS,"POST METHOD");
        extent.flush();
        BaseMethod.getMethod();
        BaseMethod.postMethod("morpheus","leader");
    }
}
