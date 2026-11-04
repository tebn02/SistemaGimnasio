# Manual de Usuario - Sistema de Gestión de Gimnasio

## 1. Introducción

El Sistema de Gestión de Gimnasio permite administrar información básica relacionada con socios, entrenadores, rutinas, ejercicios y membresías.

## 2. Funciones principales

El sistema permite:

- Registrar socios.
- Crear entrenadores.
- Crear rutinas.
- Agregar ejercicios a las rutinas.
- Asignar rutinas a los socios.
- Crear y asignar membresías.
- Consultar el estado de una membresía.
- Renovar o cancelar membresías.
- Guardar información de socios en la base de datos.
- Consultar socios registrados en la base de datos.

## 3. Funcionamiento

Al ejecutar el sistema se muestra en la consola la información principal del socio.

El sistema muestra datos como:

- Nombre del socio.
- Rutina asignada.
- Objetivo de la rutina.
- Duración.
- Ejercicios.
- Estado de la membresía.
- Fecha de vencimiento.

También se muestran mensajes que indican cuando un socio o una membresía han sido guardados correctamente en la base de datos.

## 4. Ejemplo

Al ejecutar el sistema se puede obtener una salida similar a:

```text
===== SISTEMA DE GIMNASIO =====

Socio:
Juan Perez

Rutina asignada:
Rutina de fuerza

Objetivo:
Aumentar masa muscular

Membresia:
Mensual - Activa
```

## 5. Base de datos

El sistema guarda información de los socios y sus membresías utilizando una base de datos H2.

Esto permite conservar la información y consultarla posteriormente.

## 6. Pruebas

El sistema cuenta con pruebas automáticas que permiten comprobar que sus funciones principales trabajan correctamente.