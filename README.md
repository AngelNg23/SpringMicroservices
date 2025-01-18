# SpringMicroservices
Microservices Liverpool

# Microservicios con Spring Boot y Base de Datos H2

Este proyecto es un ejemplo de una arquitectura de microservicios utilizando Spring Boot y una base de datos H2.

## Tecnologías Utilizadas

- **Spring Boot**: Framework para construir aplicaciones basadas en Spring.
- **H2 Database**: Base de datos en memoria utilizada para pruebas y desarrollo.
- **Swagger**: Herramienta para la documentación interactiva de APIs.
- **IntelliJ IDEA**: Entorno de Desarrollo Integrado (IDE) utilizado para desarrollar y ejecutar el proyecto.

## Configuración del Proyecto

### 1. Clonar el Repositorio

Clona el repositorio en tu máquina local usando Git:

```sh
git clone https://github.com/tu-usuario/tu-repositorio.git

Me puedes hacer un readme que diga que son microservicios, la forma en como levantarlos en intellij y que usan una base de datos H2
¡Claro! Aquí tienes un ejemplo de un archivo README para tu proyecto de microservicios que utiliza una base de datos H2:

markdown
# Microservicios con Spring Boot y Base de Datos H2

Este proyecto es un ejemplo de una arquitectura de microservicios utilizando Spring Boot y una base de datos H2.

## ¿Qué son los Microservicios?

Los microservicios son un estilo arquitectónico que estructura una aplicación como una colección de servicios pequeños y autónomos, modelados en torno a un dominio de negocio. Cada microservicio es independiente y se comunica con otros servicios mediante protocolos ligeros como HTTP o mensajes asincrónicos. Esta arquitectura permite una mayor agilidad, escalabilidad y facilidad de mantenimiento.

## Tecnologías Utilizadas

- **Spring Boot**: Framework para construir aplicaciones basadas en Spring.
- **H2 Database**: Base de datos en memoria utilizada para pruebas y desarrollo.
- **Swagger**: Herramienta para la documentación interactiva de APIs.
- **IntelliJ IDEA**: Entorno de Desarrollo Integrado (IDE) utilizado para desarrollar y ejecutar el proyecto.

## Configuración del Proyecto

### 1. Clonar el Repositorio

Clona el repositorio en tu máquina local usando Git:

```sh
git clone https://github.com/tu-usuario/tu-repositorio.git
2. Abrir el Proyecto en IntelliJ IDEA
Abre IntelliJ IDEA.

Selecciona File > Open.

Navega hasta el directorio donde clonaste el repositorio y selecciona el proyecto.

IntelliJ IDEA debería detectar automáticamente que el proyecto utiliza Maven/Gradle y cargar las dependencias necesarias.

3. Configurar la Base de Datos H2
La base de datos H2 está configurada en el archivo application.yml

spring:
  datasource:
    url: jdbc:h2:file:./data/testdb
    driver-class-name: org.h2.Driver
    username: sa
    password: password
  jpa:
    hibernate:
      ddl-auto: update
    database-platform: org.hibernate.dialect.H2Dialect
