package com.qa.opencart.tasks;

import com.qa.opencart.models.Producto;
import com.qa.opencart.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class AgregarProductos implements Task {

    private final List<Producto> productos;

    public AgregarProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public static AgregarProductos alCarrito(List<Producto> productos) {
        return new AgregarProductos(productos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (Producto producto : productos) {
            actor.attemptsTo(
                    Click.on(
                            HomePage.botonAgregarProductoPorNombre(
                                    producto.getNombre()
                            )
                    )
            );
        }
    }
}
