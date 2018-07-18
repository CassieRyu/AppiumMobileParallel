import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class IOSUtils {

    public void loginTest(AppiumDriver driver) {
        WebElement userElem = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"shoppingIOS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[1]");
        userElem.sendKeys("test");

        WebElement passwordElem = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"shoppingIOS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[2]");
        passwordElem.sendKeys("test");

        WebElement loginElem = driver.findElementByAccessibilityId("登录");
        loginElem.click();

    }
}
