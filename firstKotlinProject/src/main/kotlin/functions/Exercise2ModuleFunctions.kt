package functions

import java.lang.StringBuilder

/*
    Exercício

    Escreva uma função que separa todos os caracteres de uma String com um espaço em branco. Esta função também deve
    receber um parâmetro opcional indicando se a String deve ser convertida para maiúscula.
 */

fun main() {
    println(spacing("Hello"))
    println(spacing("Hello", true))
}

fun spacing(text: String, upperCase: Boolean = false): String {
    var result = ""

    // fazendo isso no for o kotlin pega cada um dos caracteres em text e o chama de i na ordem do for
    for (i in text) {
    result += "$i "
    }

    // .trim para cortar fora os espaços em branco das pontas
    result = result.trim()

    if (upperCase) {
        result = result.uppercase()
    }

    return result
}

// Uma forma mais otimizada de fazer esse código é com o StringBuilder do java.lang e melhorando a forma do return
fun spacingSB(text: String, upperCase: Boolean = false): String {
    val result = StringBuilder()

    for (i in text) {
        result.append("$i ")
    }

    val res = result.toString()

    return if (upperCase) {
        res.uppercase()
    } else {
        return res
    }
}