package repeating

/*
    Exercício

    Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário.
    Utilize a estrutura de repetição for para resolver o exercício
 */

fun exerciseTwoRepeating() {

    print("Digite o número que deseja saber a tabuada: ")

    val number = readln().toInt()

    for (i in 1 until 11) {
        println("$number * $i = ${number * i}")
    }
}