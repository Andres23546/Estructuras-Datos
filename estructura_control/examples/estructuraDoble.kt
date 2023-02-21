fun main() {
     println("ingrese su nombre")
     val nombre= readLine().toString()
     val nota1=3.0
     val nota2=2.0
     val nota3=3.5
     val promedio=(nota1+nota2+nota3)/3
     if(promedio>=3.5){
        println(nombre + "gano la materia" + promedio)
     }else{
        println(nombre + "perdio la materia" +promedio)
     }

} 