Duoc UC

 Autor del Proyecto

Nombre completo: Joaquin Antonio Gonzalez Quezada

Asignatura: DESARROLLO ORIENTADO A OBJETOS

Carrera: Analista Programador Computacional

Sede: Campus Virtual



 Descripción general del sistema
 

Este proyecto corresponde al trabajo formativo de la semana 6.

El sistema fue desarrollado para la empresa Llanquihue Tour, con el objetivo de gestionar distintos servicios turísticos mediante una aplicación en Java.

Se implementó una jerarquía de clases utilizando Programación Orientada a Objetos, aplicando conceptos como herencia, encapsulamiento y sobrescritura del método toString().

Estructura general del proyecto

src/


├── model/   → Clases del proyecto 

├── data/    → Clase GestorServicios (creación de objetos)

├── ui/      → Clase Main (ejecución del programa)


 Clases implementadas
 
 
ServicioTuristico


Clase que representa un servicio turístico con los atributos:

nombre

duracionHoras

RutaGastronomica


Hereda de ServicioTuristico:

numeroDeParadas

PaseoLacustre


Hereda de ServicioTuristico:

tipoEmbarcacion

ExcursionCultural


Hereda de ServicioTuristico:

lugarHistorico

GestorServicios


Main


Clase principal encargada de ejecutar el programa.


 Instrucciones para ejecutar el proyecto
 

Clonar el repositorio desde GitHub:


git clone https://github.com/TU-USUARIO/LlanquihueTourApp.git

Abrir el proyecto

Ejecutar la clase

Observar los resultados en consola.

🔗 Repositorio GitHub

https://github.com/TU-USUARIO/LlanquihueTourApp

© Duoc UC | Escuela de Informática y Telecomunicaciones
