package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import screens.CalcScreen;

import java.util.concurrent.ThreadLocalRandom;


public class CalcularStep {

    private final CalcScreen calcScreen = new CalcScreen();

    public int FirstRand;
    public int SecondRand;

    @Dado("que aperto o botão {int}")
    public void que_aperto_o_botão(Integer int1) {

        calcScreen.clickNumeric(int1);

    }

    @Quando("eu aperto o botão somar")
    public void eu_aperto_o_botão_somar() {

        calcScreen.clickSoma();

    }

    @Quando("informo o valor {int}")
    public void informo_o_valor(Integer int1) {

        calcScreen.clickNumeric(int1);

    }

    @Então("o resultado deve ser {string}")
    public void o_resultado_deve_ser(String exp) {

        calcScreen.clickIgual();
        Assert.assertEquals(calcScreen.getResultadoFinal(),exp);

    }


    @Dado("que informo o primeiro valor randomico")
    public void queInformoOPrimeiroValorRandomico() {

        FirstRand = ThreadLocalRandom.current().nextInt(1000, 10000);
        calcScreen.clickNumeric(FirstRand);

    }
    @Quando("informo o segundo valor randomico")
    public void informoOSegundoValorRandomico() {

        SecondRand = ThreadLocalRandom.current().nextInt(1000, 10000);
        calcScreen.clickNumeric(SecondRand);
    }
    @Então("o resultado deve ser a soma dos valores randomicos")
    public void oResultadoDeveSerASomaDosValoresRandomicos() {

        String cast;
        cast = String.valueOf(FirstRand+SecondRand);

        calcScreen.clickIgual();
        Assert.assertEquals(calcScreen.getResultadoFinal(),cast);

    }


}
