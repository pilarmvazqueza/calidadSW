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

    public double calcularCuotaSinInteres(double montoTotal, int cantidadCuotas) {
        if (montoTotal < 0) {
            throw new IllegalArgumentException("El monto total no puede ser negativo");
        }
        if (cantidadCuotas <= 0) {
            throw new IllegalArgumentException("La cantidad de cuotas debe ser mayor a cero");
        }
        return montoTotal / cantidadCuotas;
    }
    public static void main(String[] args) {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        System.out.println("=== Calculadora de Descuentos ===");
        System.out.println("Precio $10.000 con 15% desc.: $" + calc.aplicarDescuento(10000, 15));
        System.out.println("Total $55.000 con envío: $" + calc.calcularTotalConEnvio(55000, 3000));
        System.out.println("¿Apto cupón bienvenida ($12.000, 1ra compra)?: " + calc.esAptoCuponBienvenida(12000, true));
        System.out.println("6 cuotas sin interés de $15.000: $" + calc.calcularCuotaSinInteres(15000, 6));
    }
}