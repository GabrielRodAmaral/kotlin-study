package collectionLambda

/*
    Exercício

    A partir de uma lista de números distintos, crie um mapa que mapeia o número ao seu sucessor. Imprima o resultado
    na tela de forma que os números estejam ordenados em ordem crescente.
 */

fun main() {

    val numbers = listOf(1, 10, 15, 8, 9)

    numbers
            .associateWith {it + 1}
            .forEach {(k, v) -> println("$k => $v")}
}