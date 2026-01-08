package com.qa.opencart.stepdefinitions;

import com.qa.opencart.steps.PurchaseSteps;
import io.cucumber.java.en.*;

public class PurchaseStepDefinitions {

    PurchaseSteps purchaseSteps = new PurchaseSteps();

    @Given("que el usuario navega a la pagina de OpenCart")
    public void navegarPagina() {
        purchaseSteps.abrirPagina();
    }

    @When("agrega dos productos al carrito")
    public void agregarProductos() {
        purchaseSteps.agregarProductosAlCarrito();
    }

    @When("visualiza el carrito")
    public void visualizarCarrito() {
        purchaseSteps.visualizarCarrito();
    }

    @When("completa el checkout como invitado")
    public void completarCheckout() {
        purchaseSteps.completarCheckoutInvitado();
    }

    @Then("finaliza la compra y visualiza el mensaje de confirmacion")
    public void validarCompra() {
        purchaseSteps.validarConfirmacionCompra();
    }
}
