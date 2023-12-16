package decision

/*
    Exercício

    Escreva um programa que receba um valor númerico pelo teclado, multiplicando
    por ele mesmo e imprime o resultado.
    Entretando, se o valor for maior que 10, ele deve ser ajustado para 10 antes
    de ser multiplicado
 */

fun exerciseOneDecisions() {

    print("Digite um número: ")

    var digitedNumber = readln().toInt()

    if (digitedNumber > 10) {
        digitedNumber = 10
    }

    digitedNumber *= digitedNumber
    println("""
        O número que você digitou multiplicado por ele mesmo
        é igual a ${digitedNumber}
    """.trimIndent())
}