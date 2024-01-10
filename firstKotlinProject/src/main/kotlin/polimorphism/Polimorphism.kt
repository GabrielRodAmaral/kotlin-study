package polimorphism

import javax.swing.tree.FixedHeightLayoutCache

fun main() {

    val c1: Drink = Coffe()

    c1.prepare()

    //

    val p1 = Programmer()
    val t1 = Teacher()

    p1.work()
    t1.work()

    /*
    Apesar dessa váriavel ser do tipo programer o que está sendo instânciado nela é um kotlin programmer então o
    método chamado será de KotlinProgrammer
     */
    val kp1: Programmer = KotlinProgrammer()
    kp1.work()


    // Sobrescrever propriedades de uma superclasse
    val square = Square()
    println(square.vertexNumber)

    val triangle = Triangle()
    println(triangle.vertexNumber)


    // Interfaces
    val tree = Tree("Green", 2.5)
    val tree2 = tree.clone()

    println(tree)
    println(tree2)

    /*
    Criando uma classe anônima (puxando método de uma interface)

    Uma classe anônima é uma classe sem nome declarado, normalmente utilizada quando só é necessário utilizar o objeto
    em um trecho do código
     */
    val vehicle = object: Vehicle {

        override fun drive() {
            println("Dirigindo")
        }
    }
    vehicle.drive()
}

open class Drink {

    /*
    Para fazer com que o método prepare tenha uma ação diferente em uma subclasse ele deve ser sobrescrito (override)
    para isso na superclasse o método deve ser declarado como open
     */
    open fun prepare() {
        println("Preparando Drink")
    }
}

class Coffe: Drink() {

    /*
    Na hora de sobrescrever (override) o método para alterar seu comportamento deve ser declarado que você está fazendo
    um override
     */
    override fun prepare() {
        println("Preparando Café")
        /*
        É possível além de mudar o comportamento de prepare na subclasse chamar o comportamento padrão do método na
        superclasse
         */
        super.prepare()
    }
}

// Métodos abstract
abstract class Employee() {

    /*
    Um método abstrato só pode ser declarado em uma classe abstrata, ele não possui implementação padrão então todas as
    classes que herdam ele devem fazer um override
     */
    abstract fun work()
}

open class Programmer: Employee() {

    override fun work() {
        println("Programador trabalhando")
    }
}

class Teacher: Employee() {

    override fun work() {
        println("Professor trabalhando")
    }
}

class KotlinProgrammer: Programmer() {

    override fun work() {
        println("Programador kotlin trabalhando")
    }
}

// Sobrescrever propriedades de uma superclasse

abstract class Shape() {
    open val vertexNumber: Int = 0
}

class Square: Shape() {

// Para sobrescrever uma propriedade utilizamos o override assim como com um método
    override val vertexNumber: Int = 4
}

// Sobrescrevendo direto no construtor
class Triangle(override val vertexNumber: Int = 3): Shape()


/*
    Criando uma interface invés de uma superclassse

    Interfaces não tem construtores

    Não posso criar um objeto que é uma interface, apenas objetos de classes que implementam uma inteface

    Uma classe pode implementar várias interfaces

    Utilizar interface invés de superclasse quando se vê necessário apenas herdar os métodos, onde não é necessário
    herdar propriedades
 */

interface Cloneable {

    /*
    Por padrão métodos não implementados de interfaces já são abstratos então não é necessário declaralo como
    abstract para sobrescrevelo
     */
    fun clone(): Any
}

data class Tree(val color: String, val height: Double): Cloneable {

    // Método Clone irá clonar uma nova árvore com as mesmas caracteristícas
    override fun clone(): Any {
        return (Tree(color, height))
    }
}

interface Vehicle {

    fun drive()
}