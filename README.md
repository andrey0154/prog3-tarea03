# Reflexión - Tarea 3

1. **Atributos privados:** Sí compilarían. `items` es un atributo privado de `Pedido` y `precioBase` de `ItemMenu`, por lo que sus propias clases tienen acceso directo a ellos; no compilan en `App` porque los miembros `private` solo son accesibles dentro de la misma clase que los declara

2. **Método protected:** Sí compila. El modificador `protected` permite el acceso a subclases y a cualquier clase dentro del mismo paquete. Dado que `App` e `ItemMenu` comparten el paquete `uam.prog3.tarea03`, `App` tiene permiso para llamar a `getPrecioBase()`
