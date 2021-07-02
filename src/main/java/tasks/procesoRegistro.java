package tasks;

import interactions.Esperar;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterface.UtestUserInterface;

public class procesoRegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.estosSegundos(10),
                Click.on(UtestUserInterface.BTN_REGISTRO),
                Enter.theValue("Ana").into(UtestUserInterface.TXT_NOMBRE),
                Enter.theValue("Rosales").into(UtestUserInterface.TXT_APELLIDO),
                Enter.theValue("anitarosales21@gmail.com").into(UtestUserInterface.TXT_EMAIL),
                Click.on(UtestUserInterface.FECHAMES),
                SelectFromOptions.byVisibleText("February").from(UtestUserInterface.FECHAMES),
                SelectFromOptions.byVisibleText("23").from(UtestUserInterface.FECHADIA),
                SelectFromOptions.byVisibleText("1989").from(UtestUserInterface.FECHAANIO),
                Scroll.to(UtestUserInterface.CAMPOIDIOMA),
                Click.on(UtestUserInterface.CAMPOIDIOMA),
                Click.on(UtestUserInterface.SELECIDIOMA),
                Click.on(UtestUserInterface.BOTON1),
                Esperar.estosSegundos(5),
                Click.on(UtestUserInterface.TXT_CIUDAD),
                Esperar.estosSegundos(10),
                Click.on(UtestUserInterface.BOTON2),
                Click.on(UtestUserInterface.MARCACEL),
                Enter.theValue("Motorola").into(UtestUserInterface.INPUTMARCACEL).thenHit(Keys.ENTER),
                Click.on(UtestUserInterface.VERSIONCEL),
                Enter.theValue("Moto G9 Plus").into(UtestUserInterface.INPUTVERSIONCEL).thenHit(Keys.ENTER),
                Click.on(UtestUserInterface.SOCEL),
                Click.on(UtestUserInterface.INPUTSOCEL),
                Click.on(UtestUserInterface.BOTON3),
                Enter.theValue("AnaRosales2021").into(UtestUserInterface.PASSWORD),
                Enter.theValue("AnaRosales2021").into(UtestUserInterface.CONFIRMPASSWORD),
                Click.on(UtestUserInterface.TERMINOS),
                Click.on(UtestUserInterface.POLITICAS),
                Click.on(UtestUserInterface.BOTON4)

        );
    }

    public static procesoRegistro on() {
        return Instrumented.instanceOf(procesoRegistro.class).withProperties();
    }
}
