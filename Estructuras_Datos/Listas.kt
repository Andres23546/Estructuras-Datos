fun main() {
//crear lista
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//  acceder
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
//  agregar elementos
    solarSystem.add(4, "Theia")
// quitar elementos
    solarSystem.removeAt(0)
//iterar
    for (planet in solarSystem) {
     println(planet)}
}
