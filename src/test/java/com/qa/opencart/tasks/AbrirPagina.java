package com.qa.opencart.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina {

    public static Task deOpenCart() {
        return Task.where("{0} abre la pagina de OpenCart",
                Open.url("http://opencart.abstracta.us/")
        );
    }
}
