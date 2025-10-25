# P6-Depura_y_corrige_los_errores
## 1. Código corregido y comentado

## 2. Errores encontrados y solución de los mismos
- **1er error:** Después de introducir una temperatura, cuando el programa pregunta al usuario si quiere introducir otra, y el usuario introduce cualquier dato, ya sea el pedido o no, el programa finaliza igualmente. Esto ocurre debido a que sc.close() se encontraba dentro del bucle, y como ya está cerrado desde la primera vuelta por estar dentro del while, el programa es incapaz de leer la respuesta que dió el usuario y lanza una exception. Para solucionarlo lo único necesario es trasladar el sc.close() fuera del bucle while. Pantallazo del error por consola: [finalizacion_temprana.png](/capturas_ej6/finalizacion_temprana.png)  
- **2do error:** El sysout se encuentra fuera de la condición if, por lo que aunque se elija la opción de continuar con el programa siempre saldrá por consola "Programa finalizado" y luego el programa continuará con normalidad. Para solucionarlo se debe poner el sysout dentro de la condición if, para que solo salga el mensaje si se desea finalizar el programa. Pantallazo del error por consola: [mala_posicion_sysout.png](/capturas_ej6/mala_posicion_sysout.png)
## 3. Importancia de la documentación de un programa
