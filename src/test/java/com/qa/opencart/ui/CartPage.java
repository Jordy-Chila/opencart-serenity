package com.qa.opencart.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target BOTON_CARRITO =
            Target.the("Botón carrito")
                    .locatedBy("#cart");

    public static final Target VER_CARRITO =
            Target.the("Ver carrito")
                    .locatedBy("//strong[contains(text(),'View Cart')]");
}
