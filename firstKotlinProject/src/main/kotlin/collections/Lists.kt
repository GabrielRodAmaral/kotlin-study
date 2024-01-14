package collections

fun main() {

    /*
    Criando uma lista, se você declara os elementos não é necessário declarar o tipo da lista

    Criando uma emptyList você deve passar o tipo da lista, você pode passar o tipo a direita de emptyList ou a direita
    do nome da variável

    Esses tipos de listas são listar imutáveis então não é possivel chamar o método .add() por exemplo

    l3 é um exemplo de como criar uma lista mutável

    método add, passando apenas um parâmetro você adiciona o valor a ultima posição da lista, porém se você passar a
    posição e depois o valor você adiciona o valor na posição desejada

    l4 é uma lista not null, se tiver algum valor nulo na lista ele será ignorado
     */
    val l1 = listOf<Int>(1, 2, 3, 4, 5)
    val l2: List<Int> = emptyList()
    val l3 = mutableListOf(1, 2, 3 ,4)
    val l4 = listOfNotNull(1, 2, 3, 4, null, 5)

    l3.add(10)
    l3.add(2, 15)
    l3.forEach {print("$it ")}
    println()
    l4.forEach {print("$it ")}

    /*
    Transformando uma lista imutável em uma lista mutável

    É possível criar uma outra lista usando o toMutableSet() em l5 que já é uma lista mutável, isso serviria para criar
    uma cópia da lista
     */
    val l5 = l1.toMutableList()
    val l6 = l5.toMutableList()
}