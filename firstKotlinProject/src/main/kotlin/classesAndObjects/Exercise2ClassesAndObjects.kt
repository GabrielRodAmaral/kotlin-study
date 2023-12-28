package classesAndObjects

/*
    Exercício

    Crie uma classe Person para representar uma pessoa. Uma pessoa pode andar e, toda vez que anda, ela anda 1000m de
    uma só vez. Ao percorrer 5000m, ela não consegue mais andar e só volta a andar se tomar água (depois disso ela pode
    andar mais 5000m).

    Crie um programa que símula a caminhada de uma pessoa durante determinado período, mostrando ao final qual foi a
    distância percorrida.

    Como bônus, experimente parametrizar a distância de 5000m até ela tomar água, o que vai permitir criar pessoas
    mais e menos resistentes à caminhada.
 */

fun main() {
    val person1 = Person()
    person1.walk()
    person1.walk()
    person1.walk()
    person1.walk()
    person1.walk()
    person1.drinkWater()
    person1.walk()
    person1.walk()
    println(person1.stop())

    val person2 = Person(2000)
    person2.walk()
    person2.walk()
    person2.drinkWater()
    person2.walk()
    println(person2.stop())

}