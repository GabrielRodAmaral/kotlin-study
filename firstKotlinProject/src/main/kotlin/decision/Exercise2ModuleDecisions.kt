package decision

/*
    Exercício

    Escreva um programa que receba um valor fornecido pelo teclado e diz se ele é par ou impar
 */

fun exerciseTwoDecisions() {

    print("Digite um número: ")
    val digitedNumber = readln().toInt()

    val type: String
    if (digitedNumber % 2 == 0) {
        type = "PAR"
    } else {
        type = "Ímpar"
    }

    print(type)
}