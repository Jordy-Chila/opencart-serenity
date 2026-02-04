package com.qa.opencart.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target botonAgregarProductoPorNombre(String nombreProducto) {
        return Target.the("Botón agregar producto " + nombreProducto)
                .locatedBy(
                        "//h4/a[text()='" + nombreProducto + "']" +
                                "/ancestor::div[contains(@class,'product-thumb')]" +
                                "//button[contains(@onclick,'cart.add')]"
                );
    }
}
