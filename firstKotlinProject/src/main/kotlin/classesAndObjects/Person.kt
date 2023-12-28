package classesAndObjects

class Person(private val initDistanceToWater: Int = 5000) {

    private var distance: Int = 0
    private var distanceToWater: Int = initDistanceToWater

    fun walk(){
        if (distanceToWater > 0) {
            distance += 1000
            distanceToWater -= 1000
        }
    }

    fun drinkWater() {
        distanceToWater = initDistanceToWater
    }

    fun stop(): Int {
        return distance
    }
}