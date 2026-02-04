package com.qa.opencart.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VisualizarCarrito {

    private static final Target BOTON_CARRITO =
            Target.the("Botón carrito")
                    .locatedBy("#cart");

    private static final Target VER_CARRITO =
            Target.the("Ver carrito")
                    .locatedBy("//strong[contains(text(),'View Cart')]");

    public static Task actual() {
        return Task.where("{0} visualiza el carrito",
                WaitUntil.the(BOTON_CARRITO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CARRITO),
                WaitUntil.the(VER_CARRITO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(VER_CARRITO)
        );
    }
}
