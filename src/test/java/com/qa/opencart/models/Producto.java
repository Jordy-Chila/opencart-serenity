package com.qa.opencart.models;

public class Producto {

    private String nombre;

    public Producto() {
        // Constructor requerido por Cucumber
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
