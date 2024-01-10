package polimorphism

fun main() {

    val d1: Dog = Dog()
    d1.run()
    d1.eat()

    /*
    Como d2 está declarado como um dog mas com o tipo Animal o método eat que será chamado é o que foi sobrescrito no Dog
    porém ele não tem acesso ao método run que foi criado direto na classe Dog
     */
    val d2: Animal = Dog()
    //d2.run()
    d2.eat()

    /*
    casting, criando uma variável com o d2 transformado em tipo Dog
     */
    val d3: Dog = d2 as Dog
    d3.run()
    d3.eat()

    /*
    uma outra forma de fazer
    devido ao smart cast dentro do if o d2 será um tipo Dog
     */
    if (d2 is Dog) {
        d2.run()
        d2.eat()
    }

}

abstract class Animal {

    open fun eat() {
        println("Comendo")
    }
}

class Dog : Animal() {

    fun run() {
        println("Correndo")
    }

    override fun eat() {
        println("Cachorro comendo")
    }
}

class Cat : Animal() {

    fun sleep() {
        println("Dormindo")
    }
}