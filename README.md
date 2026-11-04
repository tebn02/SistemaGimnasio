# Sistema de Gestión de Gimnasio

Proyecto desarrollado en Java como implementación de un sistema de gestión para un gimnasio.

## Funcionalidades

El sistema permite:

- Registrar socios.
- Crear entrenadores.
- Crear rutinas.
- Agregar ejercicios a las rutinas.
- Asignar rutinas a los socios.
- Crear y asignar membresías.
- Consultar membresías.
- Renovar y cancelar membresías.
- Guardar socios y membresías en una base de datos H2.
- Consultar información almacenada en la base de datos.

## Clases principales

- Socio
- Entrenador
- Rutina
- Ejercicio
- Membresia
- Empleado
- Administrador
- Recepcionista

## Persistencia

El proyecto utiliza H2 Database para almacenar información.

Las clases principales relacionadas con la persistencia son:

- ConexionBD
- SocioDAO
- MembresiaDAO

## Pruebas

Se utilizaron pruebas unitarias con JUnit.

Se realizaron pruebas sobre:

- Socios.
- Rutinas.
- Membresías.
- Persistencia en base de datos.

## Documentación

El proyecto incluye:

- JavaDoc.
- Manual técnico.
- Manual de usuario.

Los manuales se encuentran en la carpeta:

`documentacion`

La documentación JavaDoc se encuentra en:

`docs/index.html`

## Tecnologías utilizadas

- Java 21
- H2 Database
- JUnit Jupiter
- JavaDoc
- Visual Studio Code
- Git
- GitHub

## Estructura principal

- `src`: código fuente.
- `test`: pruebas unitarias.
- `lib`: librerías.
- `docs`: JavaDoc.
- `documentacion`: manual técnico y manual de usuario.
- `capturas`: evidencias de funcionamiento.