fun main() { 
    //crear
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    
    //agregar
    solarSystem.add("Pluto")
    //acceder
    println(solarSystem.contains("Pluto"))
    //modificar
   solarSystem.remove("Venus")
   //recorrer
   for (planet in solarSystem) {
    println(planet)
}


}