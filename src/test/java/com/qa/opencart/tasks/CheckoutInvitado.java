package com.qa.opencart.tasks;

import com.qa.opencart.interactions.Esperar;
import com.qa.opencart.models.Cliente;
import com.qa.opencart.ui.CheckoutPage;
import com.qa.opencart.utils.LectorJson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CheckoutInvitado implements Task {

    private final Cliente cliente;

    public CheckoutInvitado(Cliente cliente) {
        this.cliente = cliente;
    }

    public static CheckoutInvitado conDatos() {
        Cliente cliente = LectorJson.leer(
                "data/clientes.json",
                "guest",
                Cliente.class
        );
        return new CheckoutInvitado(cliente);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                // Esperar que el bloque de checkout esté visible
                Esperar.hastaQueSeaVisible(CheckoutPage.CONTENEDOR_CHECKOUT),

                // Guest checkout
                Esperar.hastaQueSeaClicable(CheckoutPage.OPCION_GUEST),
                Click.on(CheckoutPage.OPCION_GUEST),
                Click.on(CheckoutPage.BOTON_CONTINUAR_GUEST),

                // Billing
                Esperar.hastaQueSeaVisible(CheckoutPage.FIRST_NAME),
                Enter.theValue(cliente.getFirstName()).into(CheckoutPage.FIRST_NAME),
                Enter.theValue(cliente.getLastName()).into(CheckoutPage.LAST_NAME),
                Enter.theValue(cliente.getEmail()).into(CheckoutPage.EMAIL),
                Enter.theValue(cliente.getTelephone()).into(CheckoutPage.TELEPHONE),
                Enter.theValue(cliente.getAddress()).into(CheckoutPage.ADDRESS),
                Enter.theValue(cliente.getCity()).into(CheckoutPage.CITY),
                Enter.theValue(cliente.getPostcode()).into(CheckoutPage.POSTCODE),

                SelectFromOptions.byVisibleText(cliente.getCountry())
                        .from(CheckoutPage.COUNTRY),

                Esperar.hastaQueSeaVisible(CheckoutPage.ZONE),
                SelectFromOptions.byVisibleText(cliente.getZone())
                        .from(CheckoutPage.ZONE),

                Click.on(CheckoutPage.BOTON_CONTINUAR_BILLING),

                // Delivery
                Esperar.hastaQueSeaClicable(CheckoutPage.BOTON_CONTINUAR_DELIVERY),
                Click.on(CheckoutPage.BOTON_CONTINUAR_DELIVERY),

                // Shipping
                Esperar.hastaQueSeaClicable(CheckoutPage.BOTON_CONTINUAR_SHIPPING),
                Click.on(CheckoutPage.BOTON_CONTINUAR_SHIPPING),

                // Payment
                Esperar.hastaQueSeaClicable(CheckoutPage.ACEPTAR_TERMINOS),
                Click.on(CheckoutPage.ACEPTAR_TERMINOS),
                Click.on(CheckoutPage.BOTON_CONTINUAR_PAGO),

                // Confirm
                Esperar.hastaQueSeaClicable(CheckoutPage.BOTON_CONFIRMAR),
                Click.on(CheckoutPage.BOTON_CONFIRMAR)
        );
    }
}
