package com.qa.opencart.stepdefinitions;

import com.qa.opencart.models.Producto;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableDefinitions {

    @DataTableType
    public Producto definirProducto(Map<String, String> fila) {
        return new Producto(
                fila.get("nombre")
        );
    }
}
