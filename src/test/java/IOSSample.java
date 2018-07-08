

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class IOSSample {

    public IOSDriver IOSdriver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.out.println("[log] Set capabilities...");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 8");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "11.3");
        capabilities.setCapability("app", "/Users/shanliu/TW/QA/Mobile/AppiumDemo/src/test/apps/shoppingIOS.app");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("fullReset", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        IOSdriver = new IOSDriver(remoteUrl, capabilities);
    }

    @Test
    public void loginTest() {
        WebElement userElem = IOSdriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"shoppingIOS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[1]");
        userElem.sendKeys("test");

        WebElement passwordElem = IOSdriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"shoppingIOS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[2]");
        passwordElem.sendKeys("test");

        WebElement loginElem = IOSdriver.findElementByAccessibilityId("登录");
        loginElem.click();

    }

    @AfterClass
    public void tearDown() {
        IOSdriver.quit();
    }

}
