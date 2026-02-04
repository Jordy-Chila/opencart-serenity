package com.qa.opencart.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.Map;

public class LectorJson {

    public static <T> T leer(String archivo, String nodo, Class<T> clase) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = LectorJson.class
                    .getClassLoader()
                    .getResourceAsStream(archivo);

            Map<String, Object> data = mapper.readValue(is, Map.class);
            return mapper.convertValue(data.get(nodo), clase);

        } catch (Exception e) {
            throw new RuntimeException("Error leyendo JSON: " + archivo, e);
        }
    }
}
