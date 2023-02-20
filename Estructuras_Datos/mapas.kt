fun main() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3) // creación de un mapa 

    println(map["a"]) // acceso al valor asociado a la clave "a"
    println(map.getOrDefault("d", 0)) // acceso al valor asociado a la clave "d", pero si no existe se retorna un valor por defecto de 0
    val mapa = mutableMapOf("a" to 1, "b" to 2)
    mapa.put("c", 3) // Agrega un nuevo elemento 
    mapa.put("b", 3) // Actualiza el valor asociado a la clave "b" a 3
    mapa.remove("b") // Elimina el elemento con la clave "b" del mapa

    for ((clave, valor) in mapa) {
    println("$clave -> $valor")//recorrer un mapa
    }
    }