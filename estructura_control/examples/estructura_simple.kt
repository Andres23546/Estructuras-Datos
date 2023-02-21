//juan quiere saber si gano la materia de matematicas teniendo 3 notas 
fun main(){
    println("Ingrese la primer nota")
    var nota1=readLine()!!.toFloat()
    println("Ingrese la segunda nota")
    var nota2=readLine()!!.toFloat()
    println("Ingrese la tercer nota")
    var nota3=readLine()!!.toFloat()
    var promedio=(nota1+nota2+nota3)/3
    if(promedio>=3.0){
        println("juan gano la materia")
    }
    print(promedio)

}