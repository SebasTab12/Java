# ejercicios

API REST en Java con Spring Boot para consultar ejercicios de entrenamiento y los músculos que trabajan.

## Endpoints

| Método | Ruta | Descripción |
| --- | --- | --- |
| GET | `/` | Prueba de que el servidor está arriba (`Hola mundo`). |
| GET | `/ejercicios` | Devuelve la lista completa de ejercicios. |
| GET | `/musculo?musculo={musculo}` | Filtra los ejercicios que trabajan ese músculo. |

El valor de `musculo` debe coincidir exactamente con uno de los músculos del ejercicio.

## Ejemplos

- <http://localhost:3000/>
- <http://localhost:3000/ejercicios>
- <http://localhost:3000/musculo?musculo=glúteos>
- <http://localhost:3000/musculo?musculo=tríceps>

## Cómo ejecutar

Desde IntelliJ IDEA, ejecutar la clase `EjerciciosApplication`.

O desde la terminal:

```bash
./mvnw spring-boot:run
```

La API queda disponible en <http://localhost:3000>.
