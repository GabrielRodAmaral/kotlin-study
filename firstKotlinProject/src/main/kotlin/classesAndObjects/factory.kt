package classesAndObjects

// Dessa forma em vez de instanciar cada objeto na main eu delego isso para Factory instanciar os objetos que eu quero
// criar e também posso utilizar nesse exemplo o instanceCount para saber quantos carros já foram criados

fun main() {

    val car1 = Factory.newCar()
    val car2 = Factory.newCar()

    println(Factory.instanceCount)
}

object Factory {
    var instanceCount = 0

    fun newCar(): Car {
        instanceCount++
        return Car()
    }
}

class Car