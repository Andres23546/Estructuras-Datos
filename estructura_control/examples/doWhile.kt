// //haga un algoritmo que solicite el nombre de n cantidad de 
// personas que llegan a una clase, se permitira el ingreso hasta que el usuario decida, elm sistema debera mostrar al final la cantidad de personas qu llegar//
fun main(){
var resp="si"
var cont = 0
do{
   println("ingrese su nombre")
   var nombre= readLine().toString()
   print(" hola $nombre bienvenido a la clase ")
   cont++
   print(" Ingrese si si hay mas personas: ")
   resp=readLine().toString()

}while(resp=="si")
print(" llegaron $cont personas: ")
print(" fin del ciclo ")}
