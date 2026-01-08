package com.qa.opencart.steps;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PurchaseSteps extends PageObject {

    public void abrirPagina() {
        openUrl("http://opencart.abstracta.us/");
    }

    public void agregarProductosAlCarrito() {
        find(By.xpath("(//button[contains(@onclick,'cart.add')])[1]")).click();
        find(By.xpath("(//button[contains(@onclick,'cart.add')])[2]")).click();
    }

    public void visualizarCarrito() {
        find(By.id("cart")).click();
        find(By.xpath("//strong[contains(text(),'View Cart')]")).click();
    }

    public void completarCheckoutInvitado() {
        find(By.linkText("Checkout")).click();
        find(By.xpath("//input[@value='guest']")).click();
        find(By.id("button-account")).click();
    }

    public void validarConfirmacionCompra() {
        String mensaje = find(By.tagName("h1")).getText();
        assert mensaje.contains("Your order has been placed!");
    }
}
