PRUEBA E2E – FLUJO DE COMPRA OPENCART

Este proyecto corresponde a una prueba funcional automatizada End-to-End (E2E)
del flujo de compra como invitado en la tienda OpenCart, disponible en:

http://opencart.abstracta.us/

El objetivo principal de esta prueba es validar que un usuario pueda recorrer
el flujo de compra completo sin autenticarse, desde el acceso al sitio hasta
la generación del reporte de ejecución.

--------------------------------------------------
HERRAMIENTAS UTILIZADAS
--------------------------------------------------
- Java 11
- Apache Maven
- Serenity BDD
- Cucumber
- Selenium WebDriver
- IntelliJ IDEA
- Google Chrome

--------------------------------------------------
DESCRIPCIÓN DE LA PRUEBA
--------------------------------------------------
El proyecto está estructurado siguiendo el patrón de Serenity con Cucumber,
separando responsabilidades en:

- Runner: configuración y ejecución de los escenarios
- Step Definitions: definición de los pasos Gherkin
- Steps: acciones sobre la aplicación
- Feature: definición del escenario en lenguaje Gherkin

El escenario automatizado simula el flujo de compra como invitado en OpenCart.

--------------------------------------------------
ESCENARIO AUTOMATIZADO
--------------------------------------------------
El escenario cubre los siguientes pasos funcionales:

1. Acceso a la página principal de OpenCart
2. Agregado de productos al carrito de compras
3. Visualización del carrito
4. Inicio del proceso de Checkout
5. Ejecución del flujo como usuario invitado
6. Finalización del proceso de compra

--------------------------------------------------
EJECUCIÓN DEL PROYECTO
--------------------------------------------------
Para ejecutar la prueba, seguir los siguientes pasos:

1. Clonar el repositorio
2. Abrir el proyecto en IntelliJ IDEA
3. Verificar que Java 11 y Maven estén correctamente configurados
4. Desde la raíz del proyecto, ejecutar el comando:

   mvn clean verify

--------------------------------------------------
RESULTADO DE LA EJECUCIÓN
--------------------------------------------------
La ejecución del comando finaliza correctamente con estado:

BUILD SUCCESS

Durante la ejecución:
- El proyecto compila sin errores
- Los recursos de prueba son procesados correctamente
- Serenity genera el reporte de ejecución automáticamente

--------------------------------------------------
REPORTE DE RESULTADOS
--------------------------------------------------
Al finalizar la ejecución se genera el reporte de Serenity en la ruta:

target/site/serenity/index.html

El reporte incluye:
- Resumen de la ejecución
- Detalle de los pasos ejecutados
- Evidencia visual del flujo (cuando aplica)
- Estado general del escenario

--------------------------------------------------
OBSERVACIONES
--------------------------------------------------
- La prueba corresponde a un flujo E2E representativo del proceso de compra.
- El entorno utilizado es público y únicamente con fines de prueba.
- El proyecto queda preparado para extender escenarios adicionales.
- La ejecución y generación de reportes se realiza de forma automatizada
  mediante Maven y Serenity.
