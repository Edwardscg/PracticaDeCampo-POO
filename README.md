# Práctica de Campo - Programación Orientada a Objetos (POO)

Este repositorio contiene una colección de proyectos desarrollados como parte de la práctica de campo en el curso de Programación Orientada a Objetos. 

Cada carpeta representa un proyecto independiente que aborda diferentes conceptos y aplicaciones de la POO utilizando el lenguaje Java.

## ESTRUCTURA DEL REPOSITORIO

A continuación, se describen las carpetas principales del repositorio y el propósito de cada una:

### 📁 PC1-S1 - Ejercicio de ejemplo Semana 1

#### 📌 Descripción General

Este programa en Java permite registrar y listar carros está compuesto por tres clases principales:

- **Carro**: representa un carro con atributos públicos.
- **ControladorCarros**: permite almacenar y mostrar una lista de carros.
- **Main**: contiene el método principal para ejecutar el programa.

#### 🚗 Clase Carro

- **Atributos públicos**: marca, modelo, año
- **Constructor**: Inicializa los valores del carro.
- **Método mostrarInformacion()**: Imprime los datos del carro.

#### 🧑‍💼 Clase ControladorCarro

- Usa una `ArrayList` para almacenar carros.
- **agregarCarro(Carro)**: Agrega un carro a la lista.
- **listarCarros()**: Muestra todos los carros registrados, o un mensaje si la lista está vacía.

#### 🏁 Clase Main

- Crea instancias de Carro y las agrega al ControladorCarro.
- Llama a `listarCarros()` para mostrar la información en consola.

---

### 📁 PC2-S2 - Ejercicio de ejemplo Semana 2

#### Descripción General

Este programa en Java demuestra el uso del encapsulamiento en una clase Carro, permitiendo proteger los atributos y acceder/modificarlos de forma controlada mediante getters y setters.

#### 🧱 Estructura del Programa

#### 🚗 Clase Carro

- **Descripción**: Representa un carro con atributos privados y métodos públicos para acceder o modificarlos.
- **Atributos (privados)**:
  - `String marca`
  - `String modelo`
  - `int año`
- **Métodos**:
  - **Constructor**: Inicializa los atributos del carro al crear una instancia.
  - **Getters**: Métodos para obtener los valores (`getMarca()`, `getModelo()`, `getAño()`).
  - **Setters**: Métodos para modificar los valores (`setMarca()`, `setModelo()`, `setAño()`).
  - **mostrarDatos()**: Imprime la información actual del carro en consola.
- **Encapsulamiento aplicado**: Los atributos son `private`, lo que impide su acceso directo desde fuera de la clase. En su lugar, se usan get y set.

#### 🏁 Clase PracticaDeCampoS2Ejemplo (Main)

- **Descripción**: Ejecuta el programa demostrando cómo se crean y modifican objetos de tipo Carro.
- **Lógica principal**:
  - Se crea un carro con marca "Toyota", modelo "Corolla", y año 2020.
  - Se muestra su información con `mostrarDatos()`.
  - Se cambian los valores usando los setters.
  - Se muestra la información actualizada del carro.

#### 🎯 Objetivo del diseño

- Enseñar buenas prácticas de programación con encapsulamiento.
- Evitar acceso directo a atributos sensibles.
- Separar la lógica de datos de la lógica de presentación.

---

### 📁 PC3-S3 - Ejercicio de ejemplo Semana 3

#### 📌 Descripción General

Este programa muestra cómo usar la clase RegistrarDatos para registrar y acceder a los datos de una persona (nombre y edad). Los datos se gestionan a través de getters y setters, con encapsulamiento de los atributos.

#### 🧱 Estructura del Programa

1. 🧑 **Clase RegistrarDatos**

   - **Descripción**: Representa los datos de una persona, con atributos privados y métodos públicos para gestionarlos.
   - **Atributos (privados)**:
     - `String nombre`: Almacena el nombre de la persona.
     - `int edad`: Almacena la edad de la persona.
   - **Métodos**:
     - **Constructor**: Se puede crear un objeto sin parámetros o con parámetros nombre y edad.
     - **Getters**:
       - `getNombre()`: Obtiene el nombre de la persona.
       - `getEdad()`: Obtiene la edad de la persona.
     - **Setters**:
       - `setNombre(String nombre)`: Establece el nombre de la persona.
       - `setEdad(int edad)`: Establece la edad de la persona.

3. 🏁 **Clase Main (Uso de RegistrarDatos)**

   - **Descripción**: En la clase Main, se crea un objeto de tipo RegistrarDatos y se gestionan los atributos utilizando los setters y getters.
   - **Lógica principal**:
     - Se crea un objeto RegistrarDatos sin parámetros.
     - Se establecen los valores de nombre y edad usando los setters.
     - Se muestran los datos utilizando los getters.
     - Se crea otro objeto RegistrarDatos con parámetros para inicializar los atributos directamente.
     - Se muestran los datos del nuevo objeto.

---

### 📁 PC4-S4 - Ejercicio de ejemplo Semana 4

#### 📌 Descripción General

Este programa en Java permite gestionar el registro de libros y usuarios, así como realizar préstamos y devoluciones de libros. Está compuesto por cuatro clases principales que encapsulan la lógica del sistema:

- **Libro**: Representa un libro con sus datos y estado de disponibilidad.
- **Usuario**: Representa un usuario que puede prestar o devolver libros.
- **Biblioteca**: Controla la lógica de almacenamiento, préstamo y devolución de libros.
- **Main**: Contiene el menú de opciones para interactuar con el sistema.

---

#### 🧱 Estructura del Programa

1. 📚 **Clase Libro**

   - **Descripción**: Representa un libro con atributos relacionados a su identificación, autor y estado de disponibilidad.
   - **Atributos (privados)**:
     - `int id_libro`: Identificador del libro.
     - `String titulo`: Título del libro.
     - `String autor`: Autor del libro.
     - `boolean disponibilidad`: Estado de préstamo (disponible o no).
   - **Métodos**:
     - **Constructor**: Inicializa los atributos y establece la disponibilidad como `true` por defecto.
     - **Getters y Setters**: Para acceder y modificar todos los atributos.
     - `toString()`: Devuelve una representación en texto del libro.

2. 👤 **Clase Usuario**

   - **Descripción**: Representa a un usuario que puede prestar o devolver libros.
   - **Atributos (privados)**:
     - `int id_user`: Identificador del usuario.
     - `String nombre_user`: Nombre del usuario.
     - `ArrayList<Libro> lista_libros_prestados`: Lista de libros que el usuario ha prestado.
   - **Métodos**:
     - `prestarLibro(Libro libro)`: Añade un libro a la lista de libros prestados.
     - `devolverLibro(Libro libro)`: Remueve un libro de la lista de libros prestados.
     - **Getters y Setters**: Para acceder y modificar los atributos.
     - `toString()`: Devuelve una representación textual del usuario.

3. 🏛️ **Clase Biblioteca**

   - **Descripción**: Gestiona el almacenamiento, préstamo y devolución de libros.
   - **Atributos**:
     - `ArrayList<Libro> listaLibros`: Lista de todos los libros registrados.
     - `ArrayList<Usuario> listaUsuarios`: Lista de todos los usuarios registrados.
   - **Métodos**:
     - `registrarLibro(Libro libro)`: Añade un libro a la biblioteca.
     - `registrarUsuario(Usuario usuario)`: Registra un nuevo usuario.
     - `prestarLibro(String titulo, Usuario usuario)`: Presta un libro disponible a un usuario.
     - `devolverLibro(String titulo, Usuario usuario)`: Permite que un usuario devuelva un libro.
     - `librosDisponibles()`: Muestra los libros disponibles.
     - `librosPrestadosPorUsuario()`: Muestra los libros que tiene cada usuario.

4. 🖥️ **Clase Main**

   - **Descripción**: Permite la interacción con el sistema mediante un menú de consola.
   - **Lógica principal**:
     - Presenta un menú para registrar libros, registrar usuarios, prestar libros, devolver libros y visualizar los datos registrados.
     - Utiliza la clase `Scanner` para la entrada de datos.
     - Crea nuevas instancias de `Libro` y `Usuario` en cada registro.

### 📁 PC5-S5 - Ejercicio de ejemplo Semana 5

#### CASO 1

##### 📌 Descripción General

Este programa demuestra el uso de sobrecarga de métodos en Java mediante una clase `CalculadoraSobrecargada` que realiza operaciones de suma con distintos tipos y cantidades de parámetros (enteros y decimales).

#### 🧱 Estructura del Programa

- **Clase CalculadoraSobrecargada**: Contiene varios métodos `sumar()` con distintas firmas, ilustrando el principio de sobrecarga de métodos.
- **Sobrecarga de Métodos**:
  - `int sumar(int a, int b)`
  - `double sumar(double a, double b)`
  - `int sumar(int a, int b, int c)`
  - `double sumar(double a, double b, double c)`
  - `int sumar(int a, int b, int c, int d)`
  - `double sumar(double a, double b, double c, double d)`

##### 🏁 Clase PracticaDeCampoS5EjemploSobrecarga (Main)

- **Descripción**: Crea un objeto de `CalculadoraSobrecargada` y llama a los distintos métodos `sumar()` con diversos tipos y cantidades de argumentos.
- **Lógica principal**:
  - Se realizan y muestran sumas con 2, 3 y 4 números enteros o decimales.
  - Se utiliza `System.out.println` para mostrar los resultados en consola.

#### CASO 2

##### 📌 Descripción General

Este programa muestra cómo capturar y manejar excepciones en dos situaciones comunes:

- Lectura de un archivo de texto desde el sistema.
- Ingreso de datos numéricos por teclado y una posible división entre cero.

#### 🧱 Estructura del Programa

- **Lectura de archivo con manejo de excepciones**: Intenta abrir y leer línea por línea un archivo llamado `wasa.txt`. Captura excepciones si el archivo no existe o si ocurre un error de lectura.
  - **Excepciones controladas**:
    - `FileNotFoundException`: Si el archivo no se encuentra.
    - `IOException`: Si ocurre un error al leer el archivo.
  - **Lógica**:
    - Se usa `BufferedReader` junto con `FileReader`.
    - Se imprime cada línea del archivo en consola.
    - Mensajes personalizados indican si el archivo no se encontró o si hubo error de lectura.

- **Ingreso de datos y manejo de errores de división**: Solicita dos números al usuario y realiza una división. Maneja errores comunes como división por cero o ingreso de tipos no numéricos.
  - **Excepciones controladas**:
    - `ArithmeticException`: División entre cero.
    - `InputMismatchException`: Ingreso de texto u otro tipo inválido en lugar de números.
  - **Lógica**:
    - Uso de `Scanner` para capturar números desde consola.
    - Muestra un mensaje adecuado para cada tipo de error.

#### CASO 3

##### 📌 Descripción General

Este programa demuestra cómo manejar una colección (`ArrayList`) de objetos personalizados (de tipo `Persona`) en Java. Se muestran operaciones básicas como agregar, modificar, iterar y visualizar elementos.

#### 🧱 Estructura del Programa

- **Clase Persona**:
  - **Descripción**: Representa una persona con atributos `dni` y `nombre`. Incluye métodos de acceso, modificación, visualización y conversión a texto.
  - **Atributos (privados)**:
    - `String dni`
    - `String nombre`
  - **Métodos**:
    - **Constructores**: vacío y con parámetros.
    - **Getters y setters**: `getDni()`, `getNombre()`, `setDni()`, `setNombre()`
    - **verDatos()**: imprime los datos en consola.
    - **toString()**: devuelve una representación textual del objeto.

  **Nota**: En `verDatos()` y `toString()` falta un espacio entre "DNI: " y "Nombre:", lo cual hace que el texto se imprima pegado.

##### 🗂 Clase PracticaDeCampoS5EjemploColeccion (Main)

- **Descripción**: Utiliza un `ArrayList` para almacenar y modificar objetos `Persona`.
- **Lógica principal**:
  - Se crean 3 objetos `Persona`.
  - Se agregan dos a la lista.
  - Se reemplaza el segundo elemento con un nuevo objeto.
  - Se imprime la lista completa:
    - Usando `System.out.println(lista)` (invoca `toString()`).
    - Recorriendo con bucle `for-each` y método `verDatos()`.
    - Recorriendo con bucle `for` tradicional y `get()`.

#### CASO 4

##### 📌 Descripción General

Este programa permite registrar datos de asistentes a un evento, validando correctamente sus entradas (tipo y número de documento, edad, etc.) y clasificándolos por edad en categorías: Niño, Adolescente o Adulto.

#### 🧱 Estructura del Programa

- **Clase Asistente**:
  - **Atributos**:
    - `tipoDocumento` (DNI o Carnet de Extranjería)
    - `numeroDocumento`
    - `apellidoPaterno`, `apellidoMaterno`, `nombre`
    - `celular`, `correo`, `edad`
    - `categoria` (calculada según la edad)
  - **Métodos importantes**:
    - **Setters con validación**:
      - `setTipoDocumento()` → solo acepta “DNI” o “Carnet de Extranjería”.
      - `setNumeroDocumento()` → valida longitud según el tipo.
      - `setEdad()` → solo acepta valores entre 1 y 100.
      - `categorizarPorEdad()` → asigna una categoría según la edad.
      - `verAsistente()` → imprime todos los datos del asistente.

  **Observación**: Falta espacio entre los textos concatenados en `verAsistente()`, lo que dificulta la lectura.

- **Clase AsistenteControlador**:
  - **Responsabilidad**: Administra una lista de objetos `Asistente`.
  - **Métodos**:
    - `agregarAsistente(Asistente a)` → añade a la lista.
    - `listarAsistentes()` → muestra a todos los registrados.

##### 🧪 Clase EjercicioAsistente (main)

- **Funcionalidad**:
  - Usa `Scanner` para capturar datos del usuario.
  - Controla la entrada con bucles y validaciones.
  - Clasifica la edad del asistente automáticamente.
  - Permite el registro de múltiples asistentes con confirmación.

  **Flujo**:
  - Solicita los datos y valida campos obligatorios.
  - Aplica `categorizarPorEdad()` según la edad.
  - Permite seguir agregando o detenerse.
  - Imprime la lista total de asistentes registrados.

---
