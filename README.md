Aplicación de películas con arquitectura MVVM en XML Legacy utilizando Live Data y View binding para el flujo de datos.
Se utiliza una activity con fragments para presentar diferentes categorías de películas
Se utiliza una concatenación de adapters para presentar tres recycler views con diferentes contenidos
Se consume el api themoviedb con retrofit2 en formato json y se usa un convertidor gson
Se incluye la librería media3-exoplayer para el manejo de videos
Para la presentación de imágenes se utiliza Glide.

JavaVersion.VERSION_1_8 (Java 8)
Gradle 7.2
Version Api 34
Android 14

Funcionamiento
Se presentan tres filas de películas con recyclerview horizontal que presentan películas de diferentes categorías:
-próximos estrenos
-películas populares
-las mejores valoradas


Cuando se elige una película se redirecciona a una pantalla de detalle de película y un breve resumen su contenido
En esta pantalla se incluye un video de muestra.


Mejoras 
El proyecto se  puede mejorar si se hace la migración de XML legacy a Jetpack compose (reclycler view a Lazy Column y Lazy Row)
Utilizar en el proyecto flows, corrutinas e inyección de dependencias
Actualizar la navegación a nav compose
Se seguirá utilizando como base MVVM como arquitectura base
Se incluirá room pL persistencia de datos
