package repeating

/*
    Exercício

    Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário
 */

fun main() {
    exerciseOneRepeating()
}

fun exerciseOneRepeating() {

    print("Digite o número que deseja ver a tabuada: ")

    val number = readln().toInt()

    var i = 1
    while (i <= 10) {
        println("$number X $i = ${number * i}")
        i++
    }
}