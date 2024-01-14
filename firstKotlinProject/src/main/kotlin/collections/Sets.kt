package collections

import java.util.*

fun main() {

    /*
    Conjuntos funcionam de forma parecida com as listas

    Um set não pode possuir elementos repetidos, se eu colocar várias vezes o número 4 em s1 por exemplo ele irá
    descartar os duplicados

   s3 é um hashSet, ele não possui o link de ordem entre os elementos igual o setOf e o mutableSetOf, então os elementos
   podem não ficar na mesma ordem que foram inseridos
     */
    val s1 = setOf(1, 2, 3, 4, 4, 4, 4, 5)
    val s2 = mutableSetOf("A", "B", "C", "D")
    val s3 = hashSetOf("1A, 10B, 3C")

    s1.forEach {print("$it ")}
    println()
    s3.forEach {print("$it ")}
    println()

    /*
    Na coleção dogs abaixo o primeiro e o segundo cachorro não são considerados pelo kotlin como duplicados porque
    eles foram construidos separadamente e apesar de ter o mesmo name eles tem hashCode diferentes, então se desejamos
    que cachorros com nomes iguais sejam considerados a mesma coisa na aplicação pelo equals() devemos, sobrescrever o
    hashCode e o equals na classe

    Se a classe Dog for uma data class esse problema não acontece, porque a data class faz automaticamente a implementação
    do toString, do equals e do hashCode

    Se possível utilizar sempre o data class
     */
    val dogs = setOf(
            Dog("D1"),
            Dog("D1"),
            Dog("D2"),
            Dog("D3"),
            Dog("D4")
    )
    println(dogs)

    /*
    Transformando uma coleção imutável em uma lista mutável

    É possível criar um outro conjunto usando o toMutableSet() em s4 que já é um conjunto mutável, isso serviria para criar
    uma cópia do conjunto
     */
    val s4 = s1.toMutableSet()
    val s5 = s4.toMutableSet()

    /*
    É possível no momento da criação do conjunto ordenar os itens com sortedSetOf()

    É possível ordenar de forma decrescente como em s7

    O padrão do Comparator do sortedSetOf é o naturalOrder

    Como a classe Dog não herda de comparable para ordenar os dogs devemos fornecer um Comparator

    Também é possível usar .toSortedSet() para transformar um setOf
     */
    val s6 = sortedSetOf(1, 0, 4, 2, 3, 8)
    println(s6)
    val s7 = sortedSetOf(Comparator.reverseOrder(), 1, 0, 4, 2, 3, 8)
    println(s7)

    val dogs2 = sortedSetOf(
            Comparator.comparing {d: Dog -> d.name}.reversed(),
            Dog("D3"),
            Dog("D4"),
            Dog("D2"),
            Dog("D1")
    )
    println(dogs2)
}

//class Dog (private val name: String) {
//    override fun toString() = "Dog($name), hashCode=${hashCode()}"
//
//    /*
//    Utilizando o Objects do java podemos implementar essa lógica para sobrescrever o hashCode dos obejtos dessa classe
//
//    também devemos sobrescrever o equals para considerar cachorros que tem o mesmo nome como iguais
//     */
//    override fun hashCode(): Int {
//        return Objects.hash(name)
//    }
//
//    override fun equals(other: Any?): Boolean {
//        return if (other is Dog) {
//            this.name == other.name
//        } else {
//            false
//        }
//    }
//}

data class Dog (val name: String) {
    override fun toString() = "Dog($name), hashCode=${hashCode()}"
}