package variables

/*
    Exercício

    Crie um programa que arredonda um valor decimal informado pelo usuário e mostra a resposta na tela.
    O arredondamento pode ser feito truncando as casas decimais.
 */

fun exerciseTwoVariables() {

    print("Informe um valor decimal: ")
    val informedNumber = readln().toDouble()

    print("O valor inserido arredondado é ${informedNumber.toInt()}")
}