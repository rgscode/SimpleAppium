package steps;

import configuration.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {

            /*
            --     Caso possua mais de um dispoisitivo conectado e queira escolher um deles     --

                        user@name ~/Android/Sdk/emulator$ adb devices
                        List of devices attached
                        emulator-5556	device
                        emulator-5558	device

                   Caso possua apenas um conectado pode deixar o deviceId vazio.
         */


    @BeforeAll
    public static void setUp() {
        DriverFactory.getDriver("http://127.0.0.1:4444/wd/hub","");
    }

    @AfterAll
    public static void tearDown() {
        DriverFactory.quitDriver();
    }

}
