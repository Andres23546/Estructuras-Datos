fun main(){
    //crear
    val Semana= arrayOf<String>("lunes","martes","miercoles","jueves","viernes","sabado","domingo")
    //acceder
    println(Semana[0])
    //cambiar
    Semana[6]="festivo"
    println(Semana[6])
    //iterar
    for (i in Semana.indices) {
        println("[ $i,  ${Semana[i]}]")
    }
}