package com.fnavas.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void saludo_deberia_formatear_correctamente() {
        assertEquals("Hola, Portfolio!", App.saludo("Portfolio"));
    }
}
