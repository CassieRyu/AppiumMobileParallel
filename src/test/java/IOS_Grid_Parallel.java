
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class IOS_Grid_Parallel {

    AppiumDriver driver;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeClass
    @Parameters({"node_port", "device_name", "wdaLocalPort"})
    public void setUp(String node_port, String device_name, String wdaLocalPort ) throws MalformedURLException {
        capabilities.setCapability("app", "/Users/shanliu/TW/QA/Mobile/AppiumDemo/src/test/apps/shoppingIOS.app");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "11.3");
        capabilities.setCapability("deviceName", device_name);
        capabilities.setCapability("wdaLocalPort", wdaLocalPort);

        URL url = new URL("http://localhost:" + node_port +"/wd/hub");
        driver = new IOSDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginTest() {
        IOSUtils utils = new IOSUtils();
        utils.loginTest(driver);

    }

}
