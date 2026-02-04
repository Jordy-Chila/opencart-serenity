package com.qa.opencart.stepdefinitions;

import com.qa.opencart.models.Producto;
import com.qa.opencart.questions.MensajeDeConfirmacion;
import com.qa.opencart.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class PurchaseStepDefinitions {

    private Actor usuario = Actor.named("Usuario");
    private WebDriver driver;

    @Before
    public void configurarActor() {
        driver = ThucydidesWebDriverSupport.getDriver();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Dado("que el usuario navega a la pagina de OpenCart")
    public void navegarPagina() {
        usuario.attemptsTo(
                AbrirPagina.deOpenCart()
        );
    }

    @Cuando("agrega los siguientes productos al carrito:")
    public void agregaProductos(List<Producto> productos) {
        usuario.attemptsTo(
                AgregarProductos.alCarrito(productos)
        );
    }

    @Y("visualiza el carrito")
    public void visualizaCarrito() {
        usuario.attemptsTo(
                VisualizarCarrito.actual()
        );
    }

    @Y("completa el checkout como invitado")
    public void checkoutInvitado() {
        usuario.attemptsTo(
                CheckoutInvitado.conDatos()
        );
    }

    @Entonces("finaliza la compra y visualiza el mensaje de confirmación")
    public void confirmaCompra() {
        usuario.should(
                seeThat(
                        MensajeDeConfirmacion.texto(),
                        containsString("Your order has been placed!")
                )
        );
    }
}
