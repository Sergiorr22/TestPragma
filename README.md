# TestPragma

- [Introducción](#introducción)
- [Pre-requisitos](#pre-requisitos)
- [Instalación](#instalación)
- [Ejecución](#Ejecución-de-Pruebas)
- [En caso de fallo](#en-caso-de-fallo)
- [Reporte Serenity](#reporte-serenity)
- [Evidencias](#evidencias-pruebas)


# Proyecto de Automatización de Pruebas

Este proyecto contiene las pruebas automatizadas para la aplicación usando 
Serenity BDD y patron de diseño POM.

## Introducción

Este proyecto utiliza Selenium, Serenity BDD y el patrón 
"Page Object Model" que proporciona un conjunto de pruebas
automatizadas para asegurar la calidad del software.

## Pre-requisitos

Asegúrate de tener instalados los siguientes software antes de 
ejecutar las pruebas:

- [Java JDK 8 o superior](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Gradle](https://gradle.org/install/)
- [Git](https://git-scm.com/downloads)

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/Sergiorr22/TestPragma.git
    cd tu-repositorio
    ```

2. Compila el proyecto:

    ```bash
    gradle clean build
    ```

## Ejecución de Pruebas

Para ejecutar las pruebas, ir a la siguiente ruta y 
ejecutar el runner con el tag @E2E

```bash
    java/runners/Runner.java
 ```


## Reporte Serenity

Para validar las evidencias tomadas en el proceso
de prueba validar la ruta

```bash
Pragmatest/target/site/serenity/index.html
 ```

## Evidencias pruebas

Sumado a los reportes realizados con Serenity BDD
se entregan PDF con la evidencia de ejecución de 
los casos de pruebas, estos estaran en la siguiente
ruta

```bash
PragmaTest\src\test\resources
 ```


