package decision

/*
    EXERCÍCIO

    Implemente uma calculadora capaz de executar 4 operações básicas  e que recebe dados
    via teclado;
    Três informações devem ser passadas: o primeiro operando, a operação matemática e o
    segundo operando.
    Por exemplo:
    > 20
    > +
    > 4
    > Resultado: 24
 */

fun main() {
    exerciseFourDecisions()
}

fun exerciseFourDecisions() {

    print("> ")
    val firstNumber = readln().toDouble()

    print("> ")
    val operation = readln()[0]

    print("> ")
    val secondNumber = readln().toDouble()

    val result = when (operation) {
        '+' -> firstNumber + secondNumber
        '-' -> firstNumber - secondNumber
        '*' -> firstNumber * secondNumber
        '%' -> firstNumber / secondNumber
        else -> 0
    }

    println("Resultado: $result")
}