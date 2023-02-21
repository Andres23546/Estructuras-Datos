//cree un algoritmo que lea un numero y determine si este es divisible entre 11
fun main(){
    print("Ingrese la cantidad de numeros: ")
    val cantidad=readLine()!!.toInt()

    for (i in 1..cantidad) {
        print("ingrese un numero: ")
        var numeros= readLine()!!.toInt()
        if (numeros %11 == 0){
            println("el numero es divisible")
        }else{
            println("el numero no es divisible")
        }

    }
}