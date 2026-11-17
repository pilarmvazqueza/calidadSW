Calculadora de Descuentos — Trabajo Práctico Calidad de Software

Enlace al documento de seguimiento del TP:[Informe de Trabajo Práctico — Google Docs](https://docs.google.com/document/d/1IqzcuNIOCA5Rv53jSyKNfEWEjn03xnCVGFyP32EZtrs/edit?usp=sharing)

 ¿Qué hace el programa?

La clase CalculadoraDescuentos implementa la lógica de negocio para el cálculo de precios, descuentos y promociones:

-aplicarDescuento(double precio, double porcentajeDescuento): Calcula el precio final aplicando un porcentaje de descuento válido (entre 0% y 100%). Valida que ni el precio ni el porcentaje sean negativos ni superen el 100%.
-calcularTotalConEnvio(double subtotal, double costoEnvio): Calcula el importe total sumando el envío, otorgando envío gratuito cuando el subtotal de compra es mayor o igual a $50.000.
-esAptoCuponBienvenida(double montoCompra, boolean esPrimeraCompra): Verifica si una compra califica para el cupón de bienvenida (requiere que sea la primera compra y un monto igual o superior a $10.000), validando que el monto no sea negativo.
-calcularCuotaSinInteres(double montoTotal, int cantidadCuotas): Calcula el valor de cada cuota dividiendo el monto total por la cantidad de cuotas seleccionadas, validando montos no negativos y cantidades de cuotas mayores a cero.

  Requisitos previos
-Java JDK 17 o superior
-Apache Maven 3.8+
