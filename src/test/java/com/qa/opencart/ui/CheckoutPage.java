package com.qa.opencart.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {

    public static final Target CONTENEDOR_CHECKOUT =
            Target.the("Contenedor checkout")
                    .locatedBy("#collapse-checkout-option");

    public static final Target OPCION_GUEST =
            Target.the("Opción Guest Checkout")
                    .locatedBy("#collapse-checkout-option input[value='guest']");

    public static final Target BOTON_CONTINUAR_GUEST =
            Target.the("Continuar como invitado")
                    .locatedBy("#button-account");

    public static final Target FIRST_NAME =
            Target.the("First Name")
                    .locatedBy("#input-payment-firstname");

    public static final Target LAST_NAME =
            Target.the("Last Name")
                    .locatedBy("#input-payment-lastname");

    public static final Target EMAIL =
            Target.the("Email")
                    .locatedBy("#input-payment-email");

    public static final Target TELEPHONE =
            Target.the("Telephone")
                    .locatedBy("#input-payment-telephone");

    public static final Target ADDRESS =
            Target.the("Address")
                    .locatedBy("#input-payment-address-1");

    public static final Target CITY =
            Target.the("City")
                    .locatedBy("#input-payment-city");

    public static final Target POSTCODE =
            Target.the("Postcode")
                    .locatedBy("#input-payment-postcode");

    public static final Target COUNTRY =
            Target.the("Country")
                    .locatedBy("#input-payment-country");

    public static final Target ZONE =
            Target.the("Zone")
                    .locatedBy("#input-payment-zone");

    public static final Target BOTON_CONTINUAR_BILLING =
            Target.the("Continuar billing")
                    .locatedBy("#button-payment-address");

    public static final Target BOTON_CONTINUAR_DELIVERY =
            Target.the("Continuar delivery")
                    .locatedBy("#button-shipping-address");

    public static final Target BOTON_CONTINUAR_SHIPPING =
            Target.the("Continuar shipping")
                    .locatedBy("#button-shipping-method");

    public static final Target ACEPTAR_TERMINOS =
            Target.the("Aceptar términos")
                    .locatedBy("input[name='agree']");

    public static final Target BOTON_CONTINUAR_PAGO =
            Target.the("Continuar pago")
                    .locatedBy("#button-payment-method");

    public static final Target BOTON_CONFIRMAR =
            Target.the("Confirmar orden")
                    .locatedBy("#button-confirm");

    public static final Target MENSAJE_CONFIRMACION =
            Target.the("Mensaje de confirmación")
                    .locatedBy("#content h1");
}
