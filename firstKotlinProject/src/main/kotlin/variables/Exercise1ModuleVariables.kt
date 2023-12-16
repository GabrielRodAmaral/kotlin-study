package variables

import java.util.*

/*
    EXERCÍCIO

    Solicite 3 informações ao usuário: nome, idade e peso. Depois imprima uma frase que contenha essas
    informações (use string templates para montar a frase).
 */

fun exerciseOneVariables() {
    print("Informe o seu nome: ")
    val userName = readln()

    print("Informe a sua idade: ")
    val userAge = readln().toInt()

    val scanner = Scanner(System.`in`)
    print("Informe o seu peso: ")
    val userWeight = scanner.nextDouble()
    // Fiz esse com scanner apenas para praticar

    println("""
        | O seu nome é $userName,
        |  A sua idade é $userAge,
        |   O seu peso é $userWeight.
    """.trimMargin())
}