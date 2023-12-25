package functions

/*
    Exercício

    Escreva uma função que calcula a idade humana equivalente de um cachorro, considerando que cada ano que
    um cachorro vive corresponde a 7 anos de vida de um ser humano. O valor da idade deve ser fornecido via teclado.
 */

fun main() {
    print("Digite a idade do cachorro: ")
    val age = readln().toInt()

    val humanAge = exerciseOneFunctions(age)

    print("A idade do cachorro corresponde a $humanAge anos em um uma vida humana")
}
fun exerciseOneFunctions(age: Int): Int {
    return age * 7
}