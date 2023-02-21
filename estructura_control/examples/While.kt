//haga un algoritmo que solicite el nombre de n cantidad de personas 
//y imprima un saludo el usuario ingresara la cantidad de personas a saludar
fun main() {
    println("Cuantas personas desea saludar: ")
    val cantidadP=readLine()!!.toInt()
    var contador=1
    while(contador<=cantidadP){
        print("Ingrese el nombre $contador")
        val nombre= readLine().toString()
        print("Hola $nombre !Bienvenido! ")
        contador++
    }
    } 