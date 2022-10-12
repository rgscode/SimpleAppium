package screens;

import configuration.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.util.LinkedList;

public class CalcScreen extends BaseScreen {


    @AndroidFindBy(id = "op_add")
    MobileElement soma;

    @AndroidFindBy(accessibility = "minus")
    MobileElement sub;

    @AndroidFindBy(accessibility = "multiply")
    MobileElement mult;

    @AndroidFindBy(accessibility = "divide")
    MobileElement div;

    @AndroidFindBy(accessibility = "percent")
    MobileElement perc;

    @AndroidFindBy(accessibility = "equals")
    MobileElement igual;

    @AndroidFindBy(accessibility = "clear")
    MobileElement limpar;

    @AndroidFindBy(accessibility = "delete")
    MobileElement apagar;

    @AndroidFindBy(id = "op_sqrt")
    MobileElement raiz;

    @AndroidFindBy(id = "result_preview")
    MobileElement resultadoParcial;

    @AndroidFindBy(id = "result_final")
    MobileElement resultadoFinal;


    public void clickSoma(){
        soma.click();
    }

    public void clickSub(){
        sub.click();
    }

    public void clickMult(){
        mult.click();
    }

    public void clickDiv(){
        div.click();
    }

    public void clickPerc(){
        perc.click();
    }

    public void clickIgual(){
        igual.click();
    }

    public void clickLimpar(){
        limpar.click();
    }

    public void clickApagar(){
        apagar.click();
    }

    public void clickRaiz(){
        raiz.click();
    }

    public String getResultadoFinal(){
        waitForElementToBeVisible(resultadoFinal);
        return resultadoFinal.getText();
    }


    public void clickNumeric(int num) {

        LinkedList<Integer> stack = new LinkedList<>();

        if (num == 0) {
            MobileElement BtnNumeric = DriverFactory.driver.findElement(By.id("com.google.android.calculator:id/digit_"+num));
            type(BtnNumeric);

        }

            while (num > 0) {
                stack.push(num % 10);
                num = num / 10;
            }

            while (!stack.isEmpty()) {
                Integer x = stack.pop();
                MobileElement BtnNumeric = DriverFactory.driver.findElement(By.id("com.google.android.calculator:id/digit_" + x));
                type(BtnNumeric);

            }

    }



}
