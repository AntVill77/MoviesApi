Aplicación de películas con arquitectura MVVM en XML Legacy utilizando Data binding y View binding para el flujo de datos y
Se presentan tres filas de películas con recycler view horizontal que presentan películas de diferentes categorías:
-próximos estrenos
-películas populares
-las mejores valoradas

Cuando se elige una película se redirecciona a una pantalla de detalle de película y un breve resumen su contenido

Se consume el api themoviedb con retrofit2 en formato json y se usa un convertidor gson

Para la presentación de imágenes se utiliza Glide.

JavaVersion.VERSION_1_8 (Java 8)
Gradle 7.2
Version Api 31
Android 12

Mejoras 
El proyecto se  mejorará al ser la migración de XML legacy a Jetpack compose (reclycler view a Lazy Column y Lazy Row)
Utilizar en el proyecto flows, corrutinas e inyección de dependencias
Actualizar la navegación a nav compose
Se seguirá utilizando como base MVVM como arwquitectura

