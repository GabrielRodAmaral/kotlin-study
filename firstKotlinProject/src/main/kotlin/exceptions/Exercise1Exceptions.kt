package exceptions

/*
    Exercício

    Escreva uma função que divide dois números. Se for uma divisão por 0, a função deve retornar 0 como resultado.
    Os parâmetros e o retorno do método devem ser todos do tipo Int.
 */

fun main() {

    print("Digite o primeiro número: ")
    val n1 = readln().toInt()

    println()

    print("Digite o segundo número: ")
    val n2 = readln().toInt()

    val result = try {
        n1 / n2
    } catch (e: RuntimeException) {
        0
    }
    println(result)
}