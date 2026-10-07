# Reflexión - Tarea 3

1. **Atributos privados:** Sí compilarían. `items` es un atributo privado de `Pedido` y `precioBase` de `ItemMenu`, por lo que sus propias clases tienen acceso directo a ellos; no compilan en `App` porque los miembros `private` solo son accesibles dentro de la misma clase que los declara[cite: 3, 4, 7].

2. **Método protected:** Sí compila. El modificador `protected` permite el acceso a subclases y a cualquier clase dentro del mismo paquete[cite: 3, 7]. Dado que `App` e `ItemMenu` comparten el paquete `uam.prog3.tarea03`, `App` tiene permiso para llamar a `getPrecioBase()`[cite: 2, 3].
