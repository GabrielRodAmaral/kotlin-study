package decision

/*
    Exercício

    Escreva um programa que, com base em uma idade fornecida, classifica a pessoa nos grupos
    abaixo:

    - CRIANÇA: 0 a 12 anos
    - ADOLESCENTE: 13 a 17 anos
    - ADULTO: 18 a 65 anos
    - SÊNIOR: 65 ou mais
 */

fun exerciseThreeDecisions() {

    print("Digite uma idade: ")
    val age = readln().toInt()

    val group: String
    if (age < 0) {
        group = "Idade Inválida"
    } else if (age <= 12) {
        group = "CRIANÇA"
    } else if (age <= 17) {
        group = "ADOLESCENTE"
    } else if (age <= 65) {
        group = "ADULTO"
    } else {
        group = "SÊNIOR"
    }

    print(group)
}