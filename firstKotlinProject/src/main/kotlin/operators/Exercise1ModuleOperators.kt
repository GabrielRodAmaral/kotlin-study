package operators

/*
    Exercício

    Encontre o resultado da seguinte expressão

    (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
 */

fun main() {
    exerciseOneOperators()
}

fun exerciseOneOperators() {
    val result = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
    // (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
    // (5 + 3) * 2 < 30 / 2 || T
    // 8 * 2 < 30 / 2 || T
    // 16 < 30 / 2 || T
    // 16 < 15 || T
    // F || T
    // T
    println("""
        O resultado da expressão
        (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
        SERÁ TRUE
        considerando a ordem de prioridade dos operadores
        => $result
    """.trimIndent())
}