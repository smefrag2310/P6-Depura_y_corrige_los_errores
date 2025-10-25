# P6-Depura_y_corrige_los_errores
## 1. Código corregido y comentado

## 2. Errores encontrados y solución de los mismos
- 1er error: Después de introducir una temperatura, cuando el programa pregunta al usuario si quiere introducir otra, y el usuario responde "s", el programa finaliza igualmente. Esto ocurre debido a que sc.close() se encontraba dentro del bucle, y como ya está cerrado desde la primera vuelta por estar dentro del while, el programa es incapaz de leer la respuesta que dió el usuario y lanza una exception. Para solucionarlo lo único necesario es trasladar el sc.close() fuera del bucle while
## 3. Importancia de la documentación de un programa
