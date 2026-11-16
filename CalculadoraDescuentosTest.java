package com.calidad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescuentosTest {

    private final CalculadoraDescuentos calc = new CalculadoraDescuentos();

    @Test
    void testAplicarDescuentoValido() {
        assertEquals(800.0, calc.aplicarDescuento(1000.0, 20.0), 0.001);
    }

    @Test
    void testAplicarDescuentoInvalidoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> calc.aplicarDescuento(1000.0, 150.0));
    }

    @Test
    void testCalcularTotalConEnvioMenorAlMinimo() {
        assertEquals(25000.0, calc.calcularTotalConEnvio(20000.0, 5000.0), 0.001);
    }

    @Test
    void testCalcularTotalConEnvioGratis() {
        assertEquals(60000.0, calc.calcularTotalConEnvio(60000.0, 5000.0), 0.001);
    }

    @Test
    void testEsAptoCuponBienvenida() {
        assertTrue(calc.esAptoCuponBienvenida(15000.0, true));
        assertFalse(calc.esAptoCuponBienvenida(15000.0, false));
    }
}