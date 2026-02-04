package com.qa.opencart.questions;

import com.qa.opencart.ui.CheckoutPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeDeConfirmacion {

    public static Question<String> texto() {
        return actor ->
                Text.of(CheckoutPage.MENSAJE_CONFIRMACION)
                        .viewedBy(actor)
                        .asString();
    }
}
