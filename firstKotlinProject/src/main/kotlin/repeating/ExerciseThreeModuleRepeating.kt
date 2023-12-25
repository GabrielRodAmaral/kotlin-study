package repeating

import kotlin.random.Random


/*
    Exercício

    Crie um jogo de adivinhação numérica. O computador deve sortear um número aleatório dentro de um intevalo
    e você deve tentar descobri-lo. A cada tentativa, o programa diz se o número é maior ou menor que o número tentado.
    O jogo acaba quando o número tentado for o número correto.
 */

fun main() {
    exerciseThreeRepeating()
}

fun exerciseThreeRepeating() {

    // Sempre vai gerar o número desde o primeiro colocado até um antes do segundo
    val secret = Random.nextInt(0, 101)

    var playing: Boolean = true
    while (playing) {
        print("Adivinhe o número: ")
        val number = readln().toInt()

        when {
            number < secret -> println("O número secreto é maior")
            number > secret -> println("O número secreto é menor")
            else -> {print("PARABÉNS, o número era $secret"); playing = false}
        }
    }
}