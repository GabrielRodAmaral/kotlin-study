package Inheritance

fun main() {

//  Isso já é uma herança da classe Animal
//  (comentado porque Animal se tornou uma classe abstrata, não pode ser instânciada diretamente)
//    val animal = Animal("Preto")

    /*
    Métodos como .toString() são herdados de Any, Any é a superclasse de todas as classes do kotlin, todas as classes
    herdam de any
     */

    val dog1 = Dog("Branco")

    val cat1 = Cat("Preto")

    dog1.bark()
    cat1.meow()

    dog1.eat()
    cat1.eat("Peixe")

    /*
    Operador is verifica se algo é de um tipo e retorna um boolean
     */
    println(dog1 is Dog)
    println(dog1 is Animal)

    /*
    É possivel colocar o valor de dog1 em uma variável do tipo Animal porque Dog é um Animal
     */
    var x: Animal = dog1

    val p1 = Person("Gabriel", "Amaral", 21)
    val p2 = Person("Gabriel", "Amaral", 21)

    /*
    Se a classe Person não fosse uma data class o resultado desses prints seria:
    Inheritance.Person@3941a79c
    Inheritance.Person@506e1b77
    false
    Sendo uma data class obtemos:
    Person(firstName=Gabriel, lastName=Amaral, age=21)
    Person(firstName=Gabriel, lastName=Amaral, age=21)
    true

     */
    println(p1)
    println(p2)
    println(p1 == p2)

    /*
    Com uma data class é possível utilizar o método copy

    Se o copy for chamado sem nenhum parâmetro ele irá criar uma cópia identica a passada, porém é possivel passar
    como parâmetro as informações que você deseja altera, no exemplo abaixo eu faço uma cópia de p2 mudando apenas a
    idade

    Você só pode usar no copy as informações que forem passadas pra classe no construtor
     */
    val p3 = p2.copy(age = 22)
    println(p3)

}

/*
    Criando uma data class, uma classe que serve para armazenar dados

    uma data class tem que ter no mínimo um construtor primário
 */
 data class Person(val firstName: String, val lastName: String, val age: Int)