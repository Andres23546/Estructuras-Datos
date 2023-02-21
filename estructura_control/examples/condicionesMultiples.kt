fun main() {
    println("Cual es tu nombre")
    val nombre= readLine().toString()
    println("ingresa la primer nota")
    val nota1= readLine()!!.toFloat()
    println("ingresa la segunda nota")
    val nota2= readLine()!!.toFloat()
    println("ingresa la tercer nota")
    val nota3= readLine()!!.toFloat()
    val promedio=(nota1+nota2+nota3)/3
    if(promedio>=3.5){
        println( nombre + "gano la materia, con un promedio de:" + promedio)
    }else if (promedio>2.0 && promedio <3.5){
        println(nombre + "perdio, pero puede recuperar, su promedio es de:" + promedio)
    }else{
        println(nombre + "perdio la materia sin recuperacion, su promedio es:" + promedio)
    }
} 