package com.calidad;

public class CalculadoraDescuentos {

    public double aplicarDescuento(double precio, double porcentajeDescuento) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100");
        }
        return precio - (precio * (porcentajeDescuento / 100.0));
    }

    public double calcularTotalConEnvio(double subtotal, double costoEnvio) {
        if (subtotal < 0 || costoEnvio < 0) {
            throw new IllegalArgumentException("Los montos no pueden ser negativos");
        }
        // Envío gratis a partir de $50000 (Bug intencional para el hotfix: usa > en vez de >=) (arreglado)
        if (subtotal >= 50000) {
            return subtotal;
        }
        return subtotal + costoEnvio;
    }

    public boolean esAptoCuponBienvenida(double montoCompra, boolean esPrimeraCompra) {
        if (montoCompra < 0) {
            throw new IllegalArgumentException("El monto de compra no puede ser negativo");
        }
        return esPrimeraCompra && montoCompra >= 10000;
    }
}