Práctica de Campo - Programación Orientada a Objetos (POO)
Este repositorio contiene una colección de proyectos desarrollados como parte de la práctica de campo en el curso de Programación Orientada a Objetos. Cada carpeta representa un proyecto independiente que aborda diferentes conceptos y aplicaciones de la POO utilizando el lenguaje Java.

Estructura del Repositorio
A continuación, se describen las carpetas principales del repositorio y el propósito de cada una:

📁 PC1-S1 - Ejercicio de ejempplo Semana 1
📌 Descripción General
Este programa en Java permite registrar y listar carros utilizando programación orientada a objetos. Está compuesto por tres clases principales:

Carro: representa un carro con atributos públicos.
ControladorCarros: permite almacenar y mostrar una lista de carros.
Main: contiene el método principal para ejecutar el programa.

🚗 Clase Carro
Atributos públicos: marca, modelo, anio.
Constructor: Inicializa los valores del carro.
Método mostrarInformacion(): Imprime los datos del carro.

🧑‍💼 Clase ControladorCarro
Usa una ArrayList para almacenar carros.
agregarCarro(Carro): Agrega un carro a la lista.
listarCarros(): Muestra todos los carros registrados, o un mensaje si la lista está vacía.

🏁 Clase Main
Crea instancias de Carro y las agrega al ControladorCarro.
Llama a listarCarros() para mostrar la información en consola.

📁 PC2-S2 - Ejercicio de ejemplo Semana 2
Descripción General
Este programa en Java demuestra el uso del encapsulamiento en una clase Carro, permitiendo proteger los atributos y acceder/modificarlos de forma controlada mediante getters y setters.

🧱 Estructura del Programa
🚗 Clase Carro
Descripción: Representa un carro con atributos privados y métodos públicos para acceder o modificarlos.

🔐 Atributos (privados):
String marca
String modelo
int año

🛠️ Métodos:
Constructor: Inicializa los atributos del carro al crear una instancia.
Getters: Métodos para obtener los valores (getMarca(), getModelo(), getAño()).
Setters: Métodos para modificar los valores (setMarca(), setModelo(), setAño()).
mostrarDatos(): Imprime la información actual del carro en consola.

✅ Encapsulamiento aplicado: Los atributos son private, lo que impide su acceso directo desde fuera de la clase. En su lugar, se usan get y set.

🏁 Clase PracticaDeCampoS2Ejemplo (Main)
Descripción: Ejecuta el programa demostrando cómo se crean y modifican objetos de tipo Carro.

🧪 Lógica principal:
Se crea un carro con marca "Toyota", modelo "Corolla", y año 2020.
Se muestra su información con mostrarDatos().
Se cambian los valores usando los setters.
Se muestra la información actualizada del carro.

🎯 Objetivo del diseño
Enseñar buenas prácticas de programación con encapsulamiento.
Evitar acceso directo a atributos sensibles.
Separar la lógica de datos de la lógica de presentación.

📁 PC3-S3 - Ejercicio de ejemplo Semana 3
📌 Descripción General
Este programa muestra cómo usar la clase RegistrarDatos para registrar y acceder a los datos de una persona (nombre y edad). Los datos se gestionan a través de getters y setters, con encapsulamiento de los atributos.

🧱 Estructura del Programa
1. 🧑 Clase RegistrarDatos
Descripción: Representa los datos de una persona, con atributos privados y métodos públicos para gestionarlos.

🔐 Atributos (privados):
String nombre: Almacena el nombre de la persona.
int edad: Almacena la edad de la persona.

🛠️ Métodos:
Constructor: Se puede crear un objeto sin parámetros o con parámetros nombre y edad.
Getters:
getNombre(): Obtiene el nombre de la persona.
getEdad(): Obtiene la edad de la persona.
Setters:
setNombre(String nombre): Establece el nombre de la persona.
setEdad(int edad): Establece la edad de la persona.

2. 🏁 Clase Main (Uso de RegistrarDatos)
Descripción: En la clase Main, se crea un objeto de tipo RegistrarDatos y se gestionan los atributos utilizando los setters y getters.

🧪 Lógica principal:
Se crea un objeto RegistrarDatos sin parámetros.
Se establecen los valores de nombre y edad usando los setters.
Se muestran los datos utilizando los getters.
Se crea otro objeto RegistrarDatos con parámetros para inicializar los atributos directamente.
Se muestran los datos del nuevo objeto.

📁 PC4-S4 - Ejercicio de ejemplo Semana 4


📁 PC5-S5 - Ejercicio de ejemplo Semana 5
