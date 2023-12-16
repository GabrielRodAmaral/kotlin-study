package operators

fun firstOperators() {

    // soma
    println(10 + 5)

    //subtração
    println(12 - 7)

    //multiplicação
    println(15 * 2)

    //Divisão
    println(15 / 3)

    //Modulo (resto)
    println(14 % 3)

    // Se eu fizer operações com variaveis do mesmo tipo o resultado será do tipo das mesmas, por exemplo
    // se eu fizer uma divisão com 2 int o resultado será int
    // se fizer operação com variáveis de tipos diferentes o resultado será do tipo mais abrangente por exemplo
    // se for uma operação entre int e double o resultado será double
}

fun relationalOperators() {

    // Retornam true or false

    // ==
    println(10 == 10)

    // !=
    println(10 != 7)

    // >
    println(5 > 2)

    // <
    println(5 < 2)

    // >=
    println(5 >= 5)

    // <=
    println(5 <= 5)
}

fun logicalOperators() {

    // AND  (tabela verdade)
    println("T AND T ${true && true}")
    println("T AND F ${true && false}")
    println("F AND T ${false && true}")
    println("F AND F ${false && false}")

    println()

    // OR  (tabela verdade)
    println("T AND T ${true || true}")
    println("T AND F ${true || false}")
    println("F AND T ${false || true}")
    println("F AND F ${false || false}")

    println()

    // NOT  (tabela verdade)
    println("NOT F ${!true}")
    println("NOT T ${!false}")
}

//Operadores de atribuição
fun assignmentOperators() {

    // =
    var x = 5

    x += 2 // x = x + 2
    println(x)

    x *= 2 // x = x * 2
    println(x)

    x -= 2 // x = x - 2
    println(x)

    x /= 3 // x = x / 3
    println(x)

    x++ // x = x + 1
    println(x)

    x-- // x = x - 1
    println(x)
}

// Operadores de pré e pós incremento
fun incDecOperators() {

    var x = 8

    //Pós incremento (primeiro lê e depois incrementa)
    x++
    println(x)

    //pré incremento (primeiro incrementa e depois lê)
    ++x
    println(x)
}

// Precedência de operadores
fun precedenceOperators() {
    // Ordem operadores matemáticos
    val exp = 5 + 4 - 3 * 2 * (1+1) / 3

    // 5 + 4 - 3 * 2 * 2 / 3
    // 5 + 4 - 6 * 2 / 3
    // 5 + 4 - 12 / 3
    // 5 + 4 - 4
    // 9 - 4
    // 5

    println(exp)

    // Operadores lógicos
    // ordem sem parenteses (not, and, or)
    // é uma boa prática sempre usar parenteses
    val exp2 = true && true || true && !false

    // T && F || T && T
    // F || T
    // T

    println(exp2)
}