import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Android_Sample {

    public AndroidDriver androidDriver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("app", "/Users/shanliu/TW/QA/Mobile/AppiumDemo/src/test/apps/huobi-0.apk");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("fullReset", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        androidDriver = new AndroidDriver(remoteUrl, capabilities);
    }

    @Test
    public void advertiseTest() {

        WebElement nextElem = androidDriver.findElementByAccessibilityId("Next");
        nextElem.click();
        nextElem.click();
        WebElement doneElem = androidDriver.findElementById("com.google.android.apps.docs:id/done");
        doneElem.click();

    }

    @AfterClass
    public void tearDown() {
        androidDriver.quit();
    }
}
