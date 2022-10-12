package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import configuration.DriverFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseScreen extends MobileElement {


    public BaseScreen(){

        PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.driver), this);

    }

    protected void type(MobileElement element){
        waitForElementToBeClickable(element);
        element.click();
    }


    protected void waitForElementToBeClickable(MobileElement element){

        new WebDriverWait(DriverFactory.driver,5)
                .until(ExpectedConditions.elementToBeClickable(element));

    }

    protected void waitForElementToBeVisible(MobileElement element){

        new WebDriverWait(DriverFactory.driver,5)
                .until(ExpectedConditions.visibilityOf(element));

    }


}
