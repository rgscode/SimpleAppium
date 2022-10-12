package configuration;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static AndroidDriver<MobileElement> driver;

    public static void getDriver(String url,String deviceId) {

        if (driver == null) {
            createDriver(url,deviceId);
        }

    }

    public static void createDriver(String url,String deviceId) {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator");

            if (deviceId == null || deviceId.isEmpty()){
                System.out.println("INFO - O device e null/vazio.");
                System.out.println("INFO - O device sera escolhido automaticamente.");
            } else {
                capabilities.setCapability("udid", deviceId);
                System.out.println("INFO - O campo device foi preenchido com o valor : "+ deviceId);
            }

        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        try {
            driver = new AndroidDriver<>(new URL(url), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
