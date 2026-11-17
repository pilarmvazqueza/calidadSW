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

INCISO 8
8.a)
Se sugiere versionar el README.md en la raíz del repositorio con:
  -Nombre y descripción del proyecto: qué hace el software, contexto del caso de estudio. 
  -Stack tecnológico: lenguaje, framework, versión de JDK/Node/etc. 
  -Cómo levantar el entorno: requisitos previos, comandos de instalación (mvn install, npm install), variables de entorno necesarias. 
  -Cómo correr el proyecto localmente y cómo correr los tests. 
  -Estructura de carpetas relevante. -Convención de ramas usada (Gitflow: main, develop, feature/, release/, hotfix/) y convención de commits/mensajes. 
  -Cómo contribuir: pasos para levantar una rama, abrir un PR, a quién pedir review (referencia a CODEOWNERS). -Estado del CI: badge del workflow de GitHub Actions.
  -Changelog / versión actual (o referencia a los tags de release).
    -Nombre y descripción del proyecto: qué hace el software, contexto del caso de estudio. 
    -Stack tecnológico: lenguaje, framework, versión de JDK/Node/etc. 
    -Cómo levantar el entorno: requisitos previos, comandos de instalación (mvn install, npm install), variables de entorno necesarias. 
    -Cómo correr el proyecto localmente y cómo correr los tests. 
    -Estructura de carpetas relevante. -Convención de ramas usada (Gitflow: main, develop, feature/, release/, hotfix/) y convención de commits/mensajes. 
    -Cómo contribuir: pasos para levantar una rama, abrir un PR, a quién pedir review (referencia a CODEOWNERS). -Estado del CI: badge del workflow de GitHub Actions.
    -Changelog / versión actual (o referencia a los tags de release).

8.b)
Cuando alguien externo al equipo propone un cambio, necesitamos poder entender qué cambió, por qué, y cómo probarlo, sin tener que leer línea por línea todo el diff a ciegas.
Qué le pediríamos que complete:
    -Descripción del cambio: qué problema resuelve o qué funcionalidad agrega.
    -Motivación / contexto: por qué es necesario este cambio (issue relacionado, bug, pedido).
    -Tipo de cambio: fix, feature, breaking change, documentación, etc.
    -Cómo se probó: pasos para reproducir/testear, o tests automáticos agregados.
    -Checklist: ¿agregó tests?, ¿actualizó documentación?, ¿pasa el CI?
    -Issue vinculado (si existe), usando palabras clave como Closes#123 para que GitHub cierre el issue automáticamente al mergear.
Qué nos ofrece GitHub para esto:
    -PR templates (.github/PULL_REQUEST_TEMPLATE.md): un formulario predefinido que se autocompleta al abrir cualquier PR, forzando a que la persona complete esa información.
    -CODEOWNERS: asigna automáticamente reviewers obligatorios según los archivos tocados.
    -Checks de CI (Actions): corre automáticamente el build/tests y muestra el resultado en el propio PR.
    -Diff visual con comentarios en línea, hilos de discusión y "Suggested changes" aplicables con un clic.
    -Labels e Issues vinculados: permiten categorizar el PR y relacionarlo con el trabajo que lo originó.
    -ranch protection rules: exigen que el PR tenga reviews aprobados y CI en verde antes de poder mergear, evitando que un cambio externo entre sin control.
