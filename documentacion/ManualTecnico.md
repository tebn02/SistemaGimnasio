# Manual Técnico - Sistema de Gestión de Gimnasio

## 1. Descripción

El Sistema de Gestión de Gimnasio fue desarrollado en Java y permite manejar información relacionada con socios, entrenadores, rutinas, ejercicios y membresías.

El proyecto también cuenta con persistencia de datos mediante una base de datos H2, pruebas unitarias con JUnit y documentación generada con JavaDoc.

## 2. Tecnologías utilizadas

- Java 21.
- H2 Database.
- JUnit Jupiter.
- JavaDoc.
- Visual Studio Code.
- Git y GitHub.

## 3. Estructura del proyecto

El proyecto está dividido principalmente en las siguientes carpetas:

- `src`: contiene las clases principales del sistema.
- `test`: contiene las pruebas unitarias.
- `lib`: contiene las librerías utilizadas, como H2 y JUnit.
- `docs`: contiene la documentación generada con JavaDoc.
- `documentacion`: contiene los manuales del proyecto.
- `capturas`: contiene evidencias del funcionamiento.

## 4. Clases principales

Las principales clases del sistema son:

- `Socio`
- `Entrenador`
- `Rutina`
- `Ejercicio`
- `Membresia`
- `Empleado`
- `Administrador`
- `Recepcionista`

También se agregaron clases relacionadas con persistencia:

- `ConexionBD`
- `SocioDAO`
- `MembresiaDAO`

## 5. Base de datos

El proyecto utiliza H2 como base de datos.

La conexión se realiza mediante:

`ConexionBD.java`

Actualmente se manejan tablas para:

- Socios.
- Membresías.

La información puede ser guardada y consultada desde Java.

## 6. Pruebas

Se utilizaron pruebas unitarias con JUnit para comprobar el funcionamiento de diferentes partes del sistema.

Entre las pruebas realizadas se encuentran:

- Asignación de rutinas.
- Asignación de membresías.
- Renovación de membresías.
- Cancelación de membresías.
- Agregar y eliminar ejercicios.
- Persistencia de socios en la base de datos.

## 7. Ejecución

Para compilar el proyecto:

```bash
javac -cp "lib/*" -d bin src/*.java
```

Para ejecutarlo:

```bash
java -cp "bin:lib/*" Main
```

## 8. Documentación JavaDoc

La documentación JavaDoc se encuentra en:

`docs/index.html`

Desde este archivo se puede consultar la documentación de las clases del sistema.