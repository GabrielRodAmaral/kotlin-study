package operators

/*
    Exercício

    Encontre o resultado da seguinte expressão:

    !(2 * 4 >= 16 / 2 && 5 == 4 + 1)
 */

fun exerciseTwoOperators() {
    val result = !(2 * 4 >= 16 / 2 && 5 == 4 + 1)

    // !(2 * 4 >= 16 / 2 && 5 == 4 + 1)
    // !(8 >= 8 && 5 == 4 + 1)
    // !(8 >= 8 && 5 == 5)
    // !(T && T)
    // !(T)
    // F
    println("""
        O resultado da expressão
        !(2 * 4 >= 16 / 2 && 5 == 4 + 1)
        SERÁ FALSE
        considerando a ordem de prioridade dos operadores
        => $result
    """.trimIndent())
}