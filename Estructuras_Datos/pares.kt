fun main(){

    val miPar = Pair("hola", 123)
    val miCadena = miPar.first // acceder a pares, miCadena será "hola"
    val miEntero = miPar.second // acceder a pares, miEntero será 123
    for ((valor1, valor2) in listOf(miPar)) {
    println("Valor 1: $valor1")
    println("Valor 2: $valor2")
}
}