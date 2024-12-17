// Ejercicio 1.2.1
//
// Escribe un programa que pida el nombre del usuario para luego darle la bienvenida.
//
// Escribe tu nombre: Juan
// Hola, Juan.

fun pedir_nombre(msj: String = "Introduce tu nombre: ") : String {
    println(msj)
    val nombre: String = readln()
    return nombre
}

fun mostrar_saludo(nombre: String = "world"): String { // valor por defecto
    return "Hola, $nombre."
}

fun main() {

    val nombre = pedir_nombre()
    val saludo = mostrar_saludo(nombre)

    println(saludo)
}