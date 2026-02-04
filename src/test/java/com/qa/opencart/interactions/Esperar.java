package com.qa.opencart.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Esperar implements Interaction {

    private final Target target;
    private final TipoEspera tipo;

    private Esperar(Target target, TipoEspera tipo) {
        this.target = target;
        this.tipo = tipo;
    }

    public static Esperar hastaQueSeaVisible(Target target) {
        return new Esperar(target, TipoEspera.VISIBLE);
    }

    public static Esperar hastaQueSeaClicable(Target target) {
        return new Esperar(target, TipoEspera.CLICABLE);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (tipo) {
            case VISIBLE:
                actor.attemptsTo(
                        WaitUntil.the(target, isVisible())
                                .forNoMoreThan(15).seconds()
                );
                break;

            case CLICABLE:
                actor.attemptsTo(
                        WaitUntil.the(target, isClickable())
                                .forNoMoreThan(15).seconds()
                );
                break;
        }
    }

    private enum TipoEspera {
        VISIBLE,
        CLICABLE
    }
}
