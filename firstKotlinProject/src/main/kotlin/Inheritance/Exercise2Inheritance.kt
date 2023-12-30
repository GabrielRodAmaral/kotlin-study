package Inheritance

/*
    Exercício

    Crie uma classe Device que representa um dispositivo que pode estar ligado ou desligado. Crie métodos para ligar
    e desligar esse dispositivo.

    Depois, crie as classes TV e Telephone, subclasses de Device e faça com que o comportamento ligar e desligar
    funcione para essas subclasses.
 */

fun main() {

    val tv = TV()
    val telephone = Telephone()

    tv.turnOn()
    tv.turnOn()
    tv.turnOff()

    telephone.turnOn()
    telephone.turnOff()
}

abstract class Device {

    var isOn: Boolean = false
        private set

    fun turnOn() {
        if (!isOn) {
            isOn = true
            println("O dispositivo foi ligado")
        } else {
            println("O dispositivo já está ligado")
        }
    }

    fun turnOff() {
        if (isOn) {
            isOn = false
            println("O dispositivo foi desligado")
        } else {
            println("O dispositivo já está desligado")
        }
    }
}

class TV: Device()

class Telephone: Device()